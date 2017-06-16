package com.webservice.client;

import java.io.IOException;

import org.springframework.oxm.XmlMappingException;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.xsdschemas.rtgsrequest.Mt103Request;
import com.xsdschemas.rtgsresponsereciever.Mt910Response;

public class BankClient extends WebServiceGatewaySupport {

	public boolean getRtgsResponse(Mt103Request mt103, Mt910Response mt910) throws XmlMappingException, IOException {

		System.out.println("BANKCLIENT");
		boolean response103 = (boolean) getWebServiceTemplate()
				.marshalSendAndReceive("http://localhost:8090/ws/rtgsRequestResponseService",
						mt103);
		
		
		boolean response910 = (boolean) getWebServiceTemplate()
				.marshalSendAndReceive("http://localhost:8090/ws/mt910ResponseService",
						mt910);
		
		return true;
	}
	
}
