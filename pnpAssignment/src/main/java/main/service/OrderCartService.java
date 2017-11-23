package main.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.orderCart;
import main.repository.CartProductRepository;
import main.repository.OrderCartRepository;

@Service
public class OrderCartService {

	
	@Autowired
	public OrderCartRepository orderCartRepository;
	
	@Autowired
	public CartProductRepository cartProductRepository;
	
	
	//View Cart Based on the logged in user
	public ArrayList<orderCart> viewOrderCart(String user_email)
	{
		return orderCartRepository.viewByUserId(user_email);
	}
	
	
	//Customer Adding products to cart
	public void AddCart(orderCart orderCarts) {
		
		
		cartProductRepository.save(orderCarts);
		
	}
	
	//Update the cart after Checking out
	public void updatecart(int orderCartNum, orderCart orderCarts)
	{
		
		cartProductRepository.save(orderCarts);
		
	}
	
	
	public void deletecart(int orderCartNum) 
	{
		
		cartProductRepository.delete(orderCartNum);
		
	}
	
}
