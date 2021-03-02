import java.util.Scanner;


public class ScannerPalindrome {
	public static void main(String[] args) {
		checkPalindrome();
	}
	
	public static void checkPalindrome() {
		// check user values
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a number and check if it's a palindrome:");
		int num = sc.nextInt();
		
		// check the palindrome
		int diff1 = (num - num%100)/100;
		int diff2 = num%10;
		
		// print something out based on that value
		if (num < 100 || num > 999) {
			System.out.println("Please choose a number between 100 and 999!");
			
			checkPalindrome();
		} else if (diff1 == diff2) {
			System.out.println("The number " + num + " is a palindrome!");
		}
		sc.close();
	}
}
