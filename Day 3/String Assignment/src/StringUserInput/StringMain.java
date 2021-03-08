package StringUserInput;

import java.util.Scanner;

/* Assignment String -
* 1)Take a string input from user and find the count of vowels(aeiouAEIOU) in it.
* 2)Take a string input and print true if all vowels are present in it else print false.  aHedafioullooo - true aHedafiollooo - false
* 3)Take a string input and print the characters at prime index to uppercase.
*/

public class StringMain {
	public static void main(String[] args) {

		System.out.println("Please Type in a String: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		// Assignment 1
		String v = "aeiou";
		int vowelCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (v.contains(current + "")) {
				vowelCount++;
			}
		}

		System.out.println("The Number of vowels is: " + vowelCount);

		// Assignment 2
		System.out.println("Time for Assignment 2: Are all vowels present?");
		String v2 = "AEIOU";
		boolean hasAllV = true;
		for (int i = 0; i < 5; i++) {
			char c1 = v.charAt(i);
			char c2 = v2.charAt(i);
			if (!(s.contains(c1 + "") || s.contains(c2 + ""))) {
				hasAllV = false;
				break;
			}
		}
		System.out.println("Does " + s + " contain a, e, i, o, and u? " + hasAllV);

		// Assignment 3
		System.out.println("I will print all of the characters that are at the prime index! Check it out:");

		for (int i = 0; i < s.length(); i++) {
			if (isPrime(i)) {
				System.out.println(("" + s.charAt(i)).toUpperCase());
			}
		}

	}

	public static boolean isPrime(int n) {
		boolean tracker = true;
		if (n < 3) {
			return tracker;
		}
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				tracker = false;
				break;
			}
		}

		return tracker;
	}
}
