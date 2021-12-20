package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("index")
	public String index() {
		
		System.out.println("index page입니다.");
		return "home.index";
	}
}