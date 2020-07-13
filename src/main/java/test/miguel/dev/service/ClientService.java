package test.miguel.dev.service;

import java.util.List;

import javax.validation.Valid;

import test.miguel.dev.entidade.Client;

public interface ClientService {

	List<Client> findAll();

	Client save(@Valid Client client);

	Client findById(long id);

	Client update(@Valid Client client);
	
	void delete(long id);
}
