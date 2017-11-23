package main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import main.model.Payment;


@Repository
public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
