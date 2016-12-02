package com.cb.entity;

import com.cb.annotation.Column;
import com.cb.annotation.Table;

@Table("student")
public class Student {

	@Column("stu_name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
