package com.vk.advance.control;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vk.advance.model.FacultyRegistrationDetails;
import com.vk.advance.model.StudentRegistrationDetails;
import com.vk.advance.repository.FacultyRegistrationDao;
import com.vk.advance.repository.StudentRegistrationDao;


@Controller
@RequestMapping("/faculty-reg")
public class FacultyRegistrationControl {
	
	@Autowired
	FacultyRegistrationDetails srd;
	
	@Autowired
	FacultyRegistrationDao srdao;
	
	@RequestMapping(method=RequestMethod.GET)
	public String getStudentRegister(Model model)
	{
		model.addAttribute("facultyRegister", srd);
		return "faculty-register";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String saveStudent(@Valid @ModelAttribute("facultyRegister") FacultyRegistrationDetails facultyRegister, BindingResult br, Model model) {
		if(br.hasErrors()){
			System.out.println("error block");
			return "faculty-register";
		}
		System.out.println(facultyRegister);
		int res=srdao.saveStudentDetails(facultyRegister);
		if(res==0)
		{
			return "faculty-register";
		}
		return "faculty-registration-success";
		
}
}
