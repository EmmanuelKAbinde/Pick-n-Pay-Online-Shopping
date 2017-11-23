package main.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.items;
import main.repository.ItemRepository;

@Service
public class ItemService
{

	@Autowired
	public ItemRepository itemRepository;
	
	
	//List All the products
	public List<items> getAllItems()
	{
		
		List<items> item = new ArrayList<>();
		itemRepository.findAll()
		.forEach(item::add);
		return item;
		
	}
	
	
	
}
