package com.CRMwork.back.security.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.CRMwork.back.security.entity.Cliente;
import com.CRMwork.back.security.entity.ETipoLavoro;
import com.CRMwork.back.security.entity.LavoroContoterzo;
import com.CRMwork.back.security.service.ClienteService;
import com.CRMwork.back.security.service.LavoroContoterzoService;

import jakarta.transaction.Transactional;

@Component
public class LavoroContoterzoRunner implements CommandLineRunner {

//	@Autowired LavoroContoterzoService lcs;
//	
//	@Autowired ClienteService cs;
	
//	@Transactional
	@Override
	public void run(String... args) throws Exception {
		System.out.println("LavoroContoterzo run...");
		
		//testo LavoroContoterzo
		
//		Cliente c2 = cs.creaCliente("Giovanni", "Gialli", "Lucera", "5/12/1989", "g.gialli@gmail.com", "15658978958544", "3895634478", "Via Fontana");
//		
//		cs.saveCliente(c2);
//		LavoroContoterzo l1 = lcs.creaLavoro(c2, ETipoLavoro.SEMINA, "12/11/2023", "07:00", "10:00", "1 versura", 75.00);
//		
//		lcs.saveLavoro(l1);
	}
}
