package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="MongoAggre")
public class QuestionBank 
{
	@Id
	private String id;
	private String question;
	private List<Options> options;
	public QuestionBank() {
		super();
		this.options=new ArrayList<>();
	}
	public QuestionBank(String id, String question, List<com.example.demo.domain.Options> options) {
		super();
		this.id = id;
		this.question = question;
		this.options = options;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Options> getOptions() {
		return options;
	}
	public void setOptions(List<Options> options) {
		this.options = options;
	} 

}
