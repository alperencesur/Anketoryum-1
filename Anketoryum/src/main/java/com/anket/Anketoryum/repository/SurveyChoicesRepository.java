package com.anket.Anketoryum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.anket.Anketoryum.entity.SurveyChoices;


public interface SurveyChoicesRepository extends JpaRepository<SurveyChoices,Integer>{
	
	@Modifying
	@Query(value="SELECT CHOICE.CHOICEID,CHOICE.DESCRIPTION FROM CHOICE LEFT JOIN ANSWER ON ANSWER.CHOICESID = CHOICE.CHOICEID WHERE ANSWER.QUESTIONID = 2 GROUP BY CHOICEID", 
			nativeQuery = true)
	SurveyChoices[] getSurveyChoices(int questionId);

}
