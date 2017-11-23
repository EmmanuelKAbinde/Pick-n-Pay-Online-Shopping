package main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import main.model.Delivery;

@Repository
public interface DeliveyRepository extends CrudRepository<Delivery, Integer> {

}
