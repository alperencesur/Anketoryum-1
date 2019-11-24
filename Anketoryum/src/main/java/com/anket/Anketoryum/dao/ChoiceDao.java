package com.anket.Anketoryum.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anket.Anketoryum.entity.ChoiceDB;
import com.anket.Anketoryum.repository.ChoiceRepository;

@Component
public class ChoiceDao {

	@Autowired
	public ChoiceRepository repository;
	
	public ChoiceDB[] getChoice(){
		return repository.getChoice();
	}
	
	public void addChoice(int creatorID, String[] choice) {
		for(int i=0; i<choice.length; i++) {
		repository.addChoice(creatorID, choice[i]);
		}
	}
}
