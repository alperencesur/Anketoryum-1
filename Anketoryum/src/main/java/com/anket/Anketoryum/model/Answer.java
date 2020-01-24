package com.anket.Anketoryum.model;

public class Answer {
	int userID;
	int questionID;
	int choicesid;

	public Answer( int userID, int questionID, int choicesid) {
		super();
		this.userID = userID;
		this.questionID = questionID;
		this.choicesid = choicesid;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getQuestionID() {
		return questionID;
	}
	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}
	public int getChoicesid() {
		return choicesid;
	}
	public void setChoicesid(int choicesid) {
		this.choicesid = choicesid;
	}
	
	
}
