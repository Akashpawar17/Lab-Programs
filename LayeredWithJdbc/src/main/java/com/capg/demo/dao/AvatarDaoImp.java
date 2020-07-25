package com.capg.demo.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.capg.demo.bean.Avatar;

public class AvatarDaoImp implements AvatarDao {
	Connection con;
	PreparedStatement ps;
	
	public AvatarDaoImp() throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl",
														"hr","12");
	}
	public Avatar addAvatar(Avatar av) throws SQLException {
		
		
		
		
			ps=con.prepareStatement("insert into avatar values(?,?,?)");
			
			ps.setInt(1, av.getAid());
			ps.setString(2, av.getAname());
			ps.setString(3, av.getAbranch());
			
			int rs= ps.executeUpdate();
			/*while(rs>0) {
				System.out.println(""+rs);
				
			}*/
			if(rs>0) {
				return av;
			}
			else {
				return null;
			}
			
		
		}
		
		
		
		


	

	public Avatar deleteAvatar(int aid) throws SQLException {
	
		Avatar avatar=new Avatar(aid,"aname","abranch");

		PreparedStatement ps=con.prepareStatement("delete from avatar where aid=?"+aid);  
		ps.setInt(1, aid);
			
			int rs= ps.executeUpdate();
			
			if(rs>0)
				{
				return avatar;
			}
			else 
				return  null;
				
				
				
				
				
				
			}
			
			
			
			
		
		
		
		
	
		
	

	public Avatar getAvatar(int aid) throws SQLException {
		Avatar avatar=new Avatar();

		PreparedStatement ps=con.prepareStatement("select * from avatar where aid=?");  
		ps.setInt(1, aid);
		
		
	ResultSet rs=	ps.executeQuery();
	  if(rs!=null)
      {
      while(rs.next())
      {
      	avatar.setAid(rs.getInt("aid"));
      	avatar.setAname(rs.getString("aname"));
      	avatar.setAbranch(rs.getString("abranch"));
      }
		return avatar;
		
      }
      else
      	return null;
   


		
	}
	/*public Avatar updateAvatar(int up) throws SQLException {
		Avatar avatar=new Avatar();

		PreparedStatement ps=con.prepareStatement("update avatar set aname=? where aid=?");
		ps.setInt(1, up);
		
		
	int rs=	ps.executeUpdate();
	if(rs>0) {
		return avatar;
	}
		
	
		return null;
	}
	*/

}
