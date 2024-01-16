package com.demo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Test;
import com.demo.service.TestService;
import com.demo.service.TestServiceImpl;

@WebServlet("/display")
public class DisplayServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TestService tservice=new TestServiceImpl();
		List<Test> tlist=tservice.findall();
		request.setAttribute("list", tlist);
		RequestDispatcher rd=request.getRequestDispatcher("displayall.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
    }
	}
