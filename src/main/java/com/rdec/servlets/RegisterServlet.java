package com.rdec.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.rdec.config.DatabaseConnection;
import com.rdec.controllers.RegisterController;
import com.rdec.models.UserModel;

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
		String password0 = request.getParameter("password0");
		String password1 = request.getParameter("password1");
		
//		System.out.println(name);
//		System.out.println(RegisterController.validatePassword(password0, password1));
//		if(RegisterController.validatePassword(password0, password1)) {
//			System.out.println("Please check your password");
//		}
		MongoClient registerClient =  DatabaseConnection.getClient();
		
		MongoDatabase regsiterDatabase = registerClient.getDatabase("mca_rohit");
		
	
		
		UserModel m = new UserModel();
		Document doc = new Document("user1",m);
		
		regsiterDatabase.createCollection("users");
		
		MongoCollection<Document> collection =  regsiterDatabase.getCollection("users");
		
		collection.insertOne(doc);
	}

}
