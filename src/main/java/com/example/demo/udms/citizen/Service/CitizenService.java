package com.example.demo.udms.citizen.Service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.udms.citizen.Domain.CitizenDomain;
import com.example.demo.udms.citizen.Repository.CitizenRepository;

import reactor.core.publisher.Mono;

@Service
public class CitizenService {
	@Autowired
	private CitizenRepository citizenRepository;
	
	public Mono<ResponseEntity<?>> setCitizen(Mono<CitizenDomain> CitizenDomain) {
//		this.citizenRepository.saveAll(CitizenDomain);
		return CitizenDomain.flatMap(s -> citizenRepository.save(s))
				.map(savedCitizen -> ResponseEntity
						.created(URI.create("/api/setCitizen" +
								savedCitizen.getIdx()))
						.body(savedCitizen));
		
		
	}
}
