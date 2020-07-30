package com.capg.model;

public class Trainee {
	private int id;
	private String name;
	private String domian;
	private String Location;
	public Trainee(int id, String name, String domian, String location) {
		super();
		this.id = id;
		this.name = name;
		this.domian = domian;
		Location = location;
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
	public String getDomian() {
		return domian;
	}
	public void setDomian(String domian) {
		this.domian = domian;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", domian=" + domian + ", Location=" + Location + "]";
	}
	public Trainee() {
		
		// TODO Auto-generated constructor stub
	}
	

}
