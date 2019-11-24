package com.anket.Anketoryum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.anket.Anketoryum.entity.SurveyDB;

public interface SurveyRepository extends JpaRepository<SurveyDB,String> {
	
	@Query(value="SELECT * FROM SURVEY", 
			nativeQuery = true)
	SurveyDB[] getSurvey();

	@Query(value=" INSERT INTO Survey(question,creatorID,date,finishdate)"
			+ " VALUES (?1, ?2,?3,?4);",nativeQuery = true)
	String addSurvey(String question, int UserID,String date,String finishDate);
}
