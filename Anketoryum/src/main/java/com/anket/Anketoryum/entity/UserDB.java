package com.anket.Anketoryum.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class UserDB {
	
	@Id
	@Column(name="userid")
	public int userID;
	
	@Column(name="email")
	public String email;
	
	@Column(name="username")
	public String username;

	public UserDB(int userID, String email, String username) {
		super();
		this.userID = userID;
		this.email = email;
		this.username = username;
	}

	public UserDB() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	
}
