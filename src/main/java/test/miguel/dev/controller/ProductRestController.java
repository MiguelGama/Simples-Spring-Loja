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
import test.miguel.dev.entidade.Product;
import test.miguel.dev.service.ClientService;
import test.miguel.dev.service.EstudandeService;
import test.miguel.dev.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductRestController {
	@Autowired
	private ProductService service;
	
	@PostMapping
	public Product save(@Valid @RequestBody Product product) {
		return service.save(product);
	}

	@GetMapping
	public List<Product> findAll() {
		return service.findAll();		
	}
	@GetMapping("/{id}")
	public Product findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}
	
	@PutMapping
	public Product update(@Valid @RequestBody Product product) {
		return service.update(product);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}
}
