package com.CRMwork.back.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRMwork.back.security.entity.Cliente;
import com.CRMwork.back.security.service.ClienteService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/client")
public class ClienteController {

	@Autowired ClienteService cs;
	
	@PostMapping("/crea")
	@PreAuthorize("isAuthenticated()")
	public ResponseEntity<?> saveCliente(@RequestBody Cliente c){
		Cliente resp = cs.saveCliente(c);
		return new ResponseEntity<Cliente>(resp, HttpStatus.CREATED);
	}
}
