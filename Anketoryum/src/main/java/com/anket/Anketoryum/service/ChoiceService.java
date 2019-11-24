package com.anket.Anketoryum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anket.Anketoryum.dao.ChoiceDao;
import com.anket.Anketoryum.entity.ChoiceDB;
import com.anket.Anketoryum.model.Choice;

@Service
public class ChoiceService {
	
	@Autowired
	ChoiceDao choiceDao;
	
	
	public ChoiceDB[] getChoice() {
		return choiceDao.getChoice();
	}
	
}
