package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.PersonaFinal;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/final")
public class FinalController {
	
	@RequestMapping(value="/persona", method = RequestMethod.GET)
	public PersonaFinal obtenerPersona(HttpServletRequest request) {
		
		PersonaFinal person = new PersonaFinal();
		person.setNombre("Jhonny");
		person.setApellidos("Blaze");
		person.setDocumento("01234");
		
		return person;
		
	}

}
