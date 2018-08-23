package com.manarice.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.manarice.bean.CheckAuthenticationBean;
import com.manarice.bean.CustomerDetailsBean;
import com.manarice.service.ManaService;

@Controller
public class ManaRiceAuthenticationController 
{
	@Autowired
	private ManaService manaservice;
	
	
	@RequestMapping("/home.html")	
	public ModelAndView  homePage(HttpRequest request)
	{
		System.out.println("home");
		return new ModelAndView("ManaRiceHome");
		
	}
	
	@RequestMapping( value="/login",method=RequestMethod.POST)
	public ModelAndView authenticat(Model modelmap, HttpServletRequest req)
	{
		CheckAuthenticationBean checkAuthenticationBean = new CheckAuthenticationBean();
		checkAuthenticationBean.setUserId(req.getParameter("username"));
		checkAuthenticationBean.setPassword(req.getParameter("password"));
		
		String result = manaservice.checkAuthentication(checkAuthenticationBean);
		
		if(result!=null)
		{
		modelmap.addAttribute("status", "Well Come "+result);
		return new ModelAndView("Wellcome");
		}
		else
		{
			modelmap.addAttribute("err", "Invalid UserName/Password");
			return new ModelAndView("ManaRiceHome");
		}
	}
	@RequestMapping(value ="/Registration" ,method=RequestMethod.POST)
	public ModelAndView customerRegistration(Model modelmap,HttpServletRequest req)
	{
		CustomerDetailsBean customerDetailsBean = new CustomerDetailsBean();
		 customerDetailsBean.setFirstName(req.getParameter("fname"));
		 customerDetailsBean.setLastName(req.getParameter("lname"));
		 customerDetailsBean.setEmailId(req.getParameter("email"));
		 customerDetailsBean.setPassword(req.getParameter("pass"));
		 customerDetailsBean.setGender(req.getParameter("Gender"));
		 System.out.println("In registration");
		String result = manaservice.createCustomer(customerDetailsBean);
		System.out.println(result);
		if(result!=null)
		{
		modelmap.addAttribute("status", "Registered Successfully Please Login");
		return new ModelAndView("ManaRiceHome");
		}
		else
		{
			modelmap.addAttribute("status", "Error Occured");
			return new ModelAndView("CustomerRegistration");
		}
	}
	@RequestMapping("/signout")
	public ModelAndView customersignout(HttpServletRequest req)
	{
		HttpSession httpsession=req.getSession();
		httpsession.invalidate();
		return new ModelAndView("ManaRiceHome");
	}
	@RequestMapping(value="/changepassword",method=RequestMethod.POST)
	public ModelAndView changePassword(Model modelmap,HttpServletRequest req)
	{
		String result=manaservice.changePassword(req.getParameter("mail"), req.getParameter("password"));
		if(result!=null)
		{
			modelmap.addAttribute("status", "Password Changed Successfully");
			return new ModelAndView("ManaRiceHome");
		}
		else
		{
			modelmap.addAttribute("status", "Error Occur during updation");
			return new ModelAndView("Forgot");
		}
	}
	}
	
	