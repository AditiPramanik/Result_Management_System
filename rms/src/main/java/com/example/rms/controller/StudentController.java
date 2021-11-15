package com.example.rms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rms.service.UserService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	 @Autowired
	 private UserService userService;

	@ModelAttribute("user")
    public StudentRegistrationDto studentRegistrationDto() {
        return new StudentRegistrationDto();
	}
	
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	@PostMapping("/register")
	public String registerUserAccount(@ModelAttribute("user") StudentRegistrationDto studentRegistrationDto) {
		userService.save(studentRegistrationDto);
		return "registration done";
	}

}
