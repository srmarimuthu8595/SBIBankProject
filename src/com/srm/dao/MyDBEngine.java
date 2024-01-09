package com.srm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDBEngine {
	
	public static Connection getDBConnection() throws SQLException{
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","root");  
		}catch(Exception e){ 
			e.printStackTrace();
		}	
		return con;
	}

}
