package com.anket.Anketoryum.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anket.Anketoryum.dao.AnswersDao;
import com.anket.Anketoryum.dao.ChoiceDao;
import com.anket.Anketoryum.entity.ChoiceDB;
import com.anket.Anketoryum.entity.SurveyChoices;
import com.anket.Anketoryum.model.Choice;

@Transactional
@Service
public class ChoiceService {
	
	@Autowired
	ChoiceDao choiceDao;
	
	@Autowired
	AnswersDao answerDao;
	
	
	public ChoiceDB[] getChoice() {
		return choiceDao.getChoice();
	}
	
	public ArrayList<Choice> getSurveyChoices(int questionId) {
		SurveyChoices choices[] = choiceDao.getSurveyChoices(questionId);
		ArrayList<Choice> choiceDetails = new ArrayList<Choice>(choices.length);
		System.out.println(choices.length);
		for(int i=0;i<choices.length;i++) {			
			Choice choice = new Choice();
			choice.setChoiceID(choices[i].getChoiceID());
			choice.setDescription(choices[i].getDescription());
			choice.setVoteNumber(answerDao.getVoteCount(choices[i].getChoiceID()));
			System.out.println(choice.getVoteNumber());
			choiceDetails.add(choice);
		}
		
		return choiceDetails;
	}
	
}
