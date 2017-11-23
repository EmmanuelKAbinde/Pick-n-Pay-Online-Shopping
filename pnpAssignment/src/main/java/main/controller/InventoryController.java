package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import main.model.Inventory;
import main.service.InventoryService;



@RestController
public class InventoryController {

	
	@Autowired
	private InventoryService inventoryService;
	
	

	@RequestMapping("/GetInventoryProducts")
	public List<Inventory> getInventoryproducts() 
	{
		return inventoryService.getInventoryproducts();
	}
	
	
	
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/InsertInventoryProducts")
	public void AddInventoryProduct(@RequestBody Inventory inventory)
	{
		
		inventoryService.AddInventoryProduct(inventory);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/UpdateInventoryProduct/{productCode}")
	public void updateInventoryProduct(@RequestBody  Inventory inventory, @PathVariable int productCode)
	{
		
		inventoryService.updateInventoryProduct(productCode, inventory);
		
	}
	
	
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/DeleteInventoryProduct/{productCode}")
	public void deleteProduct(@PathVariable int productCode)
	{
		inventoryService.deleteInventoryProduct(productCode);
	}
	
	
}
