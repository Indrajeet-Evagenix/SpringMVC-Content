package com.springmvcfirst.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvcfirst.model.Student;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		return new ModelAndView("home");
	}

//	@RequestMapping("/createUser")
//	public String createuser() {
//		return "register";
//	}

//	@RequestMapping("/home")
//	public String home() {
//		return "home";
//	}

	@RequestMapping("/register")
	public String handler(Model model, @ModelAttribute Student student, @RequestParam("name") String name,
			@RequestParam("email") String email, @RequestParam("password") String password) {

//		System.out.println(student);
		student.setName(name);
		student.setEmail(email);
		student.setPassword(password);

//		student.setName("Indrajeet");
//		student.setEmail("indrajeet@gmail.com");
//		student.setPassword("12345");
		model.addAttribute("Success", student);
		System.out.println(student.getName());
		return "register";
	}
}
