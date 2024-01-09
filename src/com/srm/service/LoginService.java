package com.srm.service;

import java.sql.SQLException;

import com.srm.dao.LoginDAO;
import com.srm.dto.LoginDTO;

public class LoginService {
	
	public boolean checkUserNameAndPassword(LoginDTO login) throws SQLException{
		LoginDAO loginDAO = new LoginDAO();
		return loginDAO.checkUserNameAndPassword(login);
			
	}

}
