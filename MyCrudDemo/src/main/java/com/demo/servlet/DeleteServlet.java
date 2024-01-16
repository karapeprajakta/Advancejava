package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Test;
import com.demo.service.TestService;
import com.demo.service.TestServiceImpl;

@WebServlet("/deleteemp")
public class DeleteServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("id"));
		TestService eservice=new TestServiceImpl();
		Test t=eservice.deletebyid(id);
		RequestDispatcher rd=request.getRequestDispatcher("display");
		rd.forward(request, response);
		
	}

}
