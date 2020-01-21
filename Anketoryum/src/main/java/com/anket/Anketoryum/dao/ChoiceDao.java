package com.anket.Anketoryum.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anket.Anketoryum.entity.ChoiceDB;
import com.anket.Anketoryum.entity.SurveyChoices;
import com.anket.Anketoryum.repository.AnswerGetRepository;
import com.anket.Anketoryum.repository.ChoiceRepository;
import com.anket.Anketoryum.repository.SurveyChoicesRepository;
import com.anket.Anketoryum.repository.SurveyRepository;

@Component
public class ChoiceDao {

	@Autowired
	public ChoiceRepository repository;
	
	@Autowired
	public SurveyChoicesRepository surveyRepository;
	
	@Autowired
	public AnswerGetRepository answerRepository;
	
	public ChoiceDB[] getChoice(){
		return repository.getChoice();
	}
	
	public SurveyChoices[] getSurveyChoices(int questionID) {
		
		return surveyRepository.getSurveyChoices(questionID);
	}
	
	public void addChoice(int questionID, List<String> choice) {
		System.out.println(choice);
		System.out.println(choice.size());
		for(int i=0; i<choice.size(); i++) {
			System.out.println( choice.get(i));
			repository.addChoice(questionID, choice.get(i));
		}
	}
}
