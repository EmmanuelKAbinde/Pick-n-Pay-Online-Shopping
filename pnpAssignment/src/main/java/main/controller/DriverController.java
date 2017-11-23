package main.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import main.model.Driver;
import main.model.orderCart;
import main.service.DriverService;

@RestController
public class DriverController {

	@Autowired
	public DriverService driverService;
	
	@RequestMapping("/GetDriver")
	public List<Driver> getDriver() 
	{
		return driverService.getdrivers();
	}
	
	
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/AddDriver")
	public void AddDriver(@RequestBody Driver driver)
	{
		
		driverService.AddDriver(driver);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/UpdateDriver/{driverId}")
	public void updatecart (@RequestBody   Driver driver, @PathVariable int driverId)
	{
		
		driverService.updateDriver(driverId, driver);
		
	}
	
	
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/DeleteDriver/{driverId}")
	public void deleteDriver(@PathVariable int driverId)
	{
		driverService.deleteDriver(driverId);
	}
	
	
	//UpdateDriver
	
}
