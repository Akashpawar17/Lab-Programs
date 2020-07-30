package com.capg.model.service;



import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.model.Trainee;
import com.capg.model.dao.DaoTrainee;
import com.capg.model.dao.DaoTraineeJdbc;

@Service
public class ServiceTrainee {
	@Autowired
	DaoTraineeJdbc dao;
	public Trainee addTrainee(Trainee t) throws SQLException {
		return dao.addTrainee(t);
		
	}
	public Trainee findTrainee(int id) throws SQLException {
		return dao.findTrainee(id);
		
	}
	
	public Trainee deleteTrainee(int id) throws SQLException {
		return dao.removeTrainee(id);
	}
	
	
	

}
