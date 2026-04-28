package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentJdbc {

	public static void main(String[] args) {

		try {
			// step 1: Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step 2: Establish connection
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username = "root";
			String password = "root";

			Connection con = DriverManager.getConnection(url, username, password);

			System.out.println("Connection Established");

			// Step 3; Create statement
			Statement st = con.createStatement();

			// Step 4; Create table
			/*
			 * st.executeUpdate( "create table employee(emp_Id int primary key, emp_name
			 * varchar (50)not null, emp_department varchar(50),salary Double );
			 */

			System.out.println("Table Created Succesfully");

			// Set 5: Insert sample data
			st.executeUpdate("insert into student values(2, 'sanjana',100)");
			

			System.out.println("Sample Data Inserted Successfully");

			// Step 6: Close resources
			st.close();
			con.close();

			System.out.println("Connection Closed");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally executed");
		}

	}

}
