package com.rdec.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.mongodb.client.MongoDatabase;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
		String email = request.getParameter("email");
		String pwd0 = request.getParameter("password0");
		String pwd1 = request.getParameter("password1");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(pwd0);
		System.out.println(pwd1);
		
	}

}
