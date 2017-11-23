package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import main.model.User;
import main.service.UserService;

@Controller
public class AdminController {

	

	@Autowired
	private UserService userService;

@RequestMapping(value="/Admin/products", method = RequestMethod.GET)
public ModelAndView products(){
	ModelAndView modelAndView = new ModelAndView();
	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	User user = userService.findUserByEmail(auth.getName());
	modelAndView.addObject("userName", "Hello! " + user.getLastName() + " " + user.getName());
	modelAndView.setViewName("Admin/products");
	return modelAndView;
}





@RequestMapping(value="/Admin/ProductCategory", method = RequestMethod.GET)
public ModelAndView Category(){
	ModelAndView modelAndView = new ModelAndView();
	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	User user = userService.findUserByEmail(auth.getName());
	modelAndView.addObject("userName", "Hello! " + user.getLastName() + " " + user.getName());
	modelAndView.setViewName("Admin/ProductCategory");
	return modelAndView;
}



@RequestMapping(value="/Admin/Driver", method = RequestMethod.GET)
public ModelAndView Driver(){
	ModelAndView modelAndView = new ModelAndView();
	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	User user = userService.findUserByEmail(auth.getName());
	modelAndView.addObject("userName", "Hello! " + user.getLastName() + " " + user.getName());
	modelAndView.setViewName("Admin/Driver");
	return modelAndView;
}

@RequestMapping(value="/Admin/delivery", method = RequestMethod.GET)
public ModelAndView Delivery(){
	ModelAndView modelAndView = new ModelAndView();
	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	User user = userService.findUserByEmail(auth.getName());
	modelAndView.addObject("userName", "Hello! " + user.getLastName() + " " + user.getName());
	modelAndView.setViewName("Admin/delivery");
	return modelAndView;
}

}



