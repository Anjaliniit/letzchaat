package com.letzchaat.service;

import java.util.List;

import com.letzchaat.model.Blog;

public interface BlogService {
	public void addBlog(Blog b);
	public List<Blog> getAllBlogs();
}
