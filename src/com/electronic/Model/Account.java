package com.electronic.Model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int id;
	private String userName;
	private String password;
	private List<String> role;
	public Account(int id, String userName, String password, String... role) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.role = new ArrayList<String>();
	      if (role != null) {
	         for (String r : role) {
	            this.role.add(r);
	         }
	      }
	}
	public Account(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public List<String> getRole() {
		return role;
	}
	public void setRole(List<String> role) {
		this.role = role;
	}
	
	

}
