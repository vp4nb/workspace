package com.vk.advance.control;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vk.advance.model.FacultyLoginDetails;
import com.vk.advance.model.FacultyRegistrationDetails;

import com.vk.advance.repository.FacultyLoginDao;


@Controller
@RequestMapping("/faculty-log")
public class FacultyLoginControl {
	
		@Autowired
		FacultyLoginDetails sld;
		@Autowired
		FacultyLoginDao sdao;
		
		@RequestMapping(method=RequestMethod.GET)
		public String getFaculty(Model model)
		{
			model.addAttribute("facultyLogin", sld);
			return "faculty-login";
		}
		@RequestMapping(method=RequestMethod.POST)
		public String saveFaculty(@Valid @ModelAttribute("facultyLogin") FacultyLoginDetails facultyLogin, BindingResult br, Model model) {
			if(br.hasErrors()){
				System.out.println("error block");
				return "faculty-login";
			}
			FacultyRegistrationDetails srd=sdao.retriveDetails(facultyLogin);
			System.out.println(srd);
			model.addAttribute("facultywelcome", srd);
			
			return "faculty-welcome";
			
	}

}



