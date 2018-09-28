package com.custom.helloapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.custom.helloservice.IHelloService;

@Component
public class Runner implements CommandLineRunner {

	private final IHelloService srvc;
	
	public Runner(IHelloService srvc) {
		this.srvc = srvc;
	}
	
	@Override
	public void run(String... args) throws Exception {
		this.srvc.sayHello("From CMD");
	}

}
