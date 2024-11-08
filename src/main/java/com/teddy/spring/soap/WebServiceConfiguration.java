package com.teddy.spring.soap;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class WebServiceConfiguration extends WsConfigurerAdapter {
	
	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<>(servlet, "/teddy/*");
	}
	
	@Bean
	public XsdSchema scoreSchema() {
		return new SimpleXsdSchema(new ClassPathResource("score.xsd"));
	}

	@Bean(name = "score")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema scoreSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("ScorePort");
		wsdl11Definition.setLocationUri("/teddy");
		wsdl11Definition.setTargetNamespace("http://soap.jee.mcnz.com/");
		wsdl11Definition.setSchema(scoreSchema());
		return wsdl11Definition;
	}
}
