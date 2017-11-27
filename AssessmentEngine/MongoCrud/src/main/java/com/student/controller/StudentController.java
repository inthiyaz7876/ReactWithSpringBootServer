package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.domain.Student;
import com.student.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	
	StudentService studentservice;
	@RequestMapping(Request)
	public ResponseEntity<String> create(Student student){
		studentservice.createStudent(student);
		return ResponseEntity.ok("Student create successfully");
		
	}

}
