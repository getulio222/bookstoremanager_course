package com.getulioazevedo.bookstoremanager.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1/books")
public class BookController {
	
	@GetMapping
	@ApiOperation(value = "Retorno do Metodo de Teste")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Sucesso")
	})
	public String testRequest() {
		return "Metodo retornado com sucesso!";
	}

}
