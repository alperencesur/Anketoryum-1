package com.anket.Anketoryum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anket.Anketoryum.entity.AnswerGet;


@Repository
public interface AnswerGetRepository extends JpaRepository<AnswerGet, String>{
	@Modifying
	@Query (value = "SELECT ANSWER.ANSWERID, CHOICE.DESCRIPTION, ANSWER.CHOICESID FROM ANSWER JOIN CHOICE "
			+ "ON (CHOICE.CHOICEID = ANSWER.CHOICESID) "
			+ "WHERE (ANSWER.QUESTIONID = ?1) ", nativeQuery = true)
	AnswerGet[] getAnswers(int questionID);
}
/*
@Query (value = "SELECT CHOICE.DESCRIPTION, COUNT(ANSWERS.CHOICEID) FROM ANSWERS JOIN CHOICE "
		+ "ON (CHOICE.CHOICEID = ANSWERS.CHOICEID) "
		+ "WHERE (ANSWERS.QUESTIONID = ?1) "
		+ "GROUP BY CHOICE.DESCRIPTION", nativeQuery = true)
*/