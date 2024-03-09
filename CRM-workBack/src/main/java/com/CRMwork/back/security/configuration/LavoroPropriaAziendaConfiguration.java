package com.CRMwork.back.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.CRMwork.back.security.entity.LavoroPropriaAzienda;

@Configuration
public class LavoroPropriaAziendaConfiguration {

	@Bean("lavoroPropriaAziendaBean")
	@Scope("prototype")
	public LavoroPropriaAzienda customPrenotazione() {
		return new LavoroPropriaAzienda();
	}
	
}
