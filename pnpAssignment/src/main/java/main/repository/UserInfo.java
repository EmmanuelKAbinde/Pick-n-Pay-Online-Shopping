package main.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import main.model.User;
import main.model.orderCart;


@Repository
public interface UserInfo  extends CrudRepository <User, Integer> {

	@Query("SELECT u FROM User u WHERE u.email = :email")
	public ArrayList<User> viewByUserId(@Param("email") String email);
	
}
