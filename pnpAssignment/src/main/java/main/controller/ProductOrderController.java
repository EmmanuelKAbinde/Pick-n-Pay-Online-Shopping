package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import main.model.Driver;
import main.model.Order;

import main.service.OrderService;

@RestController
public class ProductOrderController {

	
	@Autowired
	public OrderService orderService;
	
	@RequestMapping(method = RequestMethod.POST,value = "/CreateOrder")
	public void makeOrder(@RequestBody Order order)
	{
		
		orderService.makeOrder(order);
		
		
	}
	
	@RequestMapping("/GetOrder")
	public List<Order> getOrders()
	
	{
		return orderService.viewOrder();
		
	}
	
	
	@RequestMapping(method = RequestMethod.PUT,value = "/UpdateOrder/{orderNum}")
	public void UpdateOrder (@RequestBody  Order order, @PathVariable int orderNum)
	{
		
		orderService.UpdateOrder(orderNum, order);
		
	}
	
	
}
