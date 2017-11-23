package main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import main.model.orderCart;


@Repository
public interface CartProductRepository  extends CrudRepository <orderCart, Integer>{

}
