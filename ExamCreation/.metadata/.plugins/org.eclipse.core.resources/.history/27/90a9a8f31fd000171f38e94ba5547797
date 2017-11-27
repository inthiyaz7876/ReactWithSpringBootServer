package com.stackroute.assessmentengine.examcreation.domian;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="questionPaper")
public class QuestionPaper 
{
	public QuestionPaper() {
		
	}
	
	private String questionId;
	private String subject;
	private String topic;
	private String level;
	private String complexity;
	private String questionType;
	private String question;
	private String[] options;
	
	
	private String correctAnswer;
	private String marksAllotted;
	
	
	
	
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getComplexity() {
		return complexity;
	}
	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}
	public String getQuestionType() {
		return questionType;
	}
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public String getMarksAlloted() {
		return marksAllotted;
	}
	public void setMarksAlloted(String marksAlloted) {
		this.marksAllotted = marksAlloted;
	}
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	public QuestionPaper(String questionId,String subject, String topic, String level, String complexity, String questionType,
			String question, String[] options, String correctAnswer, String marksAlloted) {
		super();
		this.questionId=questionId;
		this.subject = subject;
		this.topic = topic;
		this.level = level;
		this.complexity = complexity;
		this.questionType = questionType;
		this.question = question;
		this.options = options;
		this.correctAnswer = correctAnswer;
		this.marksAllotted = marksAlloted;
	}
	
	
	
	
}
