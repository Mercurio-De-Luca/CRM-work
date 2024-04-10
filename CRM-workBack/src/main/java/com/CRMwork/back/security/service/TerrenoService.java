package com.CRMwork.back.security.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.CRMwork.back.security.entity.Terreno;
import com.CRMwork.back.security.repository.ITerrenoRepository;

@Service
public class TerrenoService {

	@Autowired ITerrenoRepository repo;
	
	@Autowired @Qualifier("terrenoBean") private ObjectProvider<Terreno> terreno;
	
	public Terreno creaTerreno(double dimensione, String indirizzo, String tipoTerreno, double prezzoAcquisto, double prezzoVendita, boolean inVendita, String tipoDiCulturaPiantata) {
		Terreno t = terreno.getObject();
		
		return t.builder()
				.dimensione(dimensione)
				.indirizzo(indirizzo)
				.tipoTerreno(tipoTerreno)
				.prezzoAcquisto(prezzoAcquisto)
				.prezzoVendita(prezzoVendita)
				.inVendita(inVendita)
				.tipoDiCulturaPiantata(tipoDiCulturaPiantata)
				.build();
	}
	
	public Terreno saveTerreno(Terreno t) {
		return repo.save(t);
	}
	
}
