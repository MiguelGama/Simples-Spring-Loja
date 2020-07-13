package test.miguel.dev.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import test.miguel.dev.entidade.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

}
