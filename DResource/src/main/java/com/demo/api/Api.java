package com.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Api {

	@GetMapping("/helloworld")
	@PreAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<String> sayHelloWorld() {
		String helloWorld = "Hello World";
		return ResponseEntity.ok().body(helloWorld);
	}
}
