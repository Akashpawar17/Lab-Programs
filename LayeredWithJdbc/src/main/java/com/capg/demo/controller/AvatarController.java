package com.capg.demo.controller;

import java.sql.SQLException;

import com.capg.demo.bean.Avatar;
import com.capg.demo.service.AvatarService;
import com.capg.demo.service.AvatarServiceImp;

public class AvatarController {
	AvatarService service;
	
	
	public AvatarController() throws SQLException {
		service=new AvatarServiceImp();
	}
	public Avatar addAvatar(Avatar av) throws SQLException {
		return service.addAvatar(av);
		
	}
	public Avatar deleteAvatar(int aid) throws SQLException {
		return service.deleteAvatar(aid);
	}
	
	public Avatar getAvatar(int aid) throws SQLException {
		return service.getAvatar(aid);
	}
	
	/*public Avatar updateAvatar(int up) throws SQLException {
		// TODO Auto-generated method stub
		return service.updateAvatar(up);
	}*/

}
