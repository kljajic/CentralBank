package com.webservice.client;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.transform.stream.StreamResult;

import org.springframework.oxm.XmlMappingException;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.xsdschemas.rtgsresponsereciever.Mt910Response;

public class BankClientMt910 extends WebServiceGatewaySupport {

	public boolean getRtgsResponseBack(Mt910Response mt910, String servicePath)
			throws XmlMappingException, IOException {
		
		final StringWriter out = new StringWriter();
		getWebServiceTemplate().getMarshaller().marshal(mt910, new StreamResult(out));
		String xml = out.toString();
		
		System.out.println(xml);
		
		Mt910Response mt910confirm = (Mt910Response) getWebServiceTemplate().marshalSendAndReceive(
				servicePath, mt910,
				new SoapActionCallback("http://com/xsdSchemas/rtgsResponseReciever/mt910"));

		return true;
	}
}
