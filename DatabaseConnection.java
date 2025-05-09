package com.rdec.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class DatabaseConnection {
	static MongoClient client;
	
	public DatabaseConnection() { 
		try {
			String URL = "mongodb+srv://piebytwo014:piebytwo014@cluster0.cz5ri.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
			ConnectionString str = new ConnectionString(URL);
			MongoClientSettings settings = MongoClientSettings.builder().applyConnectionString(str).build();
			client = MongoClients.create(settings);
			System.out.println("Database Connection Success");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Database Connection Failed");
		}
	}
	
	public MongoClient getClient() {
		return client;
	}
	
	
	/*
	 * MongoClientURI uri = new MongoClientURI(URL); MongoClient mongoClient =
	 * MongoClients.create(uri); MongoDatabase database =
	 * mongoClient.getDatabase("<databaseName>");
	 */
}
