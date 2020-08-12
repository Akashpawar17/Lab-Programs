package com.capg.demo.catlog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.demo.catlog.model.MovieCatlog;

@Repository
public interface MovieCatlogDao  extends JpaRepository<MovieCatlog, Integer>  {

	
	
}
