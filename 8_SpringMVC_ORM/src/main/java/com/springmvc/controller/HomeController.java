package com.springmvc.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.springmvc.entity.User;
import com.springmvc.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;

	@RequestMapping("/home")
	public String home() {

		Integer.parseInt("Indrajeet");
		String name = null;
		name.toUpperCase();
		return "home";
	}
	
//	@ExceptionHandler(NumberFormatException.class)
//	public String numberException() {
//
//		return "error";
//	}
//
//	@ExceptionHandler(NullPointerException.class)
//	public String emptyException() {
//
//		return "error";
//	}
	
//	@ExceptionHandler(Exception.class)
//	public String allException() {
//
//		return "error";
//	}

	@RequestMapping("/register")
	public String signup() {
		return "register";
	}

	@RequestMapping(path = "/createUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute User user, @RequestParam("img") String img, Model m) {

		user.setImage(img);
		userService.saveUser(user);
		return "success";
	}

	@RequestMapping(path = "/google")
	public String redirectPage() {
		return "redirect:https://www.google.com";
	}

	@RequestMapping(path = "/yahoo")
	public RedirectView redirect2Page() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://in.search.yahoo.com");

		return redirectView;
	}

	@RequestMapping(path = "/search", method = RequestMethod.POST)
	public String search(@RequestParam("keyword") String keyword) {

		String url = "https://www.google.com/search?q=" + keyword;
		return "redirect:" + url;
	}

	@RequestMapping(path = "/user/{id}/{name}")
	public String demo(@PathVariable("id") int id, @PathVariable String name) {

		System.out.println("id: " + id);
		System.out.println("Name: " + name);
		return "home";

	}

	@RequestMapping(path = "/load_file_upload")
	public String loadFileUpload() {

		return "file_upload";

	}

	@RequestMapping(path = "/fileUpload", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("img") CommonsMultipartFile file, HttpServletRequest req, Model m) {

		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getContentType());
		System.out.println(file.getSize());

		byte[] bytes = file.getBytes();

		String path = req.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources"
				+ File.separator + "img" + File.separator + file.getOriginalFilename();

		System.out.println(path);

		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(bytes);
			fos.close();
			System.out.println("File Uploaded Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("imgname", file.getOriginalFilename());

		return "file_success";

	}

}
