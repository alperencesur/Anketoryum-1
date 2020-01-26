package com.anket.Anketoryum.model;

public class User {
	
	private String username;
	private String email;
	private String password;
	private String registerDate;
	private int age;
	private int gender;
	private int place;
	
	
	public User() {
		super();
	}
	public User(String username, String email, String password, String registerDate, int age, int gender,
			int place) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.registerDate = registerDate;
		this.age = age;
		this.gender = gender;
		this.place = place;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getPlace() {
		return place;
	}
	public void setPlace(int place) {
		this.place = place;
	}
	
	

}
