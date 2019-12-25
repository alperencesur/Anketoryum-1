package com.anket.Anketoryum.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AnswersKey implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "USERID", nullable = false)
	public int userID;
	
    @Column(name = "QUESTIONID", nullable = false)
	public int questionID;

}
