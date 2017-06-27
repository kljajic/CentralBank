package com.webservice.client;

import java.io.IOException;

import org.springframework.oxm.XmlMappingException;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.xsdschemas.clearingandsettlement.Mt102Request;
import com.xsdschemas.rtgsresponsereciever.Mt910Response;

public class BankClientMt910 extends WebServiceGatewaySupport {

	public boolean sendM910Response(Mt910Response mt910, String servicePath)
			throws XmlMappingException, IOException {
		
		Mt910Response mt910confirm = (Mt910Response) getWebServiceTemplate().marshalSendAndReceive(
				servicePath, mt910,
				new SoapActionCallback("http://com/xsdSchemas/rtgsResponseReciever/mt910"));

		return true;
	}
	
	public void sendMt102Response(Mt102Request request, String servicePath)
			throws XmlMappingException, IOException {
		getWebServiceTemplate().marshalSendAndReceive(
				servicePath, request);
	}
	
}
