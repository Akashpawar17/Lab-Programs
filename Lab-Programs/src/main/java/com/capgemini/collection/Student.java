package com.capgemini.collection;

public class Student {
	
	
	String sname;
	int age;
	int height;
	public Student(String sname, int age, int height) {
		super();
		this.sname = sname;
		this.age = age;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", age=" + age + ", height=" + height + "]";
	}
	
	

}
