package com.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.service.Mt102Service;
import com.xsdschemas.clearingandsettlement.Mt102Request;

@Endpoint
public class ClearingSettlementEndpoint {

	private static final String NAMESPACE_URI = "http://com/xsdSchemas/clearingAndSettlement";
	
	@Autowired
	private Mt102Service mt102Service;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "mt102Request")
	@ResponsePayload
	public void stackingClearing(@RequestPayload Mt102Request request) {
		System.out.println("stackingClearing");
		mt102Service.save(request);
	}
	
}
