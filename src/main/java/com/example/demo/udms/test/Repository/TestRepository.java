package com.example.demo.udms.test.Repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.udms.test.Domain.TestDomain;

@Repository
public interface TestRepository extends ReactiveCrudRepository<TestDomain, String> {
	
}
