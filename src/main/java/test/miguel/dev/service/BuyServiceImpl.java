package test.miguel.dev.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.miguel.dev.entidade.Buy;
import test.miguel.dev.repository.BuyRepository;




@Service
public class BuyServiceImpl implements BuyService {
	@Autowired
	BuyRepository repository;

	@Override
	public List<Buy> findAll() {
		return StreamSupport.stream(repository.findAll().spliterator(), false)
		.collect(Collectors.toList());
	}
	@Override
	public Buy save(@Valid Buy buy) {
		return repository.save(buy);
	}

	@Override
	public Buy findById(long id) {
		return repository.findById(id).get();
	}

	@Override
	public Buy update(@Valid Buy product) {
		return repository.save(product);
	}

	@Override
	public void delete(long id) {
		repository.deleteById(id);
	}
	
}
