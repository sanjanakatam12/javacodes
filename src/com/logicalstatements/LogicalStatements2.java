package com.logicalstatements;

import java.util.Scanner;

//nested switch
public class LogicalStatements2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the catogry:");
		String catg = sc.next();

		switch (catg) {
		case "fruits" -> {
			System.out.println("Enter item  for description and price");
			String item = sc.next();
			switch (item) {
			case "orn" -> System.out.println("orange and 12 oranges rate 150r ");
			case "mng" -> System.out.println("mango and 1kg mangoes rate 200r ");
			case "apl" -> System.out.println("apple and 2kg apple rate 400r ");
			case "ban" -> System.out.println("banana and 12 banana rate 80r ");
			}

		}

		case "vegies" -> {
			System.out.println("Enter item for description and price");
			String item = sc.next();
			switch (item) {
			case "tmt" -> System.out.println("tomato and 1kg tomatos rate 50r ");
			case "ptt" -> System.out.println("potato and 1kg potato rate 30r ");
			case "btg" -> System.out.println("bottlegurd and 1 bottleguard rate 20r ");
			case "oni" -> System.out.println("onion and 1kg onion rate 40r ");
			}

		}

		}

		sc.close();

	}

}
