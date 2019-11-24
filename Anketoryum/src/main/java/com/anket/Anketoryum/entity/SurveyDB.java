package com.anket.Anketoryum.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Survey")
public class SurveyDB {
	
	@Id
	@Column(name="SURVEYID")
	public int surveyID;
	
	@Column(name="QUESTION")
	public String question;
	
	@Column(name="CREATORID")
	public int creatorID;
	
	@Column(name="DATE")
	public String date;
	
	@Column(name="FINISHDATE")
	public String finishDate;
	
	@Column(name="ISACTIVE")
	public int isActive;
	
	@Column(name="SUBJECT")
	public String subject;
	
	public SurveyDB(){
		   super();
	}
	
	public SurveyDB(int surveyID, String question, int creatorID, String date, String finishDate, int isActive,
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
