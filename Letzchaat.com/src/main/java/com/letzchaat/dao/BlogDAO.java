package com.letzchaat.dao;

import java.util.List;

import com.letzchaat.model.Blog;

public interface BlogDAO 
{
	public void addBlog(Blog b);
	public List<Blog> getAllBlogs();
}
