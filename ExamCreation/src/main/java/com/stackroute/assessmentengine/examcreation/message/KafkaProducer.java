//package com.stackroute.assessmentengine.examcreation.message;
//import javax.ws.rs.Produces;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//import com.stackroute.assessmentengine.examcreation.domian.Exam;
//import com.stackroute.assessmentengine.examcreation.exception.KafkaUnavialableException;
//
//
//
//@Service
//public class KafkaProducer {
//    private static final Logger log = LoggerFactory.getLogger(KafkaProducer.class);
//    
//    
//    private KafkaTemplate<String,Exam > kafkaTemplate;
//    
//    @Autowired
//    public void setKafkaTemplate(KafkaTemplate<String,Exam> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    @Value("${topic}")
//    String kafkaTopic;
//    
//    
//    public void send(Exam exam)  throws KafkaUnavialableException{
//        log.info("sending data='{}'", exam + " , For topic : " + kafkaTopic);
//        try {
//        kafkaTemplate.send(kafkaTopic, exam);
//        }
//        catch(Exception ex) {
//            throw new KafkaUnavialableException("Kafka is temporarily unavailable");
//        }
//    }    
//}