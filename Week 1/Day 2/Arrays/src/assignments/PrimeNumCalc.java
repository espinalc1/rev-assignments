package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumCalc {
	
	public static int[] getPrimeNumbers(Scanner sc) {
		System.out.println("Welcome to the Prime Numbers array Filter!\n"
							+ "Follow the below instructions to retrieve a list of prime numbers!");
		
		int[] userArray = CrudCalcs.createArray(sc);
		
		int[] primeNums = new int[0]; //already initialized it can't work
		for (int j = 0; j < userArray.length; j++) {
			if (isPrime(userArray[j])){
				primeNums = CrudCalcs.push(userArray[j], primeNums);
				//use the CRUD operations to manipulate this array
			};
		}
		System.out.println("The following is your list of prime numbers:\n" + Arrays.toString(primeNums));
		return primeNums;
	}
	// all even numbers 0 ,2 ,4 6, 8
	// all numbers divisible by five , 5
	// if numbers end in 3
	// 7 and 9
	public static boolean isPrime(int num) {
		// find more unique solutions
		boolean okay = true;
		for (int j = 2; j < num/2; j++) {
			if (num % j==0) {
				okay = false;
				return okay;
			}
		}
		return okay;
	}
}
