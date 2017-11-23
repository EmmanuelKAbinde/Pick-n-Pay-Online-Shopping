package main.service;

import main.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
