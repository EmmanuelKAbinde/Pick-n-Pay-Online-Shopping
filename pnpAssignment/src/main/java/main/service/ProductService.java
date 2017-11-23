package main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.model.User;
import main.model.items;
import main.model.product;
import main.repository.ItemRepository;
import main.repository.ProductRepository;


@Service
public class ProductService {

	
	@Autowired
	public ProductRepository productRepository;
	
	public List<product> getAllproducts()
	{
		
		List<product> products = new ArrayList<>();
		productRepository.findAll()
		.forEach(products::add);
		return products;
		
	}
	
	
	//Administrator Adds Products 
	public void AddProduct(product products) {
		
		productRepository.save(products);
		
	}
	
	//Administrator Updates the produtcs 
	public void updateProduct(int id, product products) 
	{

		productRepository.save(products);
	}

//View All the Products in the category
	public ArrayList<product> ViewProductInfo(String productCategoryCode)
	
	{
		
		return productRepository.viewByCategoryCode(productCategoryCode);
	}
	
	
	
	public void deleteProduct(int id) 
	{
		
		productRepository.delete(id);
		
	}
	
}
