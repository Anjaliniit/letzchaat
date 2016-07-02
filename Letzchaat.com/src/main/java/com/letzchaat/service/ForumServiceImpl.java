package com.letzchaat.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.letzchaat.dao.ForumDAO;
import com.letzchaat.model.Forum;

@Service
public class ForumServiceImpl implements ForumService {
	ForumDAO forumDAO;
	
	/**
	 * @param forumDAO the forumDAO to set
	 */
	@Transactional
	public void setForumDAO(ForumDAO forumDAO) {
		this.forumDAO = forumDAO;
	}
	@Transactional
	public void addForum(Forum forum) {
		forumDAO.addForum(forum);
		
	}
	@Transactional
	public Forum getForumByUserId(int userid) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public List<Forum> getAllForums() {
		// TODO Auto-generated method stub
		return null;
	}

}
