package com.sapient.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.entity.User;
import com.sapient.service.UserService;

/**
 * Servlet implementation class AuthenticateServlet
 */
@WebServlet("/AuthenticateServlet")
public class AuthenticateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String email = request.getParameter("email");
	  String pwd = request.getParameter("pwd");
	  
	  User user = new User(email, pwd, "");
	  
	  UserService service = new UserService();
	  boolean result = service.authenticate(user);
	  
	  if(result){
		  RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");
		  dispatcher.forward(request, response);
		    
	  }
	  else{
		  request.setAttribute("message", "Invalid UserName/Password");
		  RequestDispatcher dispatcher = request.getRequestDispatcher("signup.jsp");
		  dispatcher.forward(request, response);
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}

}
