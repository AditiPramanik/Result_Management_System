package com.example.rms.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.rms.controller.StudentRegistrationDto;
import com.example.rms.entity.Student_entity;

public interface UserService extends UserDetailsService {
	Student_entity save(StudentRegistrationDto studentRegistrationDto);
	}


