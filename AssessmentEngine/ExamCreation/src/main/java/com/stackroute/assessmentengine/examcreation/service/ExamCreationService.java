package com.stackroute.assessmentengine.examcreation.service;




import java.util.List;
import org.springframework.stereotype.Service;
import com.stackroute.assessmentengine.examcreation.domian.CreateExam;
import com.stackroute.assessmentengine.examcreation.domian.QuestionPaper;

@Service
public interface ExamCreationService 
{
			
	public String createQuestionPaper(QuestionPaper questionPaper);
	public List<QuestionPaper> getAll();
	public List<QuestionPaper> getByOne(String questionId);
	public String createExam(CreateExam createExam);
	public List<CreateExam> getAllStudents();
	public List<CreateExam> getQuestionPaperName(String emailId);
}





