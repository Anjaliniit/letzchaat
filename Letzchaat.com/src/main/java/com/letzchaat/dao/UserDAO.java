package com.letzchaat.dao;

import com.letzchaat.model.UserRegister;

public interface UserDAO {
void addUser(UserRegister user);
UserRegister getUserByEmailId(String emailid);

}
