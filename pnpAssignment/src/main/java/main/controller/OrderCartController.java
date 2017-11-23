package main.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.solr.core.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import main.model.orderCart;
import main.service.OrderCartService;

@RestController
public class OrderCartController {
	
	@Autowired
	private OrderCartService orderCartService;
	
	@RequestMapping(method = RequestMethod.POST,value = "/InsertCart")
	public void AddCart(@RequestBody orderCart orderCarts)
	{
		
	
			orderCartService.AddCart(orderCarts);
		
		
		
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/UpdateCart/{orderCartNum}")
	public void updatecart (@RequestBody  orderCart orderCarts, @PathVariable int orderCartNum)
	{
		
		orderCartService.updatecart(orderCartNum, orderCarts);
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/DeleteCart/{orderCartNum}")
	public void deletecart(@PathVariable int orderCartNum)
	{
		orderCartService.deletecart(orderCartNum);
	}
	
}
