package com.ltts.HotelManagementSystem_Rest;

public class User {

	private String Name;
	private String UserName;
	private String email;
	private String Password;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public User(String name, String userName, String email, String password) {
		super();
		Name = name;
		UserName = userName;
		this.email = email;
		Password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
