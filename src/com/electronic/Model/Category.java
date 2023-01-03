package com.electronic.Model;

public class Category {
	private int CategoryID;
	private String Name;
	
	public Category() {
	}

	public int getCategoryID() {
		return CategoryID;
	}

	public void setCategoryID(int categoryID) {
		CategoryID = categoryID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Category(int categoryID, String name) {
		super();
		CategoryID = categoryID;
		Name = name;
	}
	
	
	
	
	

}
