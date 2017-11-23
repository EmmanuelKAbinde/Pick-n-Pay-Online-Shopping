package main.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import main.model.orderCart;

@Repository
public interface OrderCartRepository  extends CrudRepository <orderCart, Integer> {

	
	@Query("SELECT o FROM orderCart o WHERE o.user_email = :user_email")
	public ArrayList<orderCart> viewByUserId(@Param("user_email") String user_email);
	
	
	
	
}
