package test.miguel.dev.service;

import java.util.List;

import javax.validation.Valid;

import test.miguel.dev.entidade.Estudante;

public interface EstudandeService {

	List<Estudante> buscarEstudantes();

	void cadastrarEstudante(@Valid Estudante estudante);

	Estudante buscarEstudante(long id);

	void atualizarEstudante(@Valid Estudante estudante);
	
	void excluirEstudante(long id);
}
