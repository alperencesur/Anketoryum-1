package com.anket.Anketoryum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anket.Anketoryum.Presenter;
import com.anket.Anketoryum.model.Survey;
import com.anket.Anketoryum.service.SurveyService;

@RestController
@RequestMapping("/survey")
public class SurveyController {
	@Autowired
	private SurveyService surveyService;
		
	// create survey request
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Presenter addSurvey(@RequestBody Survey survey) {
		try {
			System.out.println(survey.getQuestion());
			survey.setSurveyID(124);
			return new Presenter(200, "Success",surveyService.AddSurvey(survey));
		}
		catch(Exception e) {
			return new Presenter(400, e.getMessage(), null);	
		}
	}
	// create survey request
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public Presenter getSurvey() {
		try {
			return new Presenter(200, "Success",surveyService.getSurvey());
		}
		catch(Exception e) {
			return new Presenter(400, e.getMessage(), null);	
		}
	}
	
}
