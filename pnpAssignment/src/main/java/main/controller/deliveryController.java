package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import main.model.Delivery;
import main.model.Driver;
import main.service.DeliveryService;

@RestController
public class deliveryController {

	
	
	@Autowired
	public DeliveryService deliveryService;
	
	
	@RequestMapping("/GetDelivery")
	public List<Delivery> getDelivery() 
	{
		return deliveryService.getDelivery();
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/ProcessDelivery")
	public void addDelivery(@RequestBody Delivery delivery)
	{
		
		deliveryService.AddDelivery(delivery);
		
		
	}
	
}
