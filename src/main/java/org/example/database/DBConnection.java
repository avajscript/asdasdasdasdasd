package org.example.database;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DBConnection {
	
	private static Connection connection = null;
	private static DBConnection dbConnection = null;
	private static String serverUrl = "jdbc:mysql://localhost:3306/bookvault";
	private static String userString = "***";
	private static  String passwordString = "***";
	private static String driverString = "com.mysql.cj.jdbc.Driver";

	public static void loadProperties() {
		try (InputStream input  = DBConnection.class.getClassLoader().getResourceAsStream("database.properties")) {
			if (input == null) {
				System.out.println("Sorry, unable to find database.properties");
				return;
			}
			Properties properties = new Properties();
			// Load the properties file
			properties.load(input);
			// set the class attributes from the properties
			serverUrl = properties.getProperty("jdbc.url");
			userString = properties.getProperty("jdbc.username");
			passwordString = properties.getProperty("jdbc.password");
		} catch (Exception e) {
			throw new RuntimeException("Failed to load database properties");
		}
	}

	public static DBConnection getInstance() {
		if (dbConnection == null) {
			loadProperties();
			dbConnection = new DBConnection();
		}
		return dbConnection;
	}
	
}
