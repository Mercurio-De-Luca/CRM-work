package com.CRMwork.back.security.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.CRMwork.back.security.entity.Terreno;
import com.CRMwork.back.security.service.TerrenoService;

@Component
public class TerrenoRunner implements CommandLineRunner {

	@Autowired TerrenoService ts;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Terreno run...");
		
//		Terreno t1 = ts.creaTerreno(1000.00, "Contrada Caprareccia", "Agricolo", 10000.00, 7000.00, false, "Grano");
//		
//		ts.saveTerreno(t1);
	}
}
