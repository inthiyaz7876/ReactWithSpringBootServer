//package com.stackroute.assessmentengine.examcreation.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.netflix.discovery.converters.Auto;
//import com.stackroute.assessmentengine.examcreation.domian.Exam;
//import com.stackroute.assessmentengine.examcreation.domian.Model;
//import com.stackroute.assessmentengine.examcreation.message.KafkaConsumer;
//import com.stackroute.assessmentengine.examcreation.message.KafkaProducer;
//
//@RestController
//@RequestMapping(value="/kafka")
//public class KafkaController 
//{
//	private Exam exam;
//
//   private KafkaProducer producer;
//    
//   private KafkaConsumer consumer;
//
//   
//    
//    @Autowired
//    public void setProducer(KafkaProducer producer) {
//        this.producer = producer;
//    }
//    @Autowired
//    public void setConsumer(KafkaConsumer consumer) {
//        this.consumer = consumer;
//    }
//   
//    @PostMapping(value="/producer" , produces = MediaType.APPLICATION_JSON_VALUE)
//    public String producer()
//    {
//        try {
//        	
//        	Exam exam= new Exam("java","oops","l1","easy","mcq");
//        producer.send(exam);
//        
//        return "Done";
//        }
//        catch(Exception e)
//        {
//            return "Problem in sending data";
//        }
//    }
//    
//    
//    
//
//}