package com.letzchaat.service;

import com.letzchaat.model.UserRegister;

public interface UserService {
	void addUser(UserRegister user);
	UserRegister getUserByEmailId(String emailid);
}
