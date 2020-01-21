package com.anket.Anketoryum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anket.Anketoryum.Presenter;
import com.anket.Anketoryum.service.ChoiceService;

@RestController
@RequestMapping("/choice")
public class ChoiceController {
	
	@Autowired
	private ChoiceService choiceService;
	
	@RequestMapping(value= "/get", method = RequestMethod.GET)
	public Presenter getChoice() {
		try {
			return new Presenter(200, "Success", choiceService.getChoice());
		}
		catch(Exception e){
			return new Presenter(400, e.getMessage(), null);
		}
	}
	@RequestMapping(value= "/get/{id}", method = RequestMethod.GET)
	public Presenter getAnswers(@PathVariable int id) {
		try {
			return new Presenter(200, "Success", choiceService.getSurveyChoices(id));
		}
		catch(Exception e) {
			return new Presenter(400, e.getMessage(), null);
		}
	}
}
