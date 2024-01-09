package com.srm.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srm.dto.LoginDTO;
import com.srm.service.LoginService;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LoginDTO login = new LoginDTO();
		login.setUserName(request.getParameter("user"));
		login.setPassword(request.getParameter("pwd"));
 		
		LoginService loginService = new LoginService();
		try {
			if(loginService.checkUserNameAndPassword(login)){
				System.out.println("Login Success");
				request.getServletContext().getRequestDispatcher("/welcome").forward(request, response);
				//request.getServletContext().getRequestDispatcher("/addCustomer.jsp").forward(request, response);
			}else{
				System.out.println("Login Failed");
				request.setAttribute("loginFailedMsg", "Please enter the valid username and password");
				request.getServletContext().getRequestDispatcher("/index.jsp").include(request, response);
				//response.sendRedirect("/MyWebProject/index.jsp")
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	
}
