package test.miguel.dev.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import test.miguel.dev.entidade.Buy;
import test.miguel.dev.entidade.Client;
import test.miguel.dev.service.BuyService;
import test.miguel.dev.service.ClientService;
import test.miguel.dev.service.EstudandeService;

@RestController
@RequestMapping("/buy")
public class BuyRestController {
	@Autowired
	private BuyService service;
	
	@PostMapping
	public Buy save(@Valid @RequestBody Buy buy) {
		return service.save(buy);
	}

	@GetMapping
	public List<Buy> findAll() {
		return service.findAll();		
	}
	@GetMapping("/{id}")
	public Buy findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}
	
	@PutMapping
	public Buy update(@Valid @RequestBody Buy buy) {
		return service.update(buy);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}
}
