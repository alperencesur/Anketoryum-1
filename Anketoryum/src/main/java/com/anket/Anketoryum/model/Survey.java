package com.anket.Anketoryum.model;

public class Survey {
	private int surveyID;
	private String question;
	private int creatorID;
	private String date;
	private String finishDate;
	private boolean isActive;
	private String subject[];
	
	public Survey(int surveyID, String question, int creatorID, String date, String finishDate, boolean isActive,
			String[] subject) {
		super();
		this.surveyID = surveyID;
		this.question = question;
		this.creatorID = creatorID;
		this.date = date;
		this.finishDate = finishDate;
		this.isActive = isActive;
		this.subject = subject;
	}
	public int getSurveyID() {
		return surveyID;
	}
	public void setSurveyID(int surveyID) {
		this.surveyID = surveyID;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getCreatorID() {
		return creatorID;
	}
	public void setCreatorID(int creatorID) {
		this.creatorID = creatorID;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(String finishDate) {
		this.finishDate = finishDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String[] getSubject() {
		return subject;
	}
	public void setSubject(String[] subject) {
		this.subject = subject;
	}
	
}
