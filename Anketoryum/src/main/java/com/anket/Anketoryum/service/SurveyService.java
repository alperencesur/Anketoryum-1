package com.anket.Anketoryum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anket.Anketoryum.dao.SurveyDao;
import com.anket.Anketoryum.entity.SurveyDB;
import com.anket.Anketoryum.model.Survey;

@Service
public class SurveyService {

	@Autowired
	SurveyDao surveyDao;
	
	@Autowired
	CommonService commonService;
	
	/*
	 *  choicesDAo ve choices repository dosyaları oluşturalacak.
	@Autowired
	ChoicesDao choicesDao;
	*/
	
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
		surveyDao.addSurvey(newSurvey);
		return "success";
	}		
	public SurveyDB getSurvey() {
		return surveyDao.getSurvey();
	}

}
