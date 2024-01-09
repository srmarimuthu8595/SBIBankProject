package com.srm.service;

import java.sql.SQLException;

import com.srm.dao.CustomerDAO;
import com.srm.dto.CustomerDetailsDTO;

public class CustomerService {
	CustomerDAO customerDAO;
	
	public String addCustomerDetails(CustomerDetailsDTO custDTO){
		String status=null;
		try {
			customerDAO = new CustomerDAO();
			status=customerDAO.addCustomerDetails(custDTO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		
	}

}
