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

@WebServlet("/updateemp")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		 String name=request.getParameter("name");
		 double sal=Double.parseDouble(request.getParameter("sal"));
		 TestService tservice=new TestServiceImpl();
		 Test t=new Test(id,name,sal);
		 tservice.updateemp(t);
		 RequestDispatcher rd=request.getRequestDispatcher("display");
		 rd.forward(request, response);
	}

}
