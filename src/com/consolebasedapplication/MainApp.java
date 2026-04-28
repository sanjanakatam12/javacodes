package com.consolebasedapplication;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		AdminOperation admin = new AdminServices();
		CustomerService customer = new CustomerService();

		while (true) {

			System.out.println("\n1.Admin 2.Customer 3.Exit");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("1.Register 2.Login");
				int a = sc.nextInt();

				if (a == 1) {
					System.out.println("Enter Name Email Password:");
					admin.registerAdmin(sc.next(), sc.next(), sc.next());
				} else {
					System.out.println("Enter Email Password:");
					if (admin.login(sc.next(), sc.next())) {

						while (true) {
							System.out.println("\n1.Add 2.View 3.Update 4.Delete 5.Logout");
							int op = sc.nextInt();

							if (op == 1) {
								System.out.println("Enter Name Price:");
								admin.addItem(sc.next(), sc.nextDouble());
							} else if (op == 2) {
								admin.viewItems();
							} else if (op == 3) {
								System.out.println("Enter ID New Price:");
								admin.updateItem(sc.nextInt(), sc.nextDouble());
							} else if (op == 4) {
								System.out.println("Enter ID:");
								admin.deleteItem(sc.nextInt());
							} else
								break;
						}
					} else {
						System.out.println("Invalid Login");
					}
				}
				break;

			case 2:
				System.out.println("1.Register 2.Login");
				int c = sc.nextInt();

				if (c == 1) {
					System.out.println("Enter Name Email Password:");
					customer.register(sc.next(), sc.next(), sc.next());
				} else {
					System.out.println("Enter Email Password:");
					if (customer.login(sc.next(), sc.next())) {
						System.out.println("Customer Login Success");
					} else {
						System.out.println("Invalid Login");
					}
				}
				break;

			case 3:
				System.exit(0);
			}
		}
	}
}
