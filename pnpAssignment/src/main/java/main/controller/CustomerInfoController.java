package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import main.model.CustomerInfo;
import main.service.CustomerInfoService;

@RestController
public class CustomerInfoController {

	@Autowired
	private CustomerInfoService customerInfoService;
	
	
	
	
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/InsertCustomerInfo")
	public void AddCustomerInfo(@RequestBody CustomerInfo customerInfo)
	{
		
		customerInfoService.AddCustomerInfo(customerInfo);
		
		
	}
	
	
	@RequestMapping(method = RequestMethod.PUT,value = "/UpdateCustomerInfo/{custNumber}")
	public void UpdateCustomerInfo (@RequestBody CustomerInfo customerInfo, @PathVariable int custNumber)
	{
		
		customerInfoService.UpdateCustomerInfo(custNumber, customerInfo);
		
	}
	
	
}
