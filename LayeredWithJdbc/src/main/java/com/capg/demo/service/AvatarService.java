package com.capg.demo.service;

import java.sql.SQLException;

import com.capg.demo.bean.Avatar;

public interface AvatarService {
	
	Avatar addAvatar(Avatar av) throws SQLException;
	Avatar deleteAvatar(int aid) throws SQLException;
	Avatar getAvatar(int id) throws SQLException;
	//Avatar updateAvatar (int aid,String aname) throws SQLException;
	//Avatar updateAvatar(int up) throws SQLException;
	


}
