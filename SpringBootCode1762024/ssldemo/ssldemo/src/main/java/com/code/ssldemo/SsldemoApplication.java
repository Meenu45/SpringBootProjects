package com.code.ssldemo;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;

import static org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory.DEFAULT_PROTOCOL;

@SpringBootApplication
public class SsldemoApplication {
//	private final Connector connector;
//
//	public SsldemoApplication(Connector connector) {
//		this.connector = connector;
//	}

	public static void main(String[] args) {
		SpringApplication.run(SsldemoApplication.class, args);}

		private Connector connector(){
		Connector connector = new Connector(DEFAULT_PROTOCOL);
		connector.setPort(8080);
		connector.setSecure(false);
		connector.setScheme("http");
		return connector;
	}
		@Bean
	    public ServletWebServerFactory servletWebServerFactory(){
		TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
		factory.addAdditionalTomcatConnectors(connector());
		return factory;
	}
}
