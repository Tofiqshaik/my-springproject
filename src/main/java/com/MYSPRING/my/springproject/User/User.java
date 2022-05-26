package com.MYSPRING.my.springproject.User;

import javax.persistence.Entity;

@Entity
public class User {
	private int id;
	private  String name;
	private String pasword;
	private String role;
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
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pasword=" + pasword + ", role=" + role + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getPasword()=" + getPasword() + ", getRole()=" + getRole()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
		
	}
	


