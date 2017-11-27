package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.domain.QuestionBank;
@Service
public interface QuestionBankService 
{
	public QuestionBank create(QuestionBank questionBank);
	public QuestionBank getQuestions(QuestionBank questionBank);
}
