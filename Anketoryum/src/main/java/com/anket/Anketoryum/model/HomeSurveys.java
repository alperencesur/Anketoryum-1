package com.anket.Anketoryum.model;

public class HomeSurveys {
	private int surveyID;
	private String question;
	private int isVoted;
	private long voteNumber;
	
	public HomeSurveys(int surveyID, String question, int isVoted, long voteNumber) {
		super();
		this.surveyID = surveyID;
		this.question = question;
		this.isVoted = isVoted;
		this.voteNumber = voteNumber;
	}

	public HomeSurveys() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getIsVoted() {
		return isVoted;
	}

	public void setIsVoted(int isVoted) {
		this.isVoted = isVoted;
	}

	public long getVoteNumber() {
		return voteNumber;
	}

	public void setVoteNumber(long voteNumber) {
		this.voteNumber = voteNumber;
	}

	
	
}
