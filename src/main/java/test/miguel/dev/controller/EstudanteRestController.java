package test.miguel.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import test.miguel.dev.service.EstudandeService;

// TODO não esquecer de usar as anotações para criação do restcontroller
@RestController
@RequestMapping("/client69786")
public class EstudanteRestController {
	@Autowired
	private EstudandeService service;

	@GetMapping
	public String getAll() {
		service.buscarEstudantes();
		return "ok";
	}
	// TODO IMPLEMENTAR A EXCLUSÃO DE ESTUDANTES (DELETE)
}
