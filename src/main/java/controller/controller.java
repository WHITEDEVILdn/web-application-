package controller;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class controller {
	@GetMapping("/")
	
	
	public String car(Model model) {
		
		User us=new User();
		us.setName("vaibhav");
		model.addAttribute("email","vaibhav");
		return "index";
	}

}