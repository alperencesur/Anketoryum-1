package com.anket.Anketoryum.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Choice")
public class SurveyChoices {
	
	@Id
	@Column(name="CHOICEID")
	public int choiceID;
		
	@Column(name="DESCRIPTION")
	public String description;
	
	public SurveyChoices() {
		super();
	}
	
	
	public SurveyChoices(int choiceID,String description) {
		super();
		this.choiceID = choiceID;
		this.description = description;
	}



	public int getChoiceID() {
		return choiceID;
	}

	public void setChoiceID(int choiceID) {
		this.choiceID = choiceID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}
