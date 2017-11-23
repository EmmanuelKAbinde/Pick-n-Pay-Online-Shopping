package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import main.model.ProductCategory;
import main.model.orderCart;
import main.service.ProductCategoryService;

@RestController
public class ProductCategoryController
{


	@Autowired
	private ProductCategoryService productCategoryService;
	
	@RequestMapping("/GetProductCategory")
	public List<ProductCategory> getProductCategory()
	{
		return productCategoryService.getProductCategory();
	}
	
	
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/InsertCategory")
	public void AddCategory(@RequestBody ProductCategory productCategor)
	{
		
		productCategoryService.AddCategory(productCategor);
		
		
	}
	
}
