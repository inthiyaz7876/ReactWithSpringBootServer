package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.example.demo.domain.QuestionBank;
import com.example.demo.repository.QuestionBankRepo;
@Component
public class QuestionBankServiceImpl implements QuestionBankService {

	
	@Autowired
	QuestionBankRepo questionBankRepo;
	@Override
	public QuestionBank create(QuestionBank questionBank) {
		
		return questionBankRepo.save(questionBank);
	}

	@Override
	public QuestionBank getQuestions(QuestionBank questionBank) {
		
		return null;
	}

}