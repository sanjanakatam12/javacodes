package com.exceptionhandling;

public class CustomEx  {

	public static void main(String[] args) {
		double balance = 2000;
        double amount = -3000; 
        try {
            if (amount <= 0) {
                throw new InvalidAmountEx("Invalid Amount");
            }

            if (amount > balance) {
                throw new InsufficientEx("Insufficient Balance");
            }

            balance = balance - amount;
            System.out.println("Success! Balance: " + balance);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
		
		
		

	}

}
