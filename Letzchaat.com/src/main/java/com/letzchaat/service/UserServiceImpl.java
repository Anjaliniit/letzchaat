package com.letzchaat.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.letzchaat.dao.UserDAO;
import com.letzchaat.model.UserRegister;

@Service
public class UserServiceImpl implements UserService {
	
	private UserDAO userDAO;
	
	@Transactional
	public void setUserDAO(UserDAO userDAO)
	{
		this.userDAO=userDAO;		
	}
	
	@Transactional
	public void addUser(UserRegister user) {
		userDAO.addUser(user);
	}

	@Transactional
	public UserRegister getUserByEmailId(String emailid) {
	    System.out.println("in service");
		return userDAO.getUserByEmailId(emailid);
	}
	@Transactional
	public List<UserRegister> getAllUsers() {
		
		return userDAO.getAllUsers();
	}

}
