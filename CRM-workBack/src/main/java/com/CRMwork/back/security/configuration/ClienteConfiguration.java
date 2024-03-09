package com.CRMwork.back.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.CRMwork.back.security.entity.Cliente;


@Configuration
public class ClienteConfiguration {

	@Bean("clienteBean")
	@Scope("prototype")
	public Cliente customPrenotazione() {
		return new Cliente();
	}
}
