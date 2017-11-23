package main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import main.model.Order;


@Repository 
public interface OrderRepository extends CrudRepository<Order, Integer>
{

}
