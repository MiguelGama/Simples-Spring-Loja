package test.miguel.dev.service;

import java.util.List;

import javax.validation.Valid;

import test.miguel.dev.entidade.Client;
import test.miguel.dev.entidade.Product;

public interface ProductService {

	List<Product> findAll();

	Product save(@Valid Product product);

	Product findById(long id);

	Product update(@Valid Product product);
	
	void delete(long id);
}
