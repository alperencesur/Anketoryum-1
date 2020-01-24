package com.anket.Anketoryum.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anket.Anketoryum.entity.HomeSurvey;
import com.anket.Anketoryum.entity.SurveyDB;
import com.anket.Anketoryum.model.HomeSurveys;
import com.anket.Anketoryum.repository.HomeSurveyRepository;
import com.anket.Anketoryum.repository.SurveyRepository;

@Component
public class SurveyDao {
	
	@Autowired
	private SurveyRepository repository;
	
	@Autowired
	public HomeSurveyRepository homeRepository;
	
	
	public SurveyDB[] getSurvey() {		
		return repository.getSurvey();
	}
	
	public void addSurvey(SurveyDB survey) {
		repository.addSurvey(survey.getQuestion(),survey.getCreatorID(),survey.getDate(),survey.getFinishDate());
	}
	public int getSurveyID(int userID,String date) {
		return repository.getSurveyID(userID, date);
	}
	
	public HomeSurvey[] getHomeSurveys() {
		return homeRepository.getSurveys();
	}
	
	public long getVoteNum(int surveyID) {
		return homeRepository.getVoteNum(surveyID);
	}
	
	public int getIsVoted(int surveyID, int userID) {
		if(homeRepository.getIsVoted(surveyID, userID)) {
			return 1;
		}else {
			return 0;
		}
	}
}
