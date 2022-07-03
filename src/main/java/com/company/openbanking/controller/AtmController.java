package com.company.openbanking.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.openbanking.service.IAtmService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/atm")
public class AtmController {
	
	@Autowired
	private IAtmService atmService;

	@GetMapping("/getAtm")
	public ResponseEntity<?> getAtmDetails(@RequestParam Optional<String> url, @RequestParam Optional<String> identification)
	{
		
		return ResponseEntity.ok(
				atmService.getAtmService(url.orElseGet(() -> "https://api.lloydsbank.com/open-banking/v2.2/atms"), 
						identification.orElseGet(() -> null)));
		
		
		
	}
}
