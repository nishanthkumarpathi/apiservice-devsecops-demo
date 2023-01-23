package com.bbk.api.apiservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to DevSecOps class";
	}

	@GetMapping("/welcome1")
	public String welcome1() {
		return "Welcome to DevSecOps;
	}


}
