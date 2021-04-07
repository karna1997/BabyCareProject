package com.mysql.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {

	
	private static Connection connection = null;

	public static Connection getConnectionMethod() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/babyrecords", "root", "root");
		System.out.println("connection done..!!!");
		return connection;
		
	}

}
