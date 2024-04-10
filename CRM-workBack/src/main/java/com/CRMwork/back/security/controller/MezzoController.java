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

import com.CRMwork.back.security.entity.Mezzo;
import com.CRMwork.back.security.service.MezzoService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/client/mezzo")
public class MezzoController {

	@Autowired MezzoService ms;
	
	@PostMapping("/crea")
	@PreAuthorize("isAuthenticated()")
	public ResponseEntity<?> saveMezzo(@RequestBody Mezzo m){
		Mezzo resp = ms.saveMezzo(m);
		return new ResponseEntity<Mezzo>(resp, HttpStatus.CREATED);
	}
}
