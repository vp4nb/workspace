package com.vk.advance.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HtmlControl {

	@RequestMapping("/home")
	public String homePage(Model model){
		return "home";
	}
	@RequestMapping("/login")
	public String loginPage(Model model){
		return "login";
	}
	@RequestMapping("/register")
	public String registerPage(Model model){
		return "register";
	}
	@RequestMapping("/about")
	public String aboutPage(Model model){
		return "about";
	}
	@RequestMapping("/contact")
	public String contactPage(){
		return "contact";
	}
}
