package com.CRMwork.back.security.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.CRMwork.back.security.entity.EMezzo;
import com.CRMwork.back.security.entity.Mezzo;
import com.CRMwork.back.security.service.MezzoService;

@Component
public class MezzoRunner implements CommandLineRunner {

	@Autowired MezzoService ms;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Mezzo run...");
		
		
//		Mezzo m = ms.createMezzo(EMezzo.AUTO, "EC 123 MP", "Golf", "Volswaken", 5200.00, 2010);
//		
//		ms.saveMezzo(m);
	}
}
