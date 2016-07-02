package com.letzchaat.dao;

import java.util.List;

import com.letzchaat.model.Forum;



public interface ForumDAO {


void addForum(Forum forum);
Forum getForumByUserId(int userid);
List<Forum> getAllForums();
	
	
	
}
