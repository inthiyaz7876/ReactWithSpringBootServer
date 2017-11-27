package com.stackroute.assessmentengine.examcreation.domian;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="new")
public class Ex {

	@Id
	private String id;
	private String name;
	private String add;
	private List<Marks> marks;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public List<Marks> getMarks() {
		return marks;
	}
	public void setMarks(List<Marks> marks) {
		this.marks = marks;
	}
	public Ex(String id, String name, String add, List<Marks> marks) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		this.marks = marks;
	}
	public Ex() {
		super();
		// TODO Auto-generated constructor stub
		this.marks=new ArrayList<>();
	}
	
}
