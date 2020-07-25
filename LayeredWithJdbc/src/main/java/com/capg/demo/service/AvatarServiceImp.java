package com.capg.demo.service;

import java.sql.SQLException;

import com.capg.demo.bean.Avatar;
import com.capg.demo.dao.AvatarDao;
import com.capg.demo.dao.AvatarDaoImp;

public class AvatarServiceImp implements AvatarService {
	AvatarDao dao;
	

	public AvatarServiceImp() throws SQLException {
		dao=new AvatarDaoImp();
	}

	public Avatar addAvatar(Avatar av) throws SQLException {
		// TODO Auto-generated method stub
		return dao.addAvatar(av);
	}

	public Avatar deleteAvatar(int aid) throws SQLException {
		// TODO Auto-generated method stub
		return dao.deleteAvatar(aid);
	}

	public Avatar getAvatar(int aid) throws SQLException {
		// TODO Auto-generated method stub
		return dao.getAvatar(aid);
	}

	/*public Avatar updateAvatar(int up) throws SQLException {
		// TODO Auto-generated method stub
		return dao.updateAvatar(up);
	}*/

}
