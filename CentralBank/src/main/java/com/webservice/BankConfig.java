package com.webservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.webservice.client.BankClient;

@Configuration
public class BankConfig {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setPackagesToScan("com.xsdschemas");
		return marshaller;
	}

	@Bean
	public BankClient bankClient(Jaxb2Marshaller marshaller) {
		BankClient client = new BankClient();
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
