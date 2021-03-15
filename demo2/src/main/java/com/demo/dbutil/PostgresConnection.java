package com.demo.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection {
	private static Connection connection = null;

	private PostgresConnection() {

	}

	// a static method is the best way to do this because the same connection can be
	// used across the entire program
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if (connection == null) {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String username = "postgres";
			String password = "H0mel3ss!!!";
			connection = DriverManager.getConnection(url, username, password);
			return connection;
		} else {
			return connection;
		}
	}
}
