package com.letzchaat.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import com.letzchaat.model.Forum;

@Repository
public class ForumDAOImpl implements ForumDAO {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addForum(Forum forum) {
		Session session=this.sessionFactory.getCurrentSession();
		session.persist(forum);
		System.out.println("user register successfully="+forum);


	}

	public Forum getForumByUserId(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Forum> getAllForums() {
		// TODO Auto-generated method stub
		return null;
	}

}
