package com.example.rms.service;

import org.springframework.stereotype.Service;

import com.example.rms.controller.StudentRegistrationDto;
import com.example.rms.entity.Student_entity;
import com.example.rms.repository.Student_repository;

@Service
public class UserServiceImpl implements UserService {
	
	@Override
	public student save(StudentRegistrationDto studentRegistrationDto) {
		Student_entity student = new Student_entity(studentRegistrationDto.getFirstName(), 
				studentRegistrationDto.getLastName(), studentRegistrationDto.getEmail(),
				studentRegistrationDto.getPassword());
		
		return Student_repository.save(student);
	}

}
