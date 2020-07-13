package test.miguel.dev.service;

import java.util.List;

import javax.validation.Valid;

import test.miguel.dev.entidade.Buy;
import test.miguel.dev.entidade.Client;

public interface BuyService {

	List<Buy> findAll();

	Buy save(@Valid Buy buy);

	Buy findById(long id);

	Buy update(@Valid Buy buy);
	
	void delete(long id);
}
