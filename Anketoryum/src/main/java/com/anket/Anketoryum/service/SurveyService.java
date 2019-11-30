package com.anket.Anketoryum.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anket.Anketoryum.dao.ChoiceDao;
import com.anket.Anketoryum.dao.SurveyDao;
import com.anket.Anketoryum.entity.SurveyDB;
import com.anket.Anketoryum.model.Survey;

@Transactional
@Service
public class SurveyService {

	@Autowired
	SurveyDao surveyDao;
	
	@Autowired
	CommonService commonService;
	
	
	@Autowired
	ChoiceDao choiceDao;

	
	/* Survey classı şeklinde çektik ancak database e direk böyle kaydetmiyoruz 
	 * tablelardan dolayı. 
	 * İstenen şekilde bölüyoruz.
	 */	 
	public String AddSurvey(Survey survey) {
		SurveyDB newSurvey = new SurveyDB();
		newSurvey.setQuestion(survey.getQuestion());
		newSurvey.setCreatorID(6);
		newSurvey.setDate(commonService.getDate());
		newSurvey.setFinishDate(survey.getFinishDate());
		
		System.out.println( survey.getChoice());
		choiceDao.addChoice(6, survey.getChoice());
		surveyDao.addSurvey(newSurvey);
		

		return "success";
		
	}
	
	
	public SurveyDB[] getSurvey() {
		return surveyDao.getSurvey();
	}

}
