package main.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.Driver;
import main.model.product;
import main.repository.DriverRepository;

@Service
public class DriverService {

	
	@Autowired
	public DriverRepository driverRepository;
	
	public List<Driver> getdrivers()
	{
		List<Driver> driver = new ArrayList<>();
		driverRepository.findAll()
		.forEach(driver::add);
		
		return driver;
		
	}
	

	//Ad driver information
public void AddDriver(Driver driver) {
		
	driverRepository.save(driver);
		
	}


//Update Driver Information(Status)
public void updateDriver(int driverId, Driver driver) 
{

	driverRepository.save(driver);
}



public void deleteDriver(int driverId) 
{
	
	driverRepository.delete(driverId);
	
}

	
}
