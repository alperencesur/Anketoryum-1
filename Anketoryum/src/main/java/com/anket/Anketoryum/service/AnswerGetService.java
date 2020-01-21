package com.anket.Anketoryum.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anket.Anketoryum.dao.AnswersDao;
import com.anket.Anketoryum.entity.AnswerGet;

@Transactional
@Service
public class AnswerGetService {
	
	@Autowired
	AnswersDao answersDao;
	
	public AnswerGet[] getAnswers(int questionID) {
		return answersDao.getAnswers(questionID);
	}
}
