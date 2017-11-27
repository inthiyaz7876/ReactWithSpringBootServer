package com.stackroute.assessmentengine.examcreation.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.stackroute.assessmentengine.examcreation.config.SpringMongoConfig;
import com.stackroute.assessmentengine.examcreation.domian.CreateExam;
import com.stackroute.assessmentengine.examcreation.domian.QuestionPaper;
import com.stackroute.assessmentengine.examcreation.repository.ExamCreationRepository;
import com.stackroute.assessmentengine.examcreation.repository.ExamRepo;

//import com.stackroute.assessmentengine.examcreation.controller.KafkaController;


@Service
public class ExamCreationServiceImpl implements ExamCreationService{

	
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
    MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

    @Autowired
    MongoTemplate mongoTemplate;
	
	@Autowired
	ExamCreationRepository examCreationRepository;
	
	@Autowired
	ExamRepo examRepo;
	
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
	public List<QuestionPaper> getByOne(String questionId) {
		
		return examCreationRepository.findByPaperName(questionId);
	}

	@Override
	public String createExam(CreateExam createExam) {
		examRepo.save(createExam);
		
		return "Exam Created Successfully...!";
	}

	@Override
	public List<CreateExam> getQuestionPaperName(String examName) {
		
		Query query11 = new Query();
        query11.addCriteria(Criteria.where("examName").in(examName));
        List<CreateExam> examCreate = mongoOperation.find(query11, CreateExam.class);
		return examCreate;
	}

	@Override
	public List<CreateExam> getAllStudents() {
		
		return examRepo.findAll();
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

	
	








