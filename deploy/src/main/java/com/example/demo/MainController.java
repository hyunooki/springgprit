package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@Value("${file.upload}")
	String paht;
	@GetMapping("/")
	public String main() {
		System.out.println("file.upload="+paht);
		return "main";
	}
}
