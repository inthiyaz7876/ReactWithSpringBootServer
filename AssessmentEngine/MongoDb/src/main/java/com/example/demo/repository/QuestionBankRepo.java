package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.QuestionBank;
@Repository
public interface QuestionBankRepo extends MongoRepository<QuestionBank,String> 
{

}
