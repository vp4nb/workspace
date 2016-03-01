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
import com.vk.advance.model.StudentRegistrationDetails;
import com.vk.advance.repository.StudentLoginDao;


@Controller
@RequestMapping("/student-log")
public class StudentLoginControl {
	
		@Autowired
		StudentLoginDetails sld;
		@Autowired
		StudentLoginDao sdao;
		
		@RequestMapping(method=RequestMethod.GET)
		public String getFaculty(Model model)
		{
			model.addAttribute("studentLogin", sld);
			return "student-login";
		}
		@RequestMapping(method=RequestMethod.POST)
		public String saveFaculty(@Valid @ModelAttribute("studentLogin") StudentLoginDetails studentLogin, BindingResult br, Model model) {
			if(br.hasErrors()){
				System.out.println("error block");
				return "student-login";
			}
			StudentRegistrationDetails srd=sdao.retriveDetails(studentLogin);
			System.out.println(srd);
			model.addAttribute("studentwelcome", srd);
			
			return "student-welcome";
			
	}

}



