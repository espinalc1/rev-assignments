package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeFilter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] results = findPalindromes(sc);
		System.out.println(Arrays.toString(results));
	}

	// accept input
	// then put through filter
	// then return the array
	public static int[] findPalindromes(Scanner sc) {
		int[] userArray = CrudCalcs.createArray(sc);
		int[] palindromes = new int[0];
		for(int i = 0; i < userArray.length; i++) {
			if (isPalindrome(userArray[i])) {
				palindromes = CrudCalcs.push(userArray[i], palindromes);
			}
		}
		return palindromes;
	}

	public static boolean isPalindrome(int num) {
		// determine if a specific number is a palindrome
		boolean isOrIsnt = false;

		// find the number of digits to figure out the middle number
		int digits = 0;
		// what about the edge case 0?
		for (int i = 0; num % Math.pow(10, i) != num; i++) {
			digits = i + 1;
		}

		// get first half of number
		int firstHalf = 0;
		int secHalf = 0;
		int thisPow = 0;
		int dig = 0;

		// find the number of digits for the middle number
		if (digits % 2 == 0) {
			dig = digits / 2;
			thisPow = (int) Math.pow(10.0, (digits / 2));
			secHalf = num % thisPow;
			firstHalf = (num - (secHalf)) / thisPow;
		} else {
			// dig = (int) Math.floor(digits / 2.0) + 1;
			// thisPow = (int) Math.pow(10.0, (dig));

			dig = (int) Math.floor(digits / 2.0);
			int powA = (int) Math.pow(10.0, dig+1);
			int powB = (int) Math.pow(10.0, dig);
			// int midHalf = num % thisPow;
			//secHalf = midHalf % (thisPow / 10);
			
			firstHalf = (num - (num % powA))/(powA);
			// System.out.println(thisPow + "\n" + firstHalf + "\n" + secHalf);
			secHalf = num % (powB);
		}
		
		// reverse second half
		int rev = 0;
		int r = secHalf;
		int prevR = secHalf;
		for (int i = 1; i <= dig; i++) {
			// get the digit
			// num = 53823 (5 digits)
			// (r - r%10^4)/10^4 => 53,823 % 10,000 = 3823 => 53,823 - 3823 => 50,000 /
			// 10,000
			// r = 3823
			int powA = (int) Math.pow(10.0, dig - i);
			r = r % powA;
			int thisDigit = (prevR - r) / powA;
			rev += thisDigit * (int) Math.pow(10.0, i - 1);
			prevR = r;
			// int powB = (int)

		}

		// compare both new values
		if (firstHalf == rev) {
			isOrIsnt = true;
			return isOrIsnt;
		}

		return isOrIsnt;
	}
	/*
	*/
}
