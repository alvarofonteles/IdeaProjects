package com.codegate01.fragments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/fragments")
	public String index() {
		return "index";
	}

	@RequestMapping("/fragments/blog")
	public String blog() {
		return "blog";
	}

	@RequestMapping("/fragments/contact")
	public String contact() {
		return "contact";
	}

}
