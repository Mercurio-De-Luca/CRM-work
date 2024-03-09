package com.CRMwork.back.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.CRMwork.back.security.entity.Mezzo;

@Configuration
public class MezzoConfiguration {

	@Bean("mezzoBean")
	@Scope("prototype")
	public Mezzo customPrenotazione() {
		return new Mezzo();
	}
}
