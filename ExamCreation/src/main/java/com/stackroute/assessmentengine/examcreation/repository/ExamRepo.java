package com.stackroute.assessmentengine.examcreation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.assessmentengine.examcreation.domian.CreateExam;
@Repository
public interface ExamRepo extends MongoRepository<CreateExam, String>{

}
