package com.bellinfo.faculty;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/faculty")
public class FacultyController {
	@Autowired
	FacultyRegister fr;
	
	@RequestMapping(method=RequestMethod.GET)
	public String getFaculty(Model model)
	{
		model.addAttribute("fac", fr);
		return "faculty-reg";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String saveFaculty(@Valid @ModelAttribute("fac") FacultyRegister fac,BindingResult br, Model model) {
		if(br.hasErrors()){
			System.out.println("error block");
			return "faculty-reg";
		}
		
		String name=fac.getName();
		String email=fac.getEmail();
		System.out.println(fac);
		model.addAttribute("fac", fac);
		
		return "success";
		
	}

}