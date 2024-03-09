package com.CRMwork.back.security.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.CRMwork.back.security.entity.Cliente;
import com.CRMwork.back.security.entity.ETipoLavoro;
import com.CRMwork.back.security.entity.LavoroContoterzo;
import com.CRMwork.back.security.repository.ILavoroContoterzoRepository;

@Service
public class LavoroContoterzoService {

	@Autowired ILavoroContoterzoRepository repo;
	
	@Autowired @Qualifier("lavoroContoterzoBean") private ObjectProvider<LavoroContoterzo> lavoroContoterzoBean;
	
	public LavoroContoterzo creaLavoro(Cliente cliente, ETipoLavoro tipoLavoro, String data, String oraInzio, String oraFine, String dimensioniTerreno, double costo) {
		LavoroContoterzo l = lavoroContoterzoBean.getObject();
		
		return l.builder()
				.cliente(cliente)
				.tipoLavoro(tipoLavoro)
				.data(data)
				.oraInzio(oraInzio)
				.oraFine(oraFine)
				.dimensioniTerreno(dimensioniTerreno)
				.costo(costo)
				.build();
	}
	
	public LavoroContoterzo saveLavoro (LavoroContoterzo l) {
		return repo.save(l);
	}
}
