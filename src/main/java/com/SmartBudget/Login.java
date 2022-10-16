package com.SmartBudget;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.SmartBudget.Model.User;
import  com.SmartBudget.dao.*;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("login.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String Email =request.getParameter("uname");
		String Password =request.getParameter("upass");
	
		LoginInfo logininfo =new LoginInfo();
		
		logininfo.setEmail(Email);
		logininfo.setPassword(Password);
		
		
		if(User.Verify(Email,Password)) {
			HttpSession session=request.getSession();
			session.setAttribute("logininfo", logininfo);
			
			  RequestDispatcher dd= request.getRequestDispatcher("Welcome.jsp");
		        dd.forward(request, response);
		}
	    	
	    	
		response.sendRedirect("login.jsp");
		
	
		
	}

}
