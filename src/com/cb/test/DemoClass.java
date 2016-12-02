package com.cb.test;

import java.lang.annotation.Annotation;

import com.cb.entity.Person;
import com.cb.entity.Student;
import com.cb.entity.Users;
import com.cb.tools.ToSQLClass;

public class DemoClass {
	
	public static void main(String[] args) {
		

/*		Users user = new Users();
		user.setUseraddress("武汉");
		user.setUserstatus(1);
		System.out.println(ToSQLClass.toSQLString(user));*/
		
		Student stu = new Student();
		stu.setName("chenbo");
		System.out.println(ToSQLClass.toSQLString(stu));
		
		

	}
	
}
