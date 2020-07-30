package com.capg.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.capg.model.Trainee;


@Repository
public class DaoTraineeJdbc {
	Connection con;
	PreparedStatement ps;
	



	public Trainee addTrainee(Trainee t) throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl",
														"system","12345");
	
	
		
		
		
		
			ps=con.prepareStatement("insert into trainee values(?,?,?,?)");
			
			ps.setInt(1, t.getId());
			ps.setString(2, t.getName());
			ps.setString(3, t.getDomian());
			ps.setString(4, t.getLocation());
			
			int rs= ps.executeUpdate();
			/*while(rs>0) {
				System.out.println(""+rs);
				
			}*/
			if(rs>0) {
				return t;
			}
			else {
				return null;
			}
	
	

}
	public Trainee findTrainee(int id) throws SQLException {
		Trainee trainee=new Trainee();

		PreparedStatement ps=con.prepareStatement("select * from trainee where id=?"+id);  
		ps.setInt(1, id);
		
		
	ResultSet rs=	ps.executeQuery();
	  if(rs.equals(trainee.getId()))
      {
      while(rs.next())
      {
      	trainee.setId(rs.getInt("id"));
      	trainee.setName(rs.getString("name"));
      	trainee.setDomian(rs.getString("domian"));
      	trainee.setLocation(rs.getString("location"));
      	
      }
		return trainee;
		
      }
      else
      	return null;
   

}
	public Trainee removeTrainee(int id) throws SQLException {
		
		Trainee trainee=new Trainee();

		PreparedStatement ps=con.prepareStatement("delete from trainee where id=?"+id);  
		ps.setInt(1, id);
			
			int rs= ps.executeUpdate();
			
			if(rs>0)
				{
				return trainee;
			}
			else 
				return  null;
				
				
				
				
				
				
			}
}
