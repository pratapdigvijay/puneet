package com.sapient;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DateServlet
 */
@WebServlet("/date")
public class DateServlet extends HttpServlet {
	
	public void init(){
		System.out.println("Servlet is initialized");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Service method ....");
		Date date = new Date();
		response.setContentType("application/json");
		
		String responseStr = "{\"name\": \"Ravi\",\"age\": 32}";
		response.getWriter().println(responseStr);

	}
	
	public void destroy(){
		System.out.println("Servlet is destroyed");
	}

}
