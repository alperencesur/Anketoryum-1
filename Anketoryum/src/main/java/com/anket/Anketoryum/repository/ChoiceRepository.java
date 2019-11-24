package com.anket.Anketoryum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anket.Anketoryum.entity.ChoiceDB;


public interface ChoiceRepository extends JpaRepository<ChoiceDB,String>{
	
	@Query(value = "SELECT * FROM CHOICE",
		  nativeQuery = true)
	ChoiceDB[] getChoice();
  
	@Query(value= "INSERT INTO CHOICE(QUESTIONID, DESCRIPTION)"
			+ " VALUES(?1, ?2);", 
			nativeQuery = true)
	void addChoice(int questionID, String description);
}


