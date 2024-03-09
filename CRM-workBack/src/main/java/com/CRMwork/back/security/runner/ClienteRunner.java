package com.CRMwork.back.security.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.CRMwork.back.security.entity.Cliente;
import com.CRMwork.back.security.service.ClienteService;


@Component
public class ClienteRunner implements CommandLineRunner {

	@Autowired ClienteService cs;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Cliente run...");
		
		//creo un cliente e lo provo a salvare nel db
		//Cliente c1 = cs.creaCliente("Matteo", "Verdi", "Casalvecchio di Puglia", "15/06/1989", "m.verdi@gmail.com", "1565485798544", "3895894478", "Via Vomero");
		
		//cs.saveCliente(c1);
	}

}
