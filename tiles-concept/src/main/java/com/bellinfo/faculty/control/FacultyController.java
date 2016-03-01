package com.bellinfo.faculty.control;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bellinfo.faculty.model.FacultyLogin;
import com.bellinfo.faculty.service.FacultyServiceImpl;

@Controller
@RequestMapping("/flogin")
public class FacultyController {
	@Autowired
	FacultyLogin fac;
	@Autowired
	FacultyServiceImpl sImp;
	
	@RequestMapping(method=RequestMethod.GET)
	public String getFaculty(Model model)
	{
		model.addAttribute("fac", fac);
		return "faculty-reg";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String saveFaculty(@Valid @ModelAttribute("fac") FacultyLogin fac,BindingResult br, Model model) {
		if(br.hasErrors()){
			System.out.println("error block");
			return "faculty-reg";
		}
		int id=sImp.saveFaculty(fac);
		model.addAttribute("fac", fac);
		model.addAttribute("id", id);
		return "success";
	}
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String getFacultyList(Model model)
	{
		List<FacultyLogin> fList=sImp.getFaculty();
		System.out.println(fList);
		model.addAttribute("faclist",fList);
		return "fac-list";
	}
}
