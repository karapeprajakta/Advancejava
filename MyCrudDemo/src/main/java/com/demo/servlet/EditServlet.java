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

@WebServlet("/editemp")
public class EditServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int id=Integer.parseInt(request.getParameter("id"));
		 System.out.println(id);
		 TestService tservice=new TestServiceImpl();
		 Test t= tservice.getbyid(id);
		 request.setAttribute("emp", t);
		 RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
		 rd.forward(request, response);
	}

}
