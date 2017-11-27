package com.stackroute.assessmentengine.examcreation.domian;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="studentsList")
public class CreateExam {
	
	private String examName;
	private String[] studentsName;
	
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String[] getStudentsName() {
		return studentsName;
	}
	public void setStudentsName(String[] studentsName) {
		this.studentsName = studentsName;
	}
	public CreateExam(String examName, String[] studentsName) {
		super();
		this.examName = examName;
		this.studentsName = studentsName;
	}
	public CreateExam() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
