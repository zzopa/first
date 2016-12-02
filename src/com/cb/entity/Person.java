package com.cb.entity;

import com.cb.annotation.Column;
import com.cb.annotation.Table;

@Table("Person")
public class Person {

	@Column("name")
	private String name;
	
	@Column("age")
	private int age;
	
	@Column("email")
	private String email;
	
	@Column("pwd")
	private String password;
	
	@Column("tel")
	private String telPhone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public String getTelPhone() {
		return telPhone;
	}

	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}
	
	
	
	
}
