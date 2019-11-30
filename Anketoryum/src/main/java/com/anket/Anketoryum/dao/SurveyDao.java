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

	public SurveyDB[] getSurvey() {		
		return repository.getSurvey();
	}
	
	public void addSurvey(SurveyDB survey) {
		repository.addSurvey(survey.getQuestion(),survey.getCreatorID(),survey.getDate(),survey.getFinishDate());
	}
	public int getSurveyID(int userID,String date) {
		return repository.getSurveyID(userID, date);
	}
}
