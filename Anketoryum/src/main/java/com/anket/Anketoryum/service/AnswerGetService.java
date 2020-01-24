package com.anket.Anketoryum.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anket.Anketoryum.dao.AnswersDao;
import com.anket.Anketoryum.entity.AnswerGet;
import com.anket.Anketoryum.model.Answer;

@Transactional
@Service
public class AnswerGetService {
	
	@Autowired
	AnswersDao answersDao;
	
	public AnswerGet[] getAnswers(int questionID) {
		return answersDao.getAnswers(questionID);
	}
	
	public String addAnswer(Answer answer) {
		Date date = new Date(); 
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println(formatter.format(date));
		System.out.println(answer.getChoicesid());
		answersDao.addAnswer(answer.getUserID(), answer.getQuestionID(), answer.getChoicesid(), formatter.format(date));
		return "Success";
	}
}
