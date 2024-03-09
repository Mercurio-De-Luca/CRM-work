package com.CRMwork.back.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.CRMwork.back.security.entity.LavoroContoterzo;

@Configuration
public class LavoroContoterzoConfiguration {

	@Bean("lavoroContoterzoBean")
	@Scope("prototype")
	public LavoroContoterzo customPrenotazione() {
		return new LavoroContoterzo();
	}
}
