package com.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlienDao {
	
	public AlienModel getAlien(int aid)
	{
		AlienModel a = new AlienModel();
		String sql = "select * from alien where aid =?";
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "1234";
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, aid);
			ResultSet rs = st.executeQuery();
			if(rs.next())
			{
				a.setAid(rs.getInt(1));
				a.setAname(rs.getString(2));
				a.setTech(rs.getString(3));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return a;
	}
}
