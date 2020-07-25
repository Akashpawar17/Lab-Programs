package com.capg.demo.bean;

public class Avatar {
	
	
	private int aid;
	private String aname;
	private String abranch;
	public Avatar() {
		
	
	}
	public Avatar(int aid, String aname, String abranch) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.abranch = abranch;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAbranch() {
		return abranch;
	}
	public void setAbranch(String abranch) {
		this.abranch = abranch;
	}
	@Override
	public String toString() {
		return "Avatar [aid=" + aid + ", aname=" + aname + ", abranch=" + abranch + "]";
	}
	
	

}
