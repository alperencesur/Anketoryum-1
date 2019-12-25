package com.anket.Anketoryum.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Answers")
public class AnswersDB {

	@EmbeddedId
	public AnswersKey answersKey;

	@Column(name="CHOICEID")
	public int choiceID;
	
	@Column(name="DATE")
	public String date;
	
	

	public AnswersDB(AnswersKey answersKey, int choiceID, String date) {
		super();
		this.answersKey = answersKey;
		this.choiceID = choiceID;
		this.date = date;
	}

	public AnswersKey getAnswersKey() {
		return answersKey;
	}

	public void setAnswersKey(AnswersKey answersKey) {
		this.answersKey = answersKey;
	}

	public int getChoiceID() {
		return choiceID;
	}

	public void setChoiceID(int choiceID) {
		this.choiceID = choiceID;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
