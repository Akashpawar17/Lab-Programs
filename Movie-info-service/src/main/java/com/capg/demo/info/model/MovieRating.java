package com.capg.demo.info.model;





public class MovieRating {

	private int id;
	
	private double rating;
	private int port;
	
	

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public MovieRating(int id, double rating) {
		super();
		this.id = id;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "MovieCatlog [id=" + id + ", rating=" + rating + "]";
	}

	public MovieRating() {
		
		// TODO Auto-generated constructor stub
	}
	

}
