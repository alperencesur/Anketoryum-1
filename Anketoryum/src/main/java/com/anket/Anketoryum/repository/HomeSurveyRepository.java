package com.anket.Anketoryum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.anket.Anketoryum.entity.HomeSurvey;
import com.anket.Anketoryum.entity.SurveyChoices;

public interface  HomeSurveyRepository  extends JpaRepository<HomeSurvey,Integer> {
	@Modifying
	@Query(value="SELECT SURVEYID, QUESTION FROM SURVEY WHERE ISACTIVE = 1", nativeQuery = true)
	HomeSurvey[] getSurveys();
	
	@Query(value="SELECT COUNT(SURVEYID) FROM SURVEY WHERE SURVEYID= ?1",nativeQuery = true)
	long getVoteNum(int surveyID);
	
	@Query(value="SELECT COUNT(SURVEYID) FROM SURVEY JOIN ANSWER"
			+ " ON (ANSWER.QUESTIONID = SURVEY.SURVEYID)"
			+ " WHERE ((SURVEY.SURVEYID = ?1) AND (ANSWER.USERID = ?2)")
	boolean getIsVoted(int surveyID, int userID);
}
