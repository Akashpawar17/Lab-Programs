package com.capg.demo.info.model;

public class MovieInfo {
	
	
	private int id;
	private String movieName;
	private double rating;
	
	
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	private int getCatlogPort;
	private int getRatingPort;
	
	public int getGetCatlogPort() {
		return getCatlogPort;
	}
	public void setGetCatlogPort(int getCatlogPort) {
		this.getCatlogPort = getCatlogPort;
	}
	public int getGetRatingPort() {
		return getRatingPort;
	}
	public void setGetRatingPort(int getRatingPort) {
		this.getRatingPort = getRatingPort;
	}
	public MovieInfo() {
	
		// TODO Auto-generated constructor stub
	}
	public MovieInfo(int id, String movieName, double rating) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.rating = rating;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getmovieName() {
		return movieName;
	}
	public void setmovieName(String movieName) {
		this.movieName = movieName;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	

}
