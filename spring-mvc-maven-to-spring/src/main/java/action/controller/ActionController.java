package action.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/action")
public class ActionController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String helloAction(Model model){
		model.addAttribute("message","hello world! ");
		return "hello";
	}

}
