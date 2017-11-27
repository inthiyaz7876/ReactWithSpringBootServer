package com.student.service;

import com.student.domain.Student;

public interface StudentService {
	
	public String createStudent(Student student) ;
	
	public String updateStudent(Student student);
	
	public String deleteStudent(int id);
	
	public String getById(int id);
		
	
}
