package com.bbk.api.apiservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Version {

	@GetMapping("/version")
	public String version() {
		return "REPALCETHISVALUEINGITHUBACTIONS";
	}

	@GetMapping("/version2")
	public String version2() {
		return "REPALCETHISVALUEINGITHUBACTIONS";
	}
}
