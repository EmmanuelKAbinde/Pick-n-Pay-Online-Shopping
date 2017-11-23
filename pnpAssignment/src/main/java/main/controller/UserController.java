package main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import main.model.CustomerInfo;
import main.model.User;
import main.model.orderCart;
import main.service.CustomerInfoService;
import main.service.OrderCartService;
import main.service.UserInfoService;
import main.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserInfoService userInfoService;
	private String Custemail ;
	
	@Autowired
	private CustomerInfoService customerInfoService;
	
	@RequestMapping(value = "/username", method = RequestMethod.GET)
    @ResponseBody
    public String currentUserName(Authentication authentication) {

    
		Custemail = authentication.getName();
	
		return Custemail;
    		
    }
	
	
	@RequestMapping(value = "/viewUser", method = org.springframework.web.bind.annotation.RequestMethod.GET)
	@ResponseBody
	public ArrayList<User> getUser(String email)
	{
		ArrayList<User> listCart = userInfoService.viewUserInfo(Custemail);
	 
	return listCart;
	}
	
	@Autowired
	private OrderCartService orderCartService;
	
@RequestMapping(value = "/viewCart", method = org.springframework.web.bind.annotation.RequestMethod.GET)
	@ResponseBody
	public ArrayList<orderCart> getAllCart(String user_email)
	{
		ArrayList<orderCart> listCart = orderCartService.viewOrderCart(Custemail);
	 
	return listCart;
	}
	

	@RequestMapping(value = "/GetCustomerInfo", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<CustomerInfo> getCustomer(String user_email)
	{
		ArrayList<CustomerInfo> customerInfo = customerInfoService.viewCustomerInfo(Custemail);
	 
	return customerInfo;
	}
	
	
}
	
	
	
