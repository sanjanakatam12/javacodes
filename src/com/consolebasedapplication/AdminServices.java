package com.consolebasedapplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AdminServices implements AdminOperation {

	public void registerAdmin(String name, String email, String password) {

		String query = "INSERT INTO admin(name,email,password) VALUES(?,?,?)";

		try (Connection con = DbConnection.getConnection();
		PreparedStatement ps = con.prepareStatement(query)) {

			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);

			ps.executeUpdate();
			System.out.println("Admin Registered");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean login(String email, String password) {

		String query = "SELECT * FROM admin WHERE email=? AND password=?";

		try (Connection con = DbConnection.getConnection(); 
				PreparedStatement ps = con.prepareStatement(query)) {

			ps.setString(1, email);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();
			return rs.next();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public void addItem(String name, double price) {

		String query = "INSERT INTO item(name,price) VALUES(?,?)";

		try (Connection con = DbConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(query)) {

			ps.setString(1, name);
			ps.setDouble(2, price);

			ps.executeUpdate();
			System.out.println("Item Added");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void viewItems() {

		String query = "SELECT * FROM item";

		try (Connection con = DbConnection.getConnection();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query)) {

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateItem(int id, double price) {

		String query = "UPDATE item SET price=? WHERE id=?";

		try (Connection con = DbConnection.getConnection(); 
				PreparedStatement ps = con.prepareStatement(query)) {

			ps.setDouble(1, price);
			ps.setInt(2, id);

			ps.executeUpdate();
			System.out.println("Item Updated");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteItem(int id) {

	        String query = "DELETE FROM item WHERE id=?";

	        try (Connection con = DbConnection.getConnection();
	             PreparedStatement ps = con.prepareStatement(query)) {

	            ps.setInt(1, id);

	            ps.executeUpdate();
	            System.out.println("Item Deleted");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	}
}
