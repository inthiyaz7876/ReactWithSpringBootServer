package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.QuestionBank;
import com.example.demo.service.QuestionBankService;



@RestController
public class QuestionBankController 
{

		@Autowired
		QuestionBankService questionBankService;
		
	@RequestMapping(method=RequestMethod.POST, value="/create")
	public ResponseEntity<QuestionBank> create(@RequestBody QuestionBank questionBank)
	{
		return ResponseEntity.ok(questionBankService.create(questionBank));
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/questions")
	public ResponseEntity<QuestionBank> getQuestions(@RequestParam QuestionBank questionBank)
	{
		return ResponseEntity.ok(questionBankService.getQuestions(questionBank));
		
	}
}
