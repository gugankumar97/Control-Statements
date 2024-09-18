package ControlStatements;

import java.util.Scanner;

public class controlSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter amount in multiples of 500 upto 2000 :");
		int amount = sc.nextInt();
		
		/*
		 * Syntax:
		 * 
		 * switch(value){
		 * 
		 * case 1(value):
		 * 		code logic
		 * 		break;
		 * case 2(value):
		 * 		code logic
		 * 		break;
		 * case 3(value):
		 * 		code logic
		 * 		break;
		 * default:
		 * 		code logic
		 * 		break;
		 * }
		 */

		switch (amount) {

		case 500:
			System.out.println("You have entered 500");
			break;
		case 1000:
			System.out.println("You have entered 1000");
			break;
		case 1500:
			System.out.println("You have entered 1500");
			break;
		case 2000:
			System.out.println("You have entered 2000");
			break;
		default:
			System.out.println("Please enter amount in multiples of 500 upto 2000 only");
			break;

		}

	}

}
