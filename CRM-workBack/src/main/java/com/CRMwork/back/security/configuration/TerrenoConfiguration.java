package com.CRMwork.back.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.CRMwork.back.security.entity.Terreno;

@Configuration
public class TerrenoConfiguration {

	@Bean("terrenoBean")
	@Scope("prototype")
	public Terreno customPrenotazione() {
		return new Terreno();
	}
}
