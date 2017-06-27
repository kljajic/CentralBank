package com.webservice.client;

import java.io.IOException;

import org.springframework.oxm.XmlMappingException;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.xsdschemas.rtgsrequest.Mt103Request;

public class BankClientMt103 extends WebServiceGatewaySupport {
	
	public boolean getRtgsResponseBack(Mt103Request mt103, String servicePath) throws XmlMappingException, IOException {
		
		Mt103Request mt103confirm = (Mt103Request) getWebServiceTemplate()
				.marshalSendAndReceive(servicePath,
						mt103, new SoapActionCallback("http://com/xsdSchemas/rtgsRequest/mt103"));
		
		return true;
	}
	
}
