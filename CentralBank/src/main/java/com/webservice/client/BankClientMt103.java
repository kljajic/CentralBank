package com.webservice.client;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.transform.stream.StreamResult;

import org.springframework.oxm.XmlMappingException;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.xsdschemas.rtgsrequest.Mt103Request;

public class BankClientMt103 extends WebServiceGatewaySupport {
	
	public boolean getRtgsResponseBack(Mt103Request mt103, String servicePath) throws XmlMappingException, IOException {
		
		final StringWriter out = new StringWriter();
		getWebServiceTemplate().getMarshaller().marshal(mt103, new StreamResult(out));
		String xml = out.toString();
		
		System.out.println(xml);
		
		Mt103Request mt103confirm = (Mt103Request) getWebServiceTemplate()
				.marshalSendAndReceive(servicePath,
						mt103, new SoapActionCallback("http://com/xsdSchemas/rtgsRequest/mt103"));
		
		return true;
	}
	
}
