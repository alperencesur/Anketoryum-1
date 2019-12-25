package com.anket.Anketoryum.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Answers")
public class AnswerGet {
	
	@Column(name="DESCRIPTION")
	public int description;
	
	@Column(name="CHOICEID")
	public int choiceid;

	public AnswerGet(int description, int choiceid) {
		super();
		this.description = description;
		this.choiceid = choiceid;
	}

	public int getDescription() {
		return description;
	}

	public void setDescription(int description) {
		this.description = description;
	}

	public int getChoiceid() {
		return choiceid;
	}

	public void setChoiceid(int choiceid) {
		this.choiceid = choiceid;
	}
	
	
}
