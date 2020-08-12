package com.capg.demo.api.model;

public class UserCredentails {
	

	private String userName;
	private String password;
	public UserCredentails() {
		
		// TODO Auto-generated constructor stub
	}
	public UserCredentails(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}


