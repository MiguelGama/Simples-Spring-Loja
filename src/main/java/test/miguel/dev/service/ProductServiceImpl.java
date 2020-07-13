package test.miguel.dev.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.miguel.dev.entidade.Product;
import test.miguel.dev.repository.ProductRepository;




@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository repository;

	@Override
	public List<Product> findAll() {
		return StreamSupport.stream(repository.findAll().spliterator(), false)
		.collect(Collectors.toList());
	}
	@Override
	public Product save(@Valid Product product) {
		// TODO Auto-generated method stub
		return repository.save(product);
	}

	@Override
	public Product findById(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public Product update(@Valid Product product) {
		// TODO Auto-generated method stub
		return repository.save(product);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}
	
}
