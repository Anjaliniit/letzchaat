package com.letzchaat.dao;

import java.util.List;

import com.letzchaat.model.UserRegister;

public interface UserDAO {
void addUser(UserRegister user);
UserRegister getUserByEmailId(String emailid);
int getUserId(String emailid);
List<UserRegister> getAllUsers();



}
