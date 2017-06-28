package com.webservice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.webservice.client.BankClientMt102;
import com.webservice.client.BankClientMt103;
import com.webservice.client.BankClientMt910;
import com.xsdschemas.rtgsrequest.Mt103Request;
import com.xsdschemas.rtgsresponsereciever.Mt910Response;

@Configuration
public class BankConfig {
	
	@Bean
	@Qualifier("marshallerForMt103")
	public Jaxb2Marshaller marshallerForMt103() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.xsdschemas.rtgsrequest");
		System.out.println(marshaller.supports(Mt103Request.class));
		return marshaller;
	}
	
	@Bean
	@Qualifier("marshallerForMt910")
	public Jaxb2Marshaller marshallerForMt910() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.xsdschemas.rtgsresponsereciever");
		System.out.println(marshaller.supports(Mt910Response.class));
		return marshaller;
	}
	
	@Bean
	@Qualifier("marshallerForMt102")
	public Jaxb2Marshaller marshallerForMt102() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.xsdschemas.clearingandsettlement");
		System.out.println(marshaller.supports(Mt910Response.class));
		return marshaller;
	}

	@Bean
	public BankClientMt103 bankClientMt103(@Qualifier("marshallerForMt103") Jaxb2Marshaller marshallerForMt103) {
		BankClientMt103 client = new BankClientMt103();
		client.setMarshaller(marshallerForMt103);
		client.setUnmarshaller(marshallerForMt103);
		return client;
	}
	
	@Bean
	public BankClientMt910 bankClientMt910(@Qualifier("marshallerForMt910") Jaxb2Marshaller marshallerForMt910) {
		BankClientMt910 client = new BankClientMt910();
		client.setMarshaller(marshallerForMt910);
		client.setUnmarshaller(marshallerForMt910);
		return client;
	}
	
	@Bean
	public BankClientMt102 bankClientMt102(@Qualifier("marshallerForMt102") Jaxb2Marshaller marshallerForMt102) {
		BankClientMt102 client = new BankClientMt102();
		client.setMarshaller(marshallerForMt102);
		client.setUnmarshaller(marshallerForMt102);
		return client;
	}

}
