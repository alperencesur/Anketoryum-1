package com.anket.Anketoryum.model;

public class Choice {
	private int choiceID;
	private long voteNumber;
	private String description;
	
	
	public Choice(int choiceID, long voteNumber, String description) {
		super();
		this.choiceID = choiceID;
		this.voteNumber = voteNumber;
		this.description = description;
	}


	public Choice() {
		super();	
	}


	public int getChoiceID() {
		return choiceID;
	}


	public void setChoiceID(int choiceID) {
		this.choiceID = choiceID;
	}


	public long getVoteNumber() {
		return voteNumber;
	}


	public void setVoteNumber(long voteNumber) {
		this.voteNumber = voteNumber;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
