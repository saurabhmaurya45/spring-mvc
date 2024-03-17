package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	@RequestMapping("/home")
	public String home() {
		System.out.println("home controller ");
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("About controller ");
		return "about";
	}
}
