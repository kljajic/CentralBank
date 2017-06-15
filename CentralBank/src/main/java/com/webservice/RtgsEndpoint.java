package com.webservice;

import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.model.Bank;
import com.model.RtgsRequestResponse;
import com.service.BankService;
import com.service.Mt103Service;
import com.service.Mt900Service;
import com.service.Mt910Service;
import com.service.RtgsRequestResponseService;
import com.xsdschemas.rtgsrequest.Mt103Request;
import com.xsdschemas.rtgsresponseoriginator.Mt900Response;
import com.xsdschemas.rtgsresponsereciever.Mt910Response;

@Endpoint
public class RtgsEndpoint {
	
	private static final String NAMESPACE_URI = "http://com/xsdSchemas/rtgsRequest";
	
	@Autowired
	private BankService bankService;
	
	@Autowired
	private Mt900Service mt900Service;
	
	@Autowired
	private Mt910Service mt910Service;
	
	@Autowired
	private Mt103Service mt103Service;
	
	@Autowired
	private RtgsRequestResponseService rtgsRequestResponseService;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "mt103Request")
	@ResponsePayload
	public Mt900Response getRtgsResponse(@RequestPayload Mt103Request request) {
		
		System.out.println("Usao");
		Mt900Response mt900 = new Mt900Response();
		mt900.setMessageId(request.getMessageId() + "Req");
		mt900.setOriginatorBankSwiftCode(request.getOriginatorBankSwiftCode());
		mt900.setOriginatorBankTransactionAccount(request.getOriginatorBankTransactionAccount());
		mt900.setRequestMessageId("MT103");
		mt900.setCurrencyDate(request.getCurrencyDate());
		mt900.setAmount(request.getAmount());
		mt900.setCurrency(request.getCurrency());
		mt900.setCurrencyDateDatabase(mt900.getCurrencyDate().toGregorianCalendar().getTime());
		
		Mt910Response mt910 = new Mt910Response();
		
		mt910.setMessageId(request.getMessageId() + "Resp");
		mt910.setRecieverBankSwiftCode(request.getRecieverBankSwiftCode());
		mt910.setRecieverBankTransactionAccount(request.getRecieverBankTransactionAccount());
		mt910.setRequestMessageId("MT103");
		mt910.setCurrencyDate(request.getCurrencyDate());
		mt910.setAmount(request.getAmount());
		mt910.setCurrency(request.getCurrency());
		mt910.setCurrencyDateDatabase(mt910.getCurrencyDate().toGregorianCalendar().getTime());
		
		RtgsRequestResponse rtgsRequestResponse = new RtgsRequestResponse();
		rtgsRequestResponse.setMt103Request(request);
		rtgsRequestResponse.setMt900Response(mt900);
		rtgsRequestResponse.setMt910Response(mt910);
		
		Bank bankOriginator = bankService.findByTransactionAccountNumber(request.getOriginatorBankTransactionAccount().substring(0, 3));
		Bank bankReciever = bankService.findByTransactionAccountNumber(request.getRecieverBankTransactionAccount().substring(0, 3));
		
		System.out.println(bankOriginator.getName());
		System.out.println(bankReciever.getName());
		
		rtgsRequestResponse.setOriginatorBank(bankOriginator);
		rtgsRequestResponse.setRecieverBank(bankReciever);
		
		request.setDateStatementDate(request.getStatementDate().toGregorianCalendar().getTime());
		request.setDateCurrencyDate(request.getCurrencyDate().toGregorianCalendar().getTime());
		
		mt900Service.save(mt900);
		mt910Service.save(mt910);
		mt103Service.save(request);
		rtgsRequestResponseService.save(rtgsRequestResponse);
		
		return mt900;
	}
}
