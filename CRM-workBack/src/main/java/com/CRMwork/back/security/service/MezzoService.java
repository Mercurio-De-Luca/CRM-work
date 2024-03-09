package com.CRMwork.back.security.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.CRMwork.back.security.entity.EMezzo;
import com.CRMwork.back.security.entity.Mezzo;
import com.CRMwork.back.security.repository.IMezzoRepository;

@Service
public class MezzoService {

	@Autowired IMezzoRepository repo;
	
	@Autowired @Qualifier("mezzoBean") private ObjectProvider<Mezzo> mezzoBean;
	
	
	public Mezzo createMezzo(EMezzo tipoMezzo, String targa, String modello, String marca, double prezzoAcquisto, int anno) {
		Mezzo m = mezzoBean.getObject();
		
		return m.builder()
				.tipoMezzo(tipoMezzo)
				.targa(targa)
				.modello(modello)
				.marca(marca)
				.prezzoAcquisto(prezzoAcquisto)
				.anno(anno)
				.build();	
	}
	
	public Mezzo saveMezzo(Mezzo m) {
		return repo.save(m);
	}
}
