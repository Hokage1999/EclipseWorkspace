package com.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		if(uname.equals("hari") && pass.equals("1234"))
		{
			out.println("Login success");
		}
			
		

}
}
