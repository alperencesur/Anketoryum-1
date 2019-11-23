package com.anket.Anketoryum.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anket.Anketoryum.entity.SurveyDB;
import com.anket.Anketoryum.model.Survey;
import com.anket.Anketoryum.repository.SurveyRepository;

@Component
public class SurveyDao {
	
	@Autowired
	private SurveyRepository repository;

	public SurveyDB getSurvey() {		
		return repository.getSurvey();
	}
	
	public void addSurvey(Survey survey) {
		repository.addSurvey(survey.getQuestion(),survey.getCreatorID(),survey.getSurveyID());
	}

}
