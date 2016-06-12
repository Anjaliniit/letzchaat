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
import org.springframework.web.bind.annotation.RequestParam;
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
	
	/*
	 * signup mapping
	 * */
	@RequestMapping("/signup")
	public ModelAndView signUp(Model model)
	{
		model.addAttribute("user",new UserRegister());
		return new ModelAndView("signUp");
	}
	
	
	/*register mapping of user*/
	
	
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
	            if(user.getEmailId().equals(userL.getEmailId())){
	                model.addAttribute("emailMsg", "Email already exists");
	                return "signUp";
	              }
	        }
	        userService.addUser(u);
		    return"redirect:/profile";
	}

	/*login mapping*/
	@RequestMapping(value = "/login")
	public ModelAndView loginPage(@RequestParam(value="error", required = false)
	String error,@RequestParam(value="logout", required = false)String logout,Model model) {
		
		if(error != null){
			model.addAttribute("error", "Invalid username and password");
			}

			if (logout !=null){
			model.addAttribute("msg", "You have been logged out successfully !!!!");
			}
			
		return new ModelAndView("login");
	}

	@ModelAttribute("ulogin")
	public UserRegister getLast()
	{
		return new UserRegister();
		
	}
	
	@RequestMapping(value="/ulogin")
	public String ulogin(@Valid @ModelAttribute("ulogin") UserRegister u,BindingResult result,Model model)
	{   String value=null;
		this.ulogin=u;
		if(result.hasErrors()){
			return "login";	
		}
		else
		{
        List<UserRegister> userList = userService.getAllUsers();
        for(UserRegister userL:userList)
        {
            if(ulogin.getEmailId().equals(userL.getEmailId()) && ulogin.getPassword().equals(userL.getPassword())){
                 value="user/profile";
              }
            else
            { model.addAttribute("userpass","username and password does not exits");
            	value="index";
            }
        }
        return "redirect:/"+value;	
	}
}
	
	
	
	
	
		@RequestMapping("/profile")
	public ModelAndView profile()
	{
		return new ModelAndView("user/profile");
	}
	
	
	@RequestMapping("/forum")
	public ModelAndView home()
	{
		return new ModelAndView("forum");
	}	
}
