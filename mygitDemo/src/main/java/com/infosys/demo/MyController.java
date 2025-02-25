package com.infosys.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MyController {
	
	@GetMapping("/index")
	public ModelAndView showIndex() {
		return new ModelAndView("index");
	}
	@GetMapping("/home")
	public ModelAndView showHome() {
		return new ModelAndView("home");
	}
}
