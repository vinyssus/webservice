package com.projet.microserviceBank.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.projet.microserviceBank.web.SpringJaxRxApi;

@Configuration
public class MyConfig {

	@Bean
	public ResourceConfig resourceConfig() {
		
		ResourceConfig jerseyServlet = new ResourceConfig();
		jerseyServlet.register(SpringJaxRxApi.class);
		return jerseyServlet;
	}
}
