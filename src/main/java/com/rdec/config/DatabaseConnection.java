package com.rdec.config;

import org.bson.Document;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DatabaseConnection {
	
	public MongoClient createClient() {
		String URL = "mongodb+srv://piebytwo014:piebytwo014@cluster0.iw0d6qp.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
		ConnectionString str = new ConnectionString(URL);
		MongoClientSettings settings = MongoClientSettings.builder().applyConnectionString(str).build();
		MongoClient client = MongoClients.create(settings);
		return client;
	}
	
	MongoDatabase createDatabase() {
		MongoDatabase database = createClient().getDatabase("MCA_JAVA_AUTH");
		return database;
	}
	
	MongoCollection<Document> createTable() {
		MongoCollection<Document> table = createDatabase().getCollection("ABCD");
		return table;
	}
	
	public void insertData(String name, String email, String pass1, String pass2) {
		Document newUser = new Document("name", name).append("email", email).append("pass1", pass1).append("pass2", pass2);
		createTable().insertOne(newUser);
		System.out.println("Database connection success");
	}
	
	void fetchData() {
		
	}

}
