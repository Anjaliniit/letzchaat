package com.letzchaat.controller;

import java.util.List;

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
	UserRegister user,ulogin;
	UserService userService;
	@Autowired(required=true)
	@Qualifier(value="userService")
	public void setUserService(UserService us)
	{
		this.userService=us;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(Model model)
	{
		model.addAttribute("ulogin",new UserRegister());
		return new ModelAndView("login");
	}
	
	@RequestMapping("/signup")
	public ModelAndView signUp(Model model)
	{
		model.addAttribute("user",new UserRegister());
		return new ModelAndView("signUp");
	}
	
	@RequestMapping(value="/register")
	String addUser(@Valid @ModelAttribute("user") UserRegister u,BindingResult result,Model model)
	{
		System.out.println("register");
			this.user=u;
			if(result.hasErrors()){
				return "signUp";	
			}
	        List<UserRegister> userList = userService.getAllUsers();

	        for(UserRegister userL:userList)
	        {
	            if(user.getEmailid().equals(userL.getEmailid())){
	                model.addAttribute("emailMsg", "Email already exists");

	                return "signUp";
	              }
	        }
	        userService.addUser(u);
		    return"redirect:/profile";
	}
	@RequestMapping("/profile")
	public ModelAndView profile()
	{
		return new ModelAndView("profile");
	}
	
	
	
	
	@RequestMapping("/ulogin")
	public String ulogin(@Valid @ModelAttribute("ulogin") UserRegister u,BindingResult result,Model model)
	{   String value=null;
		this.ulogin=u;
		if(result.hasErrors()){
			return "index";	
		}
        List<UserRegister> userList = userService.getAllUsers();
        for(UserRegister userL:userList)
        {
            if(ulogin.getEmailid().equals(userL.getEmailid()) && ulogin.getPassword().equals(userL.getPassword())){
                 value="profile";
              }
            else
            { model.addAttribute("userpass","username and password does not exits");
            	value="index";
            }
        }
        return "redirect:/"+value;
		
	}
	
	
	
	
	
}
