package com.srm.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.srm.dto.CustomerDetailsDTO;

public class CustomerDAO {
	
    public String addCustomerDetails(CustomerDetailsDTO custDTO) throws SQLException{
    	String status =null;
    	Connection con=null;
    	
    	try{
    		con=MyDBEngine.getDBConnection();
    		Statement st= con.createStatement();
    		String query="insert into customerdetails values("+0+",";
    		query=query+"'"+custDTO.getCustomerName()+"',";
    		query=query+"'"+custDTO.getSurname()+"',";
    		query=query+"'"+custDTO.getDateofbirth()+"',";
    		query=query+"'"+custDTO.getAge()+"',";
    		query=query+"'"+custDTO.getMobileNo()+"',";
    		query=query+"'"+custDTO.getEmailId()+"',";
    		query=query+"'"+custDTO.getAddress()+"',";
    		query=query+"'"+custDTO.getStreet()+"',";
    		query=query+"'"+custDTO.getCity()+"',";
    		query=query+"'"+custDTO.getPincode()+"',";
    		query=query+"'"+custDTO.getPurposeofvisit()+"')";
    		
    		int value  =st.executeUpdate(query);
			if(value>0){
				status="Customer details inserted successfully";
			}else{
				status="Customer details not inserted successfully";
			}
    		  		  		
    	}catch (SQLException e) {
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
