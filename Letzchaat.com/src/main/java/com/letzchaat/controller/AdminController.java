package com.letzchaat.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.letzchaat.model.Forum;
import com.letzchaat.model.UserRegister;
import com.letzchaat.service.ForumService;
import com.letzchaat.service.UserService;

@Controller
public class AdminController {
	ForumService forumService;
	UserService userService;
	@Autowired(required=true)
	@Qualifier(value="userService")
	public void setUserService(UserService us)
	{
		this.userService=us;
	}
	
	/**
	 * @param forumService the forumService to set
	 */

	@Autowired(required=true)
	@Qualifier(value="forumService")
	public void setForumService(ForumService forumService) {
		this.forumService = forumService;
	}


	@RequestMapping("/admin/adminPage")
	public ModelAndView home(Model model)
	{   
		return new ModelAndView("admin");
	}
	
	
	@RequestMapping("/admin/forum")
	public ModelAndView adminForum(Model model,@RequestParam(name="loginid")String nm )
	{
		model.addAttribute("forum",new Forum());
		System.out.println(nm);
		int id=userService.getUserId(nm);
		System.out.println(id);
		model.addAttribute("userid",id);
		return new ModelAndView("forum");
	}
	
	@RequestMapping(value="/admin/forum/add",method=RequestMethod.POST)
	public String adminForumAdd(@Valid @ModelAttribute("forum") Forum f,BindingResult result, Model model,HttpServletRequest request)
	{

		if(result.hasErrors())
		{ 
			return "redirect:/admin/forum";
		}
		else
		{
		
		return "";
		
		}
		
	}
	
	
	
	
}
