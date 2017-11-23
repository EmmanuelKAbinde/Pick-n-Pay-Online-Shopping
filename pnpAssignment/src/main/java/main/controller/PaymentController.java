package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import main.model.Payment;

import main.service.PaymentService;



@RestController
public class PaymentController {

	
	

	@Autowired
	private PaymentService paymentService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/processPayment")
	public void ProcessPayment(@RequestBody Payment payment)
	{
		
	
		paymentService.ProcessPayment(payment);
		
		
		
	}
	
}
