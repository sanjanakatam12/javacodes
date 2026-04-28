package com.consolebasedapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConnection {

	static final String URL1 = "jdbc:mysql://localhost:3306/";
	static final String URL2 = "jdbc:mysql://localhost:3306/shopdb";

	static final String USER = "root";
	static final String PASSWORD = "root"; // OR "" if no password

	static {
		try {
			Connection con = DriverManager.getConnection(URL1, USER, PASSWORD);

			// ❌ NO return here
			if (con != null) {

				Statement st = con.createStatement();

				st.executeUpdate("CREATE DATABASE IF NOT EXISTS shopdb");
				st.execute("USE shopdb");

				st.executeUpdate("CREATE TABLE IF NOT EXISTS admin(" + "id INT AUTO_INCREMENT PRIMARY KEY,"
						+ "name VARCHAR(50)," + "email VARCHAR(50) UNIQUE," + "password VARCHAR(50))");

				st.executeUpdate("CREATE TABLE IF NOT EXISTS customer(" + "id INT AUTO_INCREMENT PRIMARY KEY,"
						+ "name VARCHAR(50)," + "email VARCHAR(50) UNIQUE," + "password VARCHAR(50))");

				st.executeUpdate("CREATE TABLE IF NOT EXISTS item(" + "id INT AUTO_INCREMENT PRIMARY KEY,"
						+ "name VARCHAR(50)," + "price DOUBLE)");

				System.out.println("Database Ready ✅");

				con.close();

			} else {
				System.out.println("Connection Failed ❌");
			}

		} catch (Exception e) {
			System.out.println("Database Initialization Error ❌");
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(URL2, USER, PASSWORD);
		} catch (Exception e) {
			System.out.println("Connection Failed ❌");
			e.printStackTrace();
			return null;
		}
	}
}
