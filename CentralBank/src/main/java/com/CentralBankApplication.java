package com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.config.SSLCertificateValidation;

@SpringBootApplication
public class CentralBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralBankApplication.class, args);
	}
	
	@Bean
	CommandLineRunner lookup() {
		return args -> {
			SSLCertificateValidation.disable();
		};
	}
	
}
