package main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.Payment;
import main.repository.PaymentRepository;


@Service
public class PaymentService {

	@Autowired
	private  PaymentRepository paymentRepository;
	
	
//Process Payment
	public void ProcessPayment(Payment payment) {
		
		
		paymentRepository.save(payment);
		
	}

	
	
}
