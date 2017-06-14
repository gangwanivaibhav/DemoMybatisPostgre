package com.mycompany.app;

public class User {
	private int id;
	private String name;
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(int id, String name){
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
