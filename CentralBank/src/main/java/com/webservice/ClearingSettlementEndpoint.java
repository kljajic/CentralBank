package com.webservice;

import java.io.IOException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.XmlMappingException;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.model.Bank;
import com.service.BankService;
import com.webservice.client.BankClientMt102;
import com.webservice.client.BankClientMt910;
import com.xsdschemas.clearingandsettlement.Mt102Request;
import com.xsdschemas.rtgsresponseoriginator.Mt900Response;
import com.xsdschemas.rtgsresponsereciever.Mt910Response;

@Endpoint
public class ClearingSettlementEndpoint {

	private static final String NAMESPACE_URI = "http://com/xsdSchemas/clearingAndSettlement";
	
	private final BankService bankService;
	private final BankClientMt910 bankClientMt910;
	private final BankClientMt102 bankClientMt102;
	
	@Autowired
	public ClearingSettlementEndpoint(BankService bankService, BankClientMt910 bankClientMt910,BankClientMt102 bankClientMt102) {
		this.bankService = bankService;
		this.bankClientMt910 = bankClientMt910;
		this.bankClientMt102 = bankClientMt102;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "mt102Request")
	@ResponsePayload
	public Mt900Response stackingClearing(@RequestPayload Mt102Request request) {
		
		Bank originatorBank = bankService.findByTransactionAccountNumber(request.getOriginatorBankTransactionAccount().substring(0, 3));
		Bank recieverBank = bankService.findByTransactionAccountNumber(request.getRecieverBankTransactionAccount().substring(0, 3));
		originatorBank.setNetoAmount(originatorBank.getNetoAmount() - request.getAmount().doubleValue());
		recieverBank.setNetoAmount(recieverBank.getNetoAmount() + request.getAmount().doubleValue());
		bankService.save(originatorBank);
		bankService.save(recieverBank);
		
		Mt900Response mt900Response = this.mapToMt900Response(request);
		Mt910Response mt910Response = this.mapToMt910Response(request);
		
		try {
			bankClientMt910.sendM910Response(mt910Response, recieverBank.getMt910Service());
			bankClientMt102.sendMt102Response(request, recieverBank.getMt102Service());
		} catch (XmlMappingException | IOException e) {
			e.printStackTrace();
		}
	
		return mt900Response;
	}
	
	private Mt900Response mapToMt900Response(Mt102Request request){
		Mt900Response mt900Response = new Mt900Response();
		mt900Response.setAmount(request.getAmount());
		mt900Response.setCurrency(request.getCurrency());
		mt900Response.setCurrencyDate(request.getCurrencyDate());
		mt900Response.setCurrencyDateDatabase(new Date());
		mt900Response.setMessageId("mt900response");
		mt900Response.setOriginatorBankSwiftCode(request.getOriginatorBankSwiftCode());
		mt900Response.setOriginatorBankTransactionAccount(request.getOriginatorBankTransactionAccount());
		mt900Response.setRequestMessageId("mt102Request");
		return mt900Response;
	}
	
	private Mt910Response mapToMt910Response(Mt102Request request){
		Mt910Response mt910Response = new Mt910Response();
		mt910Response.setAmount(request.getAmount());
		mt910Response.setCurrency(request.getCurrency());
		mt910Response.setCurrencyDate(request.getCurrencyDate());
		mt910Response.setCurrencyDateDatabase(new Date());
		mt910Response.setMessageId("mt900response");
		mt910Response.setRecieverBankSwiftCode(request.getRecieverBankSwiftCode());
		mt910Response.setRecieverBankTransactionAccount(request.getRecieverBankTransactionAccount());
		mt910Response.setRequestMessageId("mt102Request");
		return mt910Response;
	}

}
