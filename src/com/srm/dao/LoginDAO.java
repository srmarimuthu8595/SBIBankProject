package com.srm.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.srm.dto.LoginDTO;

public class LoginDAO {
	
public boolean checkUserNameAndPassword(LoginDTO login) throws SQLException{
	String userName = null;
	String pwd = null;
	boolean status = false;
	Connection con=null;
		try {
			con = MyDBEngine.getDBConnection();
			Statement st= con.createStatement();
			String query="select * from login where username='"+login.getUserName()+"' and pwd='"+login.getPassword()+"'";
			ResultSet rs =st.executeQuery(query);
			while(rs.next()){
				userName = rs.getString("username");
				pwd = rs.getString("pwd");
			}
			
			if(userName!=null&&pwd!=null&userName.equals(login.getUserName())&&pwd.equals(login.getPassword())){
				status=true;	
			}else{
				status=false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(!con.isClosed()){
				con.close();
			}
		}
	  	return status;
	}

}
