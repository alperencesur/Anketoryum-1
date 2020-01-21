package com.anket.Anketoryum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anket.Anketoryum.Presenter;
import com.anket.Anketoryum.model.Survey;
import com.anket.Anketoryum.service.AnswerGetService;

@RestController
@RequestMapping("/answers")
public class AnswersController {
	@Autowired
	private AnswerGetService answerGetService;
	
	@RequestMapping(value= "/get/{id}", method = RequestMethod.GET)
	public Presenter getAnswers(@PathVariable("id") int id) {
		try {
			return new Presenter(200, "Success", answerGetService.getAnswers(id));
		}
		catch(Exception e) {
			return new Presenter(400, e.getMessage(), null);
		}
	}
	
	
}
