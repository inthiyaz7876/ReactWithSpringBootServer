package com.stackroute.assessmentengine.examcreation.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.stackroute.assessmentengine.examcreation.domian.QuestionPaper;



@Repository
public interface ExamCreationRepository extends MongoRepository<QuestionPaper, String > 
{
	@Query("{questionId:'?0'}")
 List<QuestionPaper> findByPaperName(String questionId);

	
//	 @Query("{subject:'?0'}")
//	    Exam findCustomBySubject(String subject );
			 
}
