package main.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import main.model.User;
import main.model.orderCart;
import main.repository.UserInfo;

@Service
public class UserInfoService {

	
	@Autowired
	private UserInfo userInfo;
	
	
	//Display User info of the logged in user
public ArrayList<User> viewUserInfo(String email)
	{
		return userInfo.viewByUserId(email);
	}

	
}
