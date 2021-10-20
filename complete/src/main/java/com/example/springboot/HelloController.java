package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class HelloController {

	// @GetMapping("/")
	// public String index() {
	// 	return "Greetings from Spring Boot!";
    // }
    
    @GetMapping("/")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	@GetMapping("/xkcd")
	public String xkcd() {
		return "xkcd";
	}
}

// var comic
//comic.month+comic.day +comic.year = MMDDYYYY
//{
//"month": "10", 
//"num": 2530, 
//"link": "", 
//"year": "2021", 
//"news": "", 
//"safe_title": "Clinical Trials", 
//"transcript": "", 
//"alt": "We don't need to do a clinical trial of this change because the standard of care is to adopt new ideas without doing clinical trials.", 
//"img": "https://imgs.xkcd.com/comics/clinical_trials.png", 
//"title": "Clinical Trials", 
//"day": "18"
//}
