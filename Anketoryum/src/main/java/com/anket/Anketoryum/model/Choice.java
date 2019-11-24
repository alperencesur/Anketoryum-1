package com.anket.Anketoryum.model;

public class Choice {
	private int choiceID;
	private int questionID;
	private String description;
	
	
	public Choice(int choiceID, int questionID, String description) {
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
