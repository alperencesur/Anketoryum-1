package com.anket.Anketoryum.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anket.Anketoryum.entity.SurveyDB;


@Repository
public interface SurveyRepository extends JpaRepository<SurveyDB,String> {
	@Modifying
	@Query(value="SELECT * FROM SURVEY", 
			nativeQuery = true)
	SurveyDB[] getSurvey();


	@Modifying
	@Query(value="INSERT INTO Survey(question,creatorID,date,finishdate)"
			+ " VALUES (?1,?2,?3,?4);",nativeQuery = true)
	void addSurvey(String question, int UserID,String date,String finishDate);


	@Query(value="SELECT SURVEYID FROM SURVEY WHERE ((CREATORID = ?1) AND (DATE = ?2))",nativeQuery = true)
	int getSurveyID(int UserID,String date);
	
}

