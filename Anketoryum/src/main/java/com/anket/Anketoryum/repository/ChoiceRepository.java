package com.anket.Anketoryum.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anket.Anketoryum.entity.ChoiceDB;


@Repository
public interface ChoiceRepository extends JpaRepository<ChoiceDB,String>{
	@Modifying
	@Query(value = "SELECT * FROM CHOICE",
		  nativeQuery = true)
	ChoiceDB[] getChoice();
  

	@Modifying
	@Query(value= "INSERT INTO CHOICE(QUESTIONID, DESCRIPTION)"
			+ " VALUES(?1, ?2);", 
			nativeQuery = true)
	void addChoice(int questionID, String description);
}


