package main.controller;

import org.springframework.web.bind.annotation.RestController;

import main.model.items;
import main.service.ItemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class itemController 
{

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/GetItems")
	public List<items> getAllItems()
	{
		return itemService.getAllItems();
	}
	
}
