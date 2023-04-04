package com.example.demo.udms.test.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.udms.test.Domain.SelectTestDomain;
import com.example.demo.udms.test.Domain.TestDomain;
import com.example.demo.udms.test.Repository.SelectTestRepository;
import com.example.demo.udms.test.Repository.TestRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TestService {
	@Autowired
	private TestRepository testRepository;
	
	@Autowired
	private SelectTestRepository selectTestRepository;
	
	
	
	public Flux<TestDomain> getTestAll() {
		return testRepository.findAll();
	}
	
	public Flux<SelectTestDomain> getSelectTest() {
		return selectTestRepository.findLiByColTime(); 
	}
}
