package com.capg.model.service;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.model.Trainee;
import com.capg.model.dao.DaoTrainee;


@Service
public class ServiceTrainee {
	@Autowired
	DaoTrainee dao;
	public Trainee addTrainee(Trainee t)  {
		return dao.addTrainee(t);
		
	}
	public Trainee findTrainee(int id)  {
		return dao.findTrainee(id);
		
	}
	
	public boolean deleteTrainee(int id)  {
		return dao.deleteTraine(id);
	}
	
	public Trainee updateTrainee(int id)  {
		return dao.updateTrainee(id);
	}
	
	
	

}
