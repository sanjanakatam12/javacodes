package com.games;

import java.util.Scanner;

public class Tic_Tac_Toe {

	static char[][] a = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

	static char player = 'X';

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Tic Tac Toe Game");

		while (true) {
			displayboard();

			System.out.println(player + " select row (0-2): ");
			int row = sc.nextInt();

			System.out.println(player + " select col (0-2): ");
			int col = sc.nextInt();

		
			if (row < 0 || row > 2 || col < 0 || col > 2 || a[row][col] != ' ') {
				System.out.println("Invalid move, try again!");
				continue;
			}

		
			a[row][col] = player;

			
			if (iswin()) {
				displayboard();
				System.out.println(player + " wins the game!");
				break;
			}

			
			if (isdraw()) {
				displayboard();
				System.out.println("Match is draw!");
				break;
			}

			
			player = (player == 'X') ? 'O' : 'X';
		}

		sc.close();
	}


	private static void displayboard() {
		System.out.println("-------------");
		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}


	public static boolean isdraw() {
		for (char[] row : a) {
			for (char c : row) {
				if (c == ' ') {
					return false;
				}
			}
		}
		return true;
	}


	public static boolean iswin() {
	
		for (int i = 0; i < 3; i++) {
			if (a[i][0] == player && a[i][1] == player && a[i][2] == player) {
				return true;
			}
		}

	
		for (int i = 0; i < 3; i++) {
			if (a[0][i] == player && a[1][i] == player && a[2][i] == player) {
				return true;
			}
		}

		
		if (a[0][0] == player && a[1][1] == player && a[2][2] == player) {
			return true;
		}

		if (a[0][2] == player && a[1][1] == player && a[2][0] == player) {
			return true;
		}

		return false;
	}
}
