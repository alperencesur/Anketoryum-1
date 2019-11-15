package com.anket.Anketoryum.repository;

import org.springframework.data.jpa.repository.Query;

import com.anket.Anketoryum.entity.SurveyDB;

public interface SurveyRepository {
	
	@Query(value="SELECT * FROM SURVEY", 
			nativeQuery = true)
	public SurveyDB getSurvey();

}
