package com.vk.advance.control;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vk.advance.model.StudentLoginDetails;

@Controller
@RequestMapping("/student-login")
public class StudentLoginControl {
	
	@Autowired
	StudentLoginDetails studentLogin;
	@RequestMapping(method=RequestMethod.GET)
	public String getStudedntLogin(Model model){
		model.addAttribute("studentLogin",studentLogin);
		System.out.println("i am in get");
		return "student-login";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String getStudentLogin(@Valid @ModelAttribute("studentLogin") StudentLoginDetails studentLogin, BindingResult br, Model model){
		System.out.println("i am in post");
		if(br.hasErrors())
		{
			return "student-login";
		}
		model.addAttribute("studentLogin",studentLogin);
		System.out.println(studentLogin);
		return "student-welcome";
	}
}
