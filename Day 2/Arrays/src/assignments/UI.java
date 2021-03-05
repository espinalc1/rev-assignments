package assignments;

import java.util.Scanner;

/*
 * Assignment Arrays
 * -----------------------
 * 1)Take an array input and find all the prime numbers from it.
 * 2)Take an array input and find all the palindrome numbers from it.
 * 3)Take an array input and find the sum of all even numbers.
 * 4)Take an array input and find the max value and min value from that array.
 * 5)Take an array input and find the 2nd max value in that array.
 * 6)Perform CRUD operations on Array
 * Note:Use the Arrays util class effectively
 */

public class UI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, please type in your name!");
		String name = sc.next();
		System.out.println("Hello, " + name + "!.\n" + "Please choose one of the following classes!\n"
				+ "1 - Get prime numbers from an array.\n" 
				+ "2 - Find all palindrome numbers from an array.\n"
				+ "3 - Take an array input and find the sum of all even numbers.\n"
				+ "4 - Take an array input and find the max value and min value from that array.\n"
				+ "5 - Take an array input and find the 2nd max value in that array.\n"
				+ "6 - Perform CRUD operations on Array.\n");

		int classNum = sc.nextInt();
		//sc.close();

		switch (classNum) {
		case 1:
			PrimeNumCalc.getPrimeNumbers(sc);
			break;
		case 2:
			PalindromeFilter.findPalindromes(sc);
			break;
		case 3:
			EvenSumCalc.calcEvenSum(sc);
			break;
		case 4:
			MaxMinCalc.calcMinMax(sc);
			break;
		case 5:
			SecondMaxCalc.calcSecondMax(sc);
			break;
		case 6:
			System.out.println("Array CRUD Operators");
			break;
		default:
			break;
		}
		
		sc.close();
	}

}
