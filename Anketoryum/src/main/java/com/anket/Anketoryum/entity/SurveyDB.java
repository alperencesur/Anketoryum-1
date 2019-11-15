package com.anket.Anketoryum.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SURVEY")
public class SurveyDB {
	
	@Id
	@Column(name="SURVEYID")
	public String surveyID;
	
	@Column(name="QUESTION")
	public String question;
	
	@Column(name="CREATORID")
	public String creatorID;
	
	@Column(name="DATE")
	public String date;
	
	@Column(name="FINISHDATE")
	public String finishDate;
	
	@Column(name="ISACTIVE")
	public int isActive;
	
	@Column(name="SUBJECT")
	public String subject;
	
	public SurveyDB(String surveyID, String question, String creatorID, String date, String finishDate, int isActive,
			String subject) {
		super();
		this.surveyID = surveyID;
		this.question = question;
		this.creatorID = creatorID;
		this.date = date;
		this.finishDate = finishDate;
		this.isActive = isActive;
		this.subject = subject;
	}
	public String getSurveyID() {
		return surveyID;
	}
	public void setSurveyID(String surveyID) {
		this.surveyID = surveyID;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getCreatorID() {
		return creatorID;
	}
	public void setCreatorID(String creatorID) {
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
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	

}
