package main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.Driver;
import main.model.Order;

import main.repository.OrderRepository;

@Service
public class OrderService 
{

	@Autowired
	public OrderRepository orderRepository;
	
	

	public void makeOrder(Order Order) {
		
		
		orderRepository.save(Order);
	}
		
	
	public List<Order> viewOrder()
	{
		List<Order> orders = new ArrayList<>();
		orderRepository.findAll()
		.forEach(orders::add);
		return orders;
	}
	
	
	public void UpdateOrder(int orderNum, Order order) 
	{

		orderRepository.save(order);
	}
	
		
}
