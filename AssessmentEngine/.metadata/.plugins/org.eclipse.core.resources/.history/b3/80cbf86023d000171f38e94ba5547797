package com.stackroute.assessmentengine.examcreation.controller;


import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.stackroute.assessmentengine.examcreation.domian.Ex;
import com.stackroute.assessmentengine.examcreation.domian.QuestionPaper;
import com.stackroute.assessmentengine.examcreation.service.ExamCreationService;

@RestController

public class ExamCreationController 
{
	@Autowired
	ExamCreationService examCreationService;
	
	@CrossOrigin("*")
	@RequestMapping(method=RequestMethod.POST, value="/create")
	public ResponseEntity<String> createQuestionPaper(@RequestBody QuestionPaper questionPaper)
	{
		examCreationService.createQuestionPaper(questionPaper);
		return ResponseEntity.ok("Data Saved in Mongo ...!");
		
	}
	@CrossOrigin("*")
	@RequestMapping(method=RequestMethod.POST, value="/save")
	public ResponseEntity<String> exSave(@RequestBody Ex ex)
	{
		examCreationService.exSave(ex);
		return ResponseEntity.ok("Data Saved...!");
		
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/all")
	public ResponseEntity<List<QuestionPaper>> getAll()
	{
		return ResponseEntity.ok(examCreationService.getAll());
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/paper/{questionId}")
	public ResponseEntity<List<QuestionPaper>> getByOne(@PathVariable String questionId)
	{
		return ResponseEntity.ok(examCreationService.getByOne(questionId));
		
	}
	
    
//	@CrossOrigin(" http://localhost:3000")
	@RequestMapping(method=RequestMethod.GET , value="/all/{subject}/{topic}/{level}/{complexity}/{questionType}/{num}")
	private static void getEmployees(@PathVariable String subject,@PathVariable String topic,@PathVariable String level,@PathVariable String complexity,@PathVariable String questionType,@PathVariable String num)
	{
		
	    final String uri = "http://172.23.238.205:8081/specquestions/"+subject+"/"+topic+"/"+level+"/"+complexity+"/"+questionType+"/"+num;

	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);

	    System.out.println(result);
	}

}





