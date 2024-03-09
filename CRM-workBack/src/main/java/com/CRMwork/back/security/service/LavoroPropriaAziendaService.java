package com.CRMwork.back.security.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.CRMwork.back.security.entity.ETipoLavoro;
import com.CRMwork.back.security.entity.LavoroPropriaAzienda;
import com.CRMwork.back.security.repository.ILavoroPropriaAziendaRepository;

@Service
public class LavoroPropriaAziendaService {

	@Autowired ILavoroPropriaAziendaRepository repo;
	
	@Autowired @Qualifier("lavoroPropriaAziendaBean") private ObjectProvider<LavoroPropriaAzienda> LavoroPropriaAziendaBean;
	
	public LavoroPropriaAzienda creaLavoro(ETipoLavoro tipoLavoro, String data, String oraInzio, String oraFine, String dimensioniTerreno) {
		LavoroPropriaAzienda l = LavoroPropriaAziendaBean.getObject();
		
		return l.builder()
				.tipoLavoro(tipoLavoro)
				.data(data)
				.oraInzio(oraInzio)
				.oraFine(oraFine)
				.dimensioniTerreno(dimensioniTerreno)
				.build();
	}
	
	public LavoroPropriaAzienda saveLavoro(LavoroPropriaAzienda l) {
		return repo.save(l);
	}
	
}
