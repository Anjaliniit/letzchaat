package com.letzchaat.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.letzchaat.model.Forum;
import com.letzchaat.model.UserRegister;
import com.letzchaat.service.BlogService;
import com.letzchaat.service.ForumService;
import com.letzchaat.service.UserService;

@Controller
public class AdminController {
	UserService userService;
	BlogService blogService;
	ForumService forumService;

	/**
	 * @param userService the userService to set
	 */
	@Autowired(required=true)
	@Qualifier(value="userService")
	public void setUserService(UserService userService)
	{
		this.userService=userService;
	}
	
	/**
	 * @param forumService the forumService to set
	 */

	@Autowired(required=true)
	@Qualifier(value="forumService")
	public void setForumService(ForumService forumService) {
		this.forumService = forumService;
	}

	/**
	 * @param blogService the blogService to set
	 */
	@Autowired(required=true)
	@Qualifier(value="blogService")
	public void setUserService(BlogService blogService)
	{
		this.blogService=blogService;
	}
	
	/* request mapping of admin page*/

	@RequestMapping("/admin/adminPage")
	public ModelAndView home(Model model)
	{   
		return new ModelAndView("admin");
	}
	
	
	/*@RequestMapping("/admin/forum")
	public ModelAndView adminForum(Model model,@RequestParam(name="loginid")String nm )
	{
		model.addAttribute("forum",new Forum());
		System.out.println(nm);
		int id=userService.getUserId(nm);
		System.out.println(id);
		model.addAttribute("userid",id);
		return new ModelAndView("forum");
	}*/
	
	/* request mapping of admin page of forum*/
	@RequestMapping("/admin/forum")
	public ModelAndView adminForum(Model model,HttpServletRequest request)
	{	Forum f=new Forum();	
	 	model.addAttribute("listForum", forumService.getAllForums());
	 	//System.out.println(new Gson().toJson(forumService.getAllProducts()));
		model.addAttribute("forum",f);
		return new ModelAndView("forum");
		
	}
			
	/* request mapping of admin page of Add forum*/
	@RequestMapping(value="/admin/forum/add",method=RequestMethod.POST)
	public String adminForumAdd(@Valid @ModelAttribute("forum") Forum f,BindingResult result, Model model,HttpServletRequest request)
	{ System.out.println("forum add");
	
	 
		String s=null;
		if(result.hasErrors())
		{  System.out.println("error");
		model.addAttribute("listForum", forumService.getAllForums());
			s="/admin/forum";	
		}		
		else
		{ if(f.getId()==0){
			System.out.println("success forum add");
			Principal principal = request.getUserPrincipal();
			int id=userService.getUserId(principal.getName());
		    UserRegister u=userService.getUserById(id);
		    System.out.println(u.getId());
			f.setUser(u);
			//u.getForumDetails().add(f);
		    forumService.addForum(f);
			}		
		    else
		    {
			    this.forumService.updateForum(f);		
		    }
			s="/admin/forum";
		}
		return "redirect:"+s;
	}
	
	/* request mapping of admin page of delete forum*/
	@RequestMapping("/admin/delete/{id}")
	String deleteProduct(@PathVariable("id") int id)
	{
		this.forumService.removeForum(id);
		return "redirect:/admin/forum";
	}
	
	/* request mapping of admin page of edit forum*/
	@RequestMapping("/admin/edit/{id}")
    public String updateForum(@PathVariable("id") int id, Model model){
        model.addAttribute("forum", this.forumService.getForumById(id));
        model.addAttribute("listForum",this.forumService.getAllForums());
        return "redirect:/admin/forum";
    }    
	
	/* request mapping of admin page of blog*/
	@RequestMapping("/admin/blog")
	public ModelAndView adminBlog(Model model,HttpServletRequest request)
	{	Forum f=new Forum();	
	 	model.addAttribute("listblog", blogService.getAllBlogs());
	 	//System.out.println(new Gson().toJson(forumService.getAllProducts()));
		model.addAttribute("blog",f);
		return new ModelAndView("blog");
		
	}
	

	
	
}
