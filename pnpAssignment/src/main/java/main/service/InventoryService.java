package main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.Inventory;

import main.repository.InventoryRepository;

@Service
public class InventoryService {

	
	
	@Autowired
	public InventoryRepository inventoryRepository;
	
	
	
	public List<Inventory> getInventoryproducts()
	{
		
		List<Inventory> inventoryProducts = new ArrayList<>();
		inventoryRepository.findAll()
		.forEach(inventoryProducts::add);
		return inventoryProducts;
		
	}
	
	
	//Administrator Adds Products 
	public void AddInventoryProduct(Inventory inventory) {
		
		inventoryRepository.save(inventory);
		
	}
	
	
	public void updateInventoryProduct(int productCode, Inventory inventory) 
	{

		inventoryRepository.save(inventory);
	}
	
	
	public void deleteInventoryProduct(int productCode) 
	{
		
		inventoryRepository.delete(productCode);
		
	}
	
}
	
	
