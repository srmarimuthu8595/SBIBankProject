package com.srm.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srm.dto.CustomerDetailsDTO;
import com.srm.service.CustomerService;

public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CustomerService customerService;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String status;
		CustomerDetailsDTO custDTO = new CustomerDetailsDTO();
		custDTO.setCustomerName(request.getParameter("custname"));
		custDTO.setSurname(request.getParameter("surname"));
		custDTO.setDateofbirth(request.getParameter("dob"));
		custDTO.setAge(request.getParameter("age"));
		custDTO.setMobileNo(request.getParameter("mobile"));
		custDTO.setEmailId(request.getParameter("email"));
		custDTO.setAddress(request.getParameter("address"));
		custDTO.setStreet(request.getParameter("street"));
		custDTO.setCity(request.getParameter("city"));
		custDTO.setPincode(request.getParameter("pincode"));
		custDTO.setPurposeofvisit(request.getParameter("purpose"));
		customerService = new CustomerService();
		status=customerService.addCustomerDetails(custDTO);
		request.setAttribute("status", status);
		//response.sendRedirect("http://localhost:8080/CoreJavaProject-Day4-ServletsANDJSP/addcustomer?custname=Marimuthu&surname=Rakkanagounder&dob=10-03-1978&age=40&mobile=9840633484&email=srmarimuthu@gmail.com&address=Singanallur&street=First+Street&city=Erode&pincode=638455&purpose=For+Open+Savings+Account&addcustomer=Add+Customer");
		request.getServletContext().getRequestDispatcher("/addCustomer.jsp").forward(request, response);
		
	}

}
