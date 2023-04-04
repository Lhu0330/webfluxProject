package com.example.demo.udms.citizen.Contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.udms.citizen.Domain.CitizenDomain;
import com.example.demo.udms.citizen.Service.CitizenService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CitizenContoller {
	
	@Autowired
	private CitizenService citizenService;
	
	
	@PostMapping(value="/api/setCitizen")
	Mono<ResponseEntity<?>> setCitizen(@RequestBody Mono<CitizenDomain> CitizenDomain) {
		return citizenService.setCitizen(CitizenDomain);
	}
}
