package com.anket.Anketoryum.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Choice")
public class ChoiceDB {
	
	@Id
	@Column(name="CHOICEID")
	public int choiceID;
	
	@Column(name="QUESTIONID")
	public int questionID;
	
	@Column(name="DESCRIPTION")
	public String description;
	
	public ChoiceDB() {
		super();
	}
	
	
	public ChoiceDB(int choiceID, int questionID, String description) {
		super();
		this.choiceID = choiceID;
		this.questionID = questionID;
		this.description = description;
	}



	public int getChoiceID() {
		return choiceID;
	}

	public void setChoiceID(int choiceID) {
		this.choiceID = choiceID;
	}

	public int getQuestionID() {
		return questionID;
	}

	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}
