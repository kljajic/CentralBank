package com.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig {
	
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		return new ServletRegistrationBean(servlet, "/ws/*");
	}

	@Bean(name = "centralBankRtgsRequestService")
	public DefaultWsdl11Definition rtgsRequestWsdl11Definition(@Qualifier("rtgsRequest") XsdSchema rtgsRequest) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("SchemaPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setSchema(rtgsRequest);
		return wsdl11Definition;
	}
	
	@Bean(name = "centralBankRtgsResponseService")
	public DefaultWsdl11Definition rtgsResponseWsdl11Definition(@Qualifier("responseOriginator") XsdSchema responseOriginator) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("SchemaPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setSchema(responseOriginator);
		return wsdl11Definition;
	}
	
	@Bean(name = "centralBankClearingService")
	public DefaultWsdl11Definition clearingRequestWsdl11Definition(@Qualifier("clearingAndSettlement") XsdSchema clearingAndSettlement) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("SchemaPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setSchema(clearingAndSettlement);
		return wsdl11Definition;
	}
	
	@Bean
	@Qualifier("clearingAndSettlement")
	public XsdSchema clearingAndSettlement() {
		return new SimpleXsdSchema(new ClassPathResource("xsd/types/clearingAndSettlement.xsd"));
	}
	
	
	@Bean
	@Qualifier("clearingAndSettlementItem")
	public XsdSchema clearingAndSettlementItem() {
		return new SimpleXsdSchema(new ClassPathResource("xsd/types/clearingAndSettlementItem.xsd"));
	}
	
	
	@Bean
	@Qualifier("responseOriginator")
	public XsdSchema responseOriginator() {
		return new SimpleXsdSchema(new ClassPathResource("xsd/types/responseOriginator.xsd"));
	}
	
	@Bean
	@Qualifier("responseReciever")
	public XsdSchema responseReciever() {
		return new SimpleXsdSchema(new ClassPathResource("xsd/types/responseReciever.xsd"));
	}
	
	@Bean
	@Qualifier("rtgsRequest")
	public XsdSchema rtgsRequest() {
		return new SimpleXsdSchema(new ClassPathResource("xsd/types/rtgsRequest.xsd"));
	}
	
	@Bean
	@Qualifier("statement")
	public XsdSchema statement() {
		return new SimpleXsdSchema(new ClassPathResource("xsd/types/statement.xsd"));
	}
	
	@Bean
	@Qualifier("types")
	public XsdSchema types() {
		return new SimpleXsdSchema(new ClassPathResource("xsd/types/types.xsd"));
	}
}
