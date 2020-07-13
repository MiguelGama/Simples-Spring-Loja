package test.miguel.dev.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.miguel.dev.entidade.Client;
import test.miguel.dev.entidade.Estudante;
import test.miguel.dev.repository.ClientRepository;
import test.miguel.dev.repository.EstudanteRepository;


@Service
public class ClientServiceImpl implements ClientService {
	@Autowired
	ClientRepository repository;

	@Override
	public List<Client> findAll() {
		return StreamSupport.stream(repository.findAll().spliterator(), false)
		.collect(Collectors.toList());
	}

	@Override
	public Client save(@Valid Client client) {
		return repository.save(client);		
	}

	@Override
	public Client findById(long id) {
		return repository.findById(id).get();
	}

	@Override
	public Client update(@Valid Client client) {
		return repository.save(client);
	}

	@Override
	public void delete(long id) {
		repository.deleteById(id);		
	}

	

}
