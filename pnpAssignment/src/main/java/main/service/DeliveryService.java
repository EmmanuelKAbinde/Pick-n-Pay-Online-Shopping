package main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.Delivery;
import main.model.Driver;
import main.repository.DeliveyRepository;


@Service
public class DeliveryService {

	@Autowired
	public DeliveyRepository deliveyRepository;
	
//List All the Deliveries	
	
	public List<Delivery> getDelivery()
	{
		List<Delivery> delivery = new ArrayList<>();
		deliveyRepository.findAll()
		.forEach(delivery::add);
		
		return delivery;
	}
	
		
	//Confirm A delivery
	public void AddDelivery(Delivery delivery) {
		
		deliveyRepository.save(delivery);
			
		}

}
