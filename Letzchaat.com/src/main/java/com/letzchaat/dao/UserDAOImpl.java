package com.letzchaat.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.letzchaat.model.UserRegister;

@Repository
public class UserDAOImpl implements UserDAO {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void addUser(UserRegister user) {
		Session session=this.sessionFactory.getCurrentSession();
		session.persist(user);
		System.out.println("user register successfully="+user);
	}
	public UserRegister getUserByEmailId(String emailid) {
		
		Session session=this.sessionFactory.getCurrentSession();
		UserRegister u=(UserRegister) session.load(UserRegister.class,emailid);
		System.out.println("data of user by id="+u);
		return u;	
	
	}

}
