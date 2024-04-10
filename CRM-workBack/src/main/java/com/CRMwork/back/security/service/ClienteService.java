package com.CRMwork.back.security.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.CRMwork.back.security.entity.Cliente;
import com.CRMwork.back.security.repository.IClienteRepository;


@Service
public class ClienteService {
	
	@Autowired IClienteRepository repo;
	
	@Autowired @Qualifier("clienteBean") private ObjectProvider<Cliente> clienteBean;

	
	public Cliente creaCliente(String nome,
			String cognome, 
			String citta, 
			String dataDiNascita, 
			String email, String partitaIva, String numeroCellulare, String indirizzo) {
		Cliente c = clienteBean.getObject();
		
		return c.builder()
				.nome(nome)
				.cognome(cognome)
				.citta(citta)
				.dataDiNascita(dataDiNascita)
				.email(email)
				.partitaIva(partitaIva)
				.numeroCellulare(numeroCellulare)
				.indirizzo(indirizzo)
				.build();
		
	}
	
	public Cliente saveCliente(Cliente c) {
		return repo.save(c);
	}
}
