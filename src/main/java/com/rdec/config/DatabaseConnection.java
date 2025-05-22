package com.rdec.config;

import org.bson.Document;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DatabaseConnection {

	public static void main(String[] args) {
		try {
			String URL = "mongodb+srv://piebytwo014:piebytwo014@cluster0.iw0d6qp.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
			ConnectionString str = new ConnectionString(URL);
			MongoClientSettings settings = MongoClientSettings.builder().applyConnectionString(str).build();
			MongoClient client = MongoClients.create(settings);
			MongoDatabase database = client.getDatabase("MCA_JAVA_AUTH");
			MongoCollection<Document> table = database.getCollection("ABCD");
			Document newUser = new Document("name", "Rohit").append("email", "piebytwo014@gmail.com");
			table.insertOne(newUser);
			System.out.println("Database connection success");
		} catch (Exception e) {
			System.out.println("Database Connection failed");
		}
		
	}

}
