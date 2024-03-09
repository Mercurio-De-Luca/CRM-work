package com.CRMwork.back.security.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MezzoRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Mezzo run...");
		
	}
}
