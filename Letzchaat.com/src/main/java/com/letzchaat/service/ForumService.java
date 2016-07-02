package com.letzchaat.service;

import java.util.List;

import com.letzchaat.model.Forum;

public interface ForumService {


void addForum(Forum forum);
Forum getForumByUserId(int userid);
List<Forum> getAllForums();
	
	
}
