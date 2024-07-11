package com.devops.netbanking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webcontroller {
	
	@GetMapping("/")
	public String getMessage() {
		return "Hello World!!!";
	}

}
