package com.letzchaat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

	@RequestMapping("/admin/adminPage")
	public ModelAndView home()
	{
		return new ModelAndView("admin");
	}
	
	
	@RequestMapping("/admin/forum")
	public ModelAndView adminforum()
	{
		return new ModelAndView("forum");
	}
	
	
	
	
}
