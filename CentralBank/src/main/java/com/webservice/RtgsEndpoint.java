package com.webservice;

import java.math.BigDecimal;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.xsdschemas.rtgsrequest.Mt103Request;
import com.xsdschemas.rtgsresponseoriginator.Mt900Response;

@Endpoint
public class RtgsEndpoint {
	
	private static final String NAMESPACE_URI = "http://com/xsdSchemas/rtgsRequest";
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "mt103Request")
	@ResponsePayload
	public Mt900Response getRtgsResponse(@RequestPayload Mt103Request request) {
		System.out.println("konj");
		Mt900Response mt = new Mt900Response();
		mt.setAmount(new BigDecimal(400));
		
		return mt;
	}
}
