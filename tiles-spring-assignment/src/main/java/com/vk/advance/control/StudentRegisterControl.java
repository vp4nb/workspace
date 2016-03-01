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
import com.vk.advance.repository.StudentRegistrationDao;

@Controller
@RequestMapping("/student-reg")
public class StudentRegisterControl {
	
	@Autowired
	StudentRegistrationDetails srd;
	
	@Autowired
	StudentRegistrationDao srdao;
	
	@RequestMapping(method=RequestMethod.GET)
	public String getStudentRegister(Model model)
	{
		model.addAttribute("studentRegister", srd);
		return "student-register";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String saveStudent(@Valid @ModelAttribute("studentRegister") StudentRegistrationDetails studentRegister, BindingResult br, Model model) {
		if(br.hasErrors()){
			System.out.println("error block");
			return "student-register";
		}
		System.out.println(studentRegister);
		int res=srdao.saveStudentDetails(studentRegister);
		if(res==0)
		{
			return "student-register";
		}
		return "student-registration-success";
		
}
}
