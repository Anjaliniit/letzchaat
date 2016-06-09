package com.letzchaat.service;

import java.util.List;

import com.letzchaat.model.UserRegister;

public interface UserService {
	void addUser(UserRegister user);
	UserRegister getUserByEmailId(String emailid);
	List<UserRegister> getAllUsers();
}
