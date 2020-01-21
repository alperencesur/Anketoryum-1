package com.anket.Anketoryum.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Answers")
public class AnswerGet {
	@Id
	@Column(name="AnswerID")
	public int answerID;
	
	@Column(name="DESCRIPTION")
	public String description;
	
	@Column(name="CHOICESID")
	public int choiceid;

	
	public AnswerGet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnswerGet(int answerID, String description, int choiceid) {
		super();
		this.answerID = answerID;
		this.description = description;
		this.choiceid = choiceid;
	}

	public int getAnswerID() {
		return answerID;
	}

	public void setAnswerID(int answerID) {
		this.answerID = answerID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getChoiceid() {
		return choiceid;
	}

	public void setChoiceid(int choiceid) {
		this.choiceid = choiceid;
	}


	
}
