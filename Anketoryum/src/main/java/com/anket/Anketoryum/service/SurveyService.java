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
	
	/* Survey classı şeklinde çektik ancak database e direk böyle kaydetmiyoruz 
	 * tablelardan dolayı. 
	 * İstenen şekilde bölüyoruz.
	 */	 
	public String AddSurvey(Survey survey) {
		return null;
	}
	
	
	public SurveyDB getSurvey() {
		return surveyDao.getSurvey();
	}

}
