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

import test.miguel.dev.entidade.Client;
import test.miguel.dev.service.ClientService;
import test.miguel.dev.service.EstudandeService;

@RestController
@RequestMapping("/client")
public class ClientRestController {
	@Autowired
	private ClientService service;
	
	@PostMapping
	public Client save(@Valid @RequestBody Client client) {
		return service.save(client);
	}

	@GetMapping
	public List<Client> findAll() {
		return service.findAll();		
	}
	@GetMapping("/{id}")
	public Client findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}
	
	@PutMapping
	public Client update(@Valid @RequestBody Client client) {
		return service.update(client);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}
}
