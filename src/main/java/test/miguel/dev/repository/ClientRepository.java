package test.miguel.dev.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import test.miguel.dev.entidade.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long>{

}
