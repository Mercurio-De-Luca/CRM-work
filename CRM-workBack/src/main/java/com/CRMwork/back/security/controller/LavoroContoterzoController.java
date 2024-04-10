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

import com.CRMwork.back.security.entity.LavoroContoterzo;
import com.CRMwork.back.security.service.LavoroContoterzoService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/client/lavoroContoterzo")
public class LavoroContoterzoController {

	@Autowired LavoroContoterzoService lcs;
	
	@PostMapping("/crea")
	@PreAuthorize("isAuthenticated()")
	public ResponseEntity<?> saveLavoro(@RequestBody LavoroContoterzo lc){
		LavoroContoterzo resp = lcs.saveLavoro(lc);
		return new ResponseEntity<LavoroContoterzo>(resp, HttpStatus.CREATED);
	}
}
