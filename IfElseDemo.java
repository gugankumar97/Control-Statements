package ControlStatements;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int number = sc.nextInt();
		
		if (number >=0) {
			System.out.println("Number is Positive");
		}else {
			System.out.println("Number is Negative");
		}
		
		if(number % 2 == 0) {
			System.out.println("This is EVEN");
		}else {
			System.out.println("This is ODD");
		}

		System.out.println("Enter age of a Person :");
		int age = sc.nextInt();
		
		if(age >0 && age <= 13) {
			System.out.println("This person is a Child");
		}else if(age>13 && age < 60) {
			System.out.println("This person is Adult");
			
		}else  {
			System.out.println("This person is a Senior Citizen");
		}
		

	}

}
