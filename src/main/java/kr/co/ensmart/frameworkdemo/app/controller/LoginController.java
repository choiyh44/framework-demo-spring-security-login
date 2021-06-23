package kr.co.ensmart.frameworkdemo.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@PostMapping("home")
	public String goHome() {
		return "home";
	}
}	
