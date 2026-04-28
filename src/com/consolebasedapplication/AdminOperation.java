package com.consolebasedapplication;

public interface AdminOperation {
	
	void registerAdmin(String name, String email, String password);

    boolean login(String email, String password);

    void addItem(String name, double price);

    void viewItems();

    void updateItem(int id, double price);

    void deleteItem(int id);

}
