package com.anket.Anketoryum.dao;

import java.util.List;

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
	
	public void addChoice(int questionID, List<String> choice) {
		System.out.println(choice);
		System.out.println(choice.size());
		for(int i=0; i<choice.size(); i++) {
			System.out.println( choice.get(i));
			repository.addChoice(questionID, choice.get(i));
		}
	}
}
