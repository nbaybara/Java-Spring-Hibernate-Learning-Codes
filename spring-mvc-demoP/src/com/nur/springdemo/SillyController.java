package com.nur.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SillyController {
	
	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "silly";
	}
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld-form";
	}
}
