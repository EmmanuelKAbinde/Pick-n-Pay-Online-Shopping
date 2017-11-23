package main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import main.model.product;
import main.service.ProductService;


@RestController
public class ProductController {

	
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/GetProducts")
	public List<product> getAllproducts() 
	{
		return productService.getAllproducts();
	}
	
	
	
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/InsertProducts")
	public void AddProduct(@RequestBody product products)
	{
		
		productService.AddProduct(products);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/UpdateProduct/{id}")
	public void updateProduct(@RequestBody product products, @PathVariable int id)
	{
		
		productService.updateProduct(id, products);
		
	}
	
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/DeleteProduct/{id}")
	public void deleteProduct(@PathVariable int id)
	{
		productService.deleteProduct(id);
	}
	
	
	@RequestMapping(value = "/GetAllProducts/{productCategoryCode}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
	@ResponseBody
	public ArrayList<product> getProdutcs(@PathVariable String productCategoryCode)

	{
		ArrayList<product> listProduct = productService.ViewProductInfo(productCategoryCode);
	 
		System.out.println( listProduct);
		
	return listProduct;
	}
	
	
	
	
	
}
