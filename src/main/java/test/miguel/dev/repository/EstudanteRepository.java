package test.miguel.dev.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import test.miguel.dev.entidade.Estudante;

@Repository
public interface EstudanteRepository extends CrudRepository<Estudante, Long>{

	//List<Estudante> findByName(String name);

}
