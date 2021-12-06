package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import java.text.SimpleDateFormat;  
import java.util.Date;  

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

	@GetMapping("/xkcdSpec")
	public String xkcdSpecific(@RequestParam(name="name", required=false, defaultValue="200") String id, Model model) {
		model.addAttribute("id", id);
		return "xkcdSpecific";
	}


	Date Todaydate = new Date();  
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy/mm/dd");  
	String currentdate= formatter.format(Todaydate); 


	@GetMapping("/nasa")
	public String nasaApod(@RequestParam(name="date", required=false) String date, Model model) {
		if(date == null){
			date = currentdate;
		}
		model.addAttribute("date", date);
		return "nasa";
	}
}