package test.miguel.dev.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.miguel.dev.entidade.Estudante;
import test.miguel.dev.repository.EstudanteRepository;

// TODO Efetue a implementação dos métodos da classe service
@Service
public class EstudanteServiceImpl implements EstudandeService {
	@Autowired
	EstudanteRepository repository;

	@Override
	public void cadastrarEstudante(@Valid Estudante estudante) {
		repository.save(estudante);		
	}

	@Override
	public void atualizarEstudante(@Valid Estudante estudante) {
		repository.save(estudante);
	}

	@Override
	public List<Estudante> buscarEstudantes() {
		return  StreamSupport.stream(repository.findAll().spliterator(), false)
				.collect(Collectors.toList());
	}

	@Override
	public Estudante buscarEstudante(long id) {
		return repository.findById(id).get();
	}

	@Override
	public void excluirEstudante(long id) {
		repository.deleteById(id);		
	}

}
