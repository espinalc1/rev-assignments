package assignments;

import java.util.Scanner;

public class SecondMaxCalc {
	public static void calcSecondMax(Scanner sc) {
		int[] userArray = CrudCalcs.createArray(sc);
		
		if (userArray.length == 1) {
			System.out.println("The 2nd Largest Number is " + userArray[0]);
			return;
		} else if (userArray.length == 2 && userArray[0]==userArray[1]) {
			System.out.println("The 2nd Largest Number is " + userArray[0]);
			return;
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int i = 0; i < userArray.length; i++) {
			
			if (userArray[i] > max) {
				max = userArray[i];
			}
			
			if (userArray[i] < max && userArray[i] > max2) {
				max2 = userArray[i];
			}
			
			if (userArray[i] < min ) {
				min = userArray[i];
			}
		
		}
		
		System.out.println("The second largest number in your array is = " + max2); ;
	}
}
