package com.srm.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WelcomeServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 PrintWriter writer = response.getWriter();
		 	String htmlRespone = "<html>";
	        htmlRespone += "<h2>Welcome To Sample Webproject<br/>";      
	        htmlRespone += "This project all abot to simple web concepts</h2>";    
	        htmlRespone += "</html>";
	        writer.println(htmlRespone);
		
	}

}
