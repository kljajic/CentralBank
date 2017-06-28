package com.webservice.client;

import java.io.IOException;

import org.springframework.oxm.XmlMappingException;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.xsdschemas.clearingandsettlement.Mt102Request;

public class BankClientMt102 extends WebServiceGatewaySupport {

	
	public void sendMt102Response(Mt102Request request, String servicePath)
			throws XmlMappingException, IOException {
		getWebServiceTemplate().marshalSendAndReceive(
				servicePath, request);
	}
}
