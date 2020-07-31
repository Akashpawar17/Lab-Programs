package com.capg.model.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capg.model.Trainee;
import com.capg.model.service.ServiceTrainee;

@Controller
public class TraineeController {
	@Autowired
	ServiceTrainee service;
	
	
	@PostMapping("/login")
	public String login(@RequestParam("uname") String uname,@RequestParam("password") String password, Model m) {
		


		
		if(uname.equals("akash")&password.equals("12345")) {
			m.addAttribute("uname" ,uname);
			m.addAttribute("password" ,password);
			
			
			return "show";

		}
		else {
		
		return "login";
		}
	}
	@PostMapping("/add")
	public String addTrainee(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("domain") String domain,@RequestParam("location") String location,Model m)  {
Trainee trainee=new Trainee(id,name,domain,location);
service.addTrainee(trainee);
m.addAttribute("trainee", trainee);
return "show";

		
		
	}
	@GetMapping("/find")
	public String findTrainee(@RequestParam("id") int id,Model m)  {
		Trainee trainee=service.findTrainee(id);
		m.addAttribute("tranee",trainee);
		return "show";
		
	}
	
	
@PostMapping("/remove")
	public String deleteAvatar(@RequestParam("id") int id,Model m) {
		
		if( service.deleteTrainee(id)) {
			return "show";
		}
	
		else {
			m.addAttribute("remove", "not found");
			return "null";
		}
		
	}
	/*@PostMapping("/update")
	public String updateTrainee(@RequestParam("id") int id,Model m)  {
		Trainee trainee=new Trainee();
	service.updateTrainee(id);
		m.addAttribute("trainee",trainee);
		return "update-trainee";
		
	}*/
}
	
	
	
	



