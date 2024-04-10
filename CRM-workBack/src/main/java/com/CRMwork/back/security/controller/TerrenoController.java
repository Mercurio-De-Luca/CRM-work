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

import com.CRMwork.back.security.entity.Terreno;
import com.CRMwork.back.security.service.TerrenoService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/client/terreno")
public class TerrenoController {

	@Autowired TerrenoService ts;
	
	@PostMapping("/crea")
	@PreAuthorize("isAuthenticated()")
	public ResponseEntity<?> saveTerreno(@RequestBody Terreno t){
		Terreno resp = ts.saveTerreno(t);
		return new ResponseEntity<Terreno>(resp, HttpStatus.CREATED);
	}
	
}
