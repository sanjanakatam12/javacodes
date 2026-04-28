package com.consolebasedapplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerService implements CustomerOperation {

	@Override
	public void register(String name, String email, String password) {

		String query = "INSERT INTO customer(name,email,password) VALUES(?,?,?)";

		try (Connection con = DbConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {

			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);

			ps.executeUpdate();
			System.out.println("Customer Registered");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean login(String email, String password) {

		String query = "SELECT * FROM customer WHERE email=? AND password=?";

		try (Connection con = DbConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {

			ps.setString(1, email);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();
			return rs.next();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
