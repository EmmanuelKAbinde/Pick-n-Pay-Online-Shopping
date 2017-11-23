package main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.CustomerInfo;
import main.model.Order;
import main.model.User;
import main.repository.CustomerInfoRepository;

@Service
public class CustomerInfoService {

	
	@Autowired
	public CustomerInfoRepository customerInfoRepository;
	
	
	
	
	
	public ArrayList<CustomerInfo> viewCustomerInfo(String user_email)
	{
		return customerInfoRepository.viewByCustomerEmail(user_email);
	}

	
	
	
	
	public void AddCustomerInfo(CustomerInfo customerInfo) {
		
		
		customerInfoRepository.save(customerInfo);
		
	}
	
	
	public void UpdateCustomerInfo(int custNumber, CustomerInfo customerInfo) 
	{

		customerInfoRepository.save(customerInfo);
	
	}

	
}
