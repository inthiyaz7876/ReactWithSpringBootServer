package com.stackroute.assessmentengine.examcreation.fienclient;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




@FeignClient(name="QuestionBankService")
public interface FeignClientService {

	
	
	//@RequestMapping(method=RequestMethod.GET,value="/a /specquestions/{subject}/{topic}/{level}/{complexity}/{questionType}")
	   
//	public List<QuestionBank> findRequired(@PathVariable(value="subject") String subject,@PathVariable(value="topic") String topic,@PathVariable(value="level") String level, @PathVariable(value="complexity") String complexity,@PathVariable(value="questionType") String questionType);

}
