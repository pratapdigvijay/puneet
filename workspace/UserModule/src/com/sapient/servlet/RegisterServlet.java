package com.sapient.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.sapient.entity.User;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Request");
		System.out.println(request.getParameter("str"));
		
		String jsonInString  = request.getParameter("str");
		
		Gson gson = new Gson();
		User user = gson.fromJson(jsonInString, User.class);
		System.out.println(user);
		
		response.setContentType("application/json");
		response.getWriter().println("{\"success\" : false}");
	}

}
