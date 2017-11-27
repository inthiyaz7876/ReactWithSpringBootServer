//package com.stackroute.assessmentengine.examcreation.message;
//
//import javax.ws.rs.Consumes;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//import com.stackroute.assessmentengine.examcreation.domian.Exam;
//import com.stackroute.assessmentengine.examcreation.domian.Model;
//import com.stackroute.assessmentengine.examcreation.repository.ExamCreationRepository;
//
//
//
//@Service
//public class KafkaConsumer {
//    private static final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);
//
//    
//    Model model;
//    
//    ExamCreationRepository examreation;
//    
//    @Autowired
//    public void setModel(Model model) {
//        this.model = model;
//    }
//
//    @Value("${topic2}")
//    String kafkaTopic;
//    
//    @KafkaListener(topics="${topic2}")
//    @Consumes("application/json")
//   public void processMessage(Exam exam) {
//        log.info("received content = '{}'", exam + ", For Topic : " + kafkaTopic);
//       System.out.println(exam.toString());
//       //System.out.println(content);
//       
//    }
//}