package com.javalabpractice;

import java.util.Random;
import java.util.Scanner;

public class LSTest7 {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("enter a random number");
		int randomnumber = rand.nextInt(10)+1 ;
		int attempts = 3;
		
		
		while (attempts > 0) {

            System.out.print("Enter your number: ");
            int guessnumber = sc.nextInt();

            if (guessnumber == randomnumber) {
                System.out.println(" congrats you won the game");
                break;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("you guess number is wrong ! try again later" + attempts);
                } else {
                    System.out.println(" You lost! Correct number was: " + randomnumber);
                }
            }
        }

        sc.close();
    }
}






		
		