package com.anket.Anketoryum.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Survey")
public class HomeSurvey {
	
	@Id
	@Column(name="SURVEYID")
	public int surveyID;
	
	@Column(name="QUESTION")
	public String question;

	
	public HomeSurvey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HomeSurvey(int surveyID, String question) {
		super();
		this.surveyID = surveyID;
		this.question = question;
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

}
