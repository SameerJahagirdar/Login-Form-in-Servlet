package com.Webservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginPage extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		AuthService ser = new AuthService();
		
		PrintWriter out = res.getWriter();
		
		if(ser.secure(username, password)){
			out.println("Logged In");
		}
		else {
			out.println("Wrong username or password");
		}
	}

}
