package com.anket.Anketoryum.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anket.Anketoryum.dao.ChoiceDao;
import com.anket.Anketoryum.dao.SurveyDao;
import com.anket.Anketoryum.entity.HomeSurvey;
import com.anket.Anketoryum.entity.SurveyDB;
import com.anket.Anketoryum.model.HomeSurveys;
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
		surveyDao.addSurvey(newSurvey);
		int surveyID = surveyDao.getSurveyID(6,newSurvey.getDate());
		choiceDao.addChoice(surveyID, survey.getChoice());				
		return "success";
		
	}
	 /*
	public HomeSurvey[] getHomeSurveys() {	
		return surveyDao.getHomeSurveys();
	}
	*/
	public ArrayList<HomeSurveys> getHomeSurveys() {
		System.out.println("fonk girdi");
		int currentUserID = 7;
		HomeSurvey surveys[] = surveyDao.getHomeSurveys();
		System.out.println(surveys.length);
		System.out.println("fonk girdi");

		ArrayList<HomeSurveys> homeSurveys = new ArrayList<HomeSurveys>(surveys.length);
		System.out.println(surveys.length);
		System.out.println("fora gircek");
		for(int i = 0;i<surveys.length;i++) {
			HomeSurveys survey = new HomeSurveys();

			survey.setSurveyID(surveys[i].getSurveyID());
			survey.setQuestion(surveys[i].getQuestion());
			survey.setVoteNumber(surveyDao.getVoteNum(surveys[i].getSurveyID()));
			survey.setIsVoted(surveyDao.getIsVoted(surveys[i].getSurveyID(), currentUserID));
			System.out.println("Surveyid, isvoted, question, votenum:");
			System.out.println(survey.getSurveyID());
			System.out.println(survey.getIsVoted());
			System.out.println(survey.getQuestion());
			System.out.println(survey.getVoteNumber());
			homeSurveys.add(survey);
		}
		
		return homeSurveys;
	}

	
	public SurveyDB[] getSurvey() {
		return surveyDao.getSurvey();
	}

}
