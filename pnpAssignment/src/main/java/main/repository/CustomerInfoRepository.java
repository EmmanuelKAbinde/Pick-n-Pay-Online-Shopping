package main.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import main.model.CustomerInfo;


@Repository
public interface CustomerInfoRepository extends CrudRepository<CustomerInfo, Integer> {

	
	@Query("SELECT c FROM CustomerInfo c WHERE c.user_email = :user_email")
	public ArrayList<CustomerInfo> viewByCustomerEmail(@Param("user_email") String user_email);
	
	
}
