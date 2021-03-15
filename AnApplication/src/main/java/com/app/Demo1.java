package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
	public static void main(String[] args) throws SQLException {

		Connection connection = null;
		try {
			// step 1 - load driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver successfully loaded!");

			// step 2 - open connection
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String username = "postgres";
			String password = "H0mel3ss!!!";
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Opened!");
			
			// step 3 - create a statement
			Statement statement = connection.createStatement();
			String sql = "select * from player_schema.player";
			
			// step 4 - execute query
			ResultSet rs = statement.executeQuery(sql);
			
			// step 5 - 
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}
			
			System.out.println("All printed out!");

		} catch (ClassNotFoundException c) {
			System.out.println(c);
		}
		connection.close();
	}
}
