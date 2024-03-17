package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController {
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("home controller ");
		model.addAttribute("name", "saurabh");
		return "index";
	}

	@RequestMapping("/about")
	public ModelAndView about() {
		System.out.println("About controller ");
		ModelAndView model = new ModelAndView();
		model.addObject("name","Saurabh");
		model.addObject("desc", "I am on about page");
		model.setViewName("about");
		return model;
	}
}
