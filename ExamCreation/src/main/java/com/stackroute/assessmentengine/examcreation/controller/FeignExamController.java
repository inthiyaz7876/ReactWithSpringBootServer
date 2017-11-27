package com.stackroute.assessmentengine.examcreation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.assessmentengine.examcreation.fienclient.FeignClientService;



@RestController
public class FeignExamController {
	
	@Autowired
	FeignClientService feignClientService;
//
//	@RequestMapping(method=RequestMethod.GET,value="/specquestions/{subject}/{topic}/{level}/{complexity}/{questionType}")
//    public ResponseEntity<List<QuestionBank>> getSpecificQuestions(@PathVariable String subject,@PathVariable String topic,@PathVariable String level,@PathVariable String complexity,@PathVariable String questionType)
//	{
//        List<QuestionBank> questionBankList=feignClientService.findRequired(subject,topic,level,complexity,questionType); 
//        return new ResponseEntity<List<QuestionBank>>(questionBankList, HttpStatus.OK);
//        
//    }

}
