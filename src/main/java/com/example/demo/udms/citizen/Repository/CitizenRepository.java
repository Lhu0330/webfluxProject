package com.example.demo.udms.citizen.Repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.udms.citizen.Domain.CitizenDomain;

@Repository
public interface CitizenRepository extends ReactiveCrudRepository<CitizenDomain, String> {
	
}
