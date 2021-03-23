package com.furniture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping(value = {"","/","home","index"})
	public String homePage() {
		return "home";
	}
	@GetMapping(value = "/comming-soon")
	public String commingPage() {
		return "comming-soon";
	}
}
