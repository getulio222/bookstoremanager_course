package com.getulioazevedo.bookstoremanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1/books")
public class BookController {
	
	@GetMapping
	public String testRequest() {
		return "Rest requesting okay!";
	}

}
