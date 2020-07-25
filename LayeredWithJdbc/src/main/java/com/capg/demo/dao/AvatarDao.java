package com.capg.demo.dao;

import java.sql.SQLException;

import com.capg.demo.bean.Avatar;

public interface AvatarDao {
	
	Avatar addAvatar(Avatar av) throws SQLException;
	Avatar deleteAvatar(int id) throws SQLException;
	
	Avatar getAvatar(int id) throws SQLException;
	//Avatar updateAvatar(int id,String sname) throws SQLException;
	//Avatar updateAvatar(int up) throws SQLException;
	
	
	
	
	
	

}
