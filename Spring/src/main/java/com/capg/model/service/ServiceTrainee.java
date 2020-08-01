package com.capg.model.service;





import java.util.List;

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
	
	public int deleteTrainee(int id)  {
		return dao.deleteTrainee(id);
	}

	public Trainee updateTrainee(Trainee t) {

		return dao.updateTrainee(t);
	}
	
	public List<Trainee> findAllTrainees()
	{
		return dao.getAllTrainees();
	}
	
	
	
	

}
