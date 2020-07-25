package com.capg.jpa;




import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity


public class Student {
	
	@Id
	private int sid;
	
	private String  sName;
	private  String dob;
	
	
	public Student() {


		// TODO Auto-generated constructor stub
	}


	public Student(int sid, String sName, String dob) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.dob = dob;
	}
	
	
	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", dob=" + dob + "]";
	}



}
