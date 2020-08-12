package com.capg.demo.info.model;


public class MovieCatlog {

	private int id;
	
	private String movieName;
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

	public String getmovieName() {
		return movieName;
	}

	public void setmovieName(String movieName) {
		this.movieName = movieName;
	}

	public MovieCatlog(int id, String movieName) {
		super();
		this.id = id;
		this.movieName = movieName;
	}

	@Override
	public String toString() {
		return "MovieCatlog [id=" + id + ", movieName=" + movieName + "]";
	}

	public MovieCatlog() {
		
		// TODO Auto-generated constructor stub
	}



	

}
