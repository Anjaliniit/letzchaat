package com.letzchaat.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.letzchaat.model.UserRegister;
import com.letzchaat.service.UserService;

@Controller
public class UserController {
	UserRegister user;
	UserService userService;
	@Autowired(required=true)
	@Qualifier(value="userService")
	public void setUserService(UserService us)
	{
		this.userService=us;
	}
	
	
	@RequestMapping(value="/register")
	String addUser(@Valid @ModelAttribute("user") UserRegister u,BindingResult result)
	{
			this.user=u;
			if(result.hasErrors()){
				return "index";
				
			}
			else{
		    userService.addUser(u);
		    return"redirect:/profile";
			}
	}
	
	@RequestMapping("/profile")
	public ModelAndView profile()
	{
		return new ModelAndView("profile");
		
	}

	@RequestMapping("/login")
	public ModelAndView login()
	{
		return new ModelAndView("profile");
		
	}
	
	
	
	
	
}
