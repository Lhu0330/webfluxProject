package com.example.demo.udms.test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.udms.test.Domain.SelectTestDomain;
import com.example.demo.udms.test.Domain.TestDomain;
import com.example.demo.udms.test.Repository.TestRepository;
import com.example.demo.udms.test.Service.TestService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class TestController {
	
	@Autowired
	private TestService testservice;
	
	
	
	@GetMapping(value= "/example", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<String> hello() {
        return Flux.just("Hello", "World");
    }
	
	
	@PostMapping(value = "/api/test", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<TestDomain> getTestAll() {
		return testservice.getTestAll();
	}
	
	@GetMapping(value = "/api/SelectTest", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<SelectTestDomain> getSelectTest() {
		return testservice.getSelectTest();
	}
}
