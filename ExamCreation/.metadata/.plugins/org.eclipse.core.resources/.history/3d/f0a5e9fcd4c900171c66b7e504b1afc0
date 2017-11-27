package com.stackroute.assessmentengine.examcreation.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.stackroute.assessmentengine.examcreation.domian.Ex;
import com.stackroute.assessmentengine.examcreation.domian.QuestionPaper;
import com.stackroute.assessmentengine.examcreation.repository.ExRepo;
import com.stackroute.assessmentengine.examcreation.repository.ExamCreationRepository;

//import com.stackroute.assessmentengine.examcreation.controller.KafkaController;


@Service
public class ExamCreationServiceImpl implements ExamCreationService{

	
	@Autowired
	ExamCreationRepository examCreationRepository;
	@Autowired
	ExRepo exRepo;
	
	@Override
	public String createQuestionPaper(QuestionPaper questionPaper) {
		
		
		examCreationRepository.save(questionPaper);
		
		return "Data Saved Successfully...!";
	}

	@Override
	public List<QuestionPaper> getAll() {
		
		return examCreationRepository.findAll();
	}

	@Override
	public String exSave(Ex ex) {
		
		exRepo.save(ex);
		return "Data saved ";
	}

	@Override
	public List<QuestionPaper> getByOne(String questionId) {
		
		return examCreationRepository.findByPaperName(questionId);
	}

//	
//	@Autowired
//	private ExamCreationRepository examCreationRepository;
//	private Exam exam;
//	
//
//	
//
//
//
//	@Override
//	public List<QuestionBank> getQuestions(QuestionBank examQuestions) {
//		
//		return (List<QuestionBank>) examCreationRepository.save(examQuestions);
//		
//	
//	


	}

	
	








