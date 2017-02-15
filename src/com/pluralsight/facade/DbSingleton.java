package com.pluralsight.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

	// Setting the DbSingleton to null means that it won't always be created at
	// JVM startup. It will ONLY be created ONCE, via the getInstance method.
	private static DbSingleton instance = null;

	private Connection conn = null;

	// Need to specify constructor being private, so nobody can construct an
	// instance, only the Singleton itself. Will be launched by JVM.
	// Use Derby as a real world example, to create in-memory database instance.
	private DbSingleton() {
		try {
			DriverManager
					.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// Should always be thread safe, to ensure we don't get problems with our
	// application.
	// Note, the two instance==null checks are to improve performance, so that
	// the synchronisation check will only be done if we don't already have an
	// instance. Only care if we need to be syncronized when we are creating the
	// object the first time, don't want the performance hit the rest of the
	// time.
	public static DbSingleton getInstance() {

		// This ensures LAZY loading, rather than EAGERLY loaded. Will help
		// performance.
		if (instance == null) {
			// Synchronize for thread safety
			synchronized (DbSingleton.class) {
				if (instance == null) {

					instance = new DbSingleton();
				}
			}
		}

		return instance;
	}

	// NOTE - this method is NOT STATIC. It is called ONCE we have an instance
	// of our singleton.
	public Connection getConnection() {
		if (conn == null) {
			synchronized (DbSingleton.class) {
				if (conn == null) {
					try {
						String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
						conn = DriverManager.getConnection(dbUrl);

					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}

		return conn;
	}
}
