package com.pluralsight.bridge;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BridgeEverydayDemo {

	public static void main(String[] args) {

		try {
			// JDBC is an API
			DriverManager
					.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());

			String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";

			// The client is abstracted away from the details underneath
			//
			Connection conn = DriverManager.getConnection(dbUrl);

			Statement sta = conn.createStatement();

			// This client is an abstraction and can work with any database that
			// has a driver
			// Can use a different database with the same code, or different code with the same 
			// database.  A bridge between the two.
			// Could swap out database, or we could swap out client without changing the 
			// database.  The driver is the bridge between the two.  
			sta.execute("CREATE TABLE Address (ID INT, StreetName VARCHAR(20),"
					+ " City VARCHAR(20))");

			System.out.println("Table created");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
