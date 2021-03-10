package assignments;

import java.util.Scanner;

public class EvenSumCalc {
	
	public static void calcEvenSum(Scanner sc) {
		int[] userArray = CrudCalcs.createArray(sc);
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i = 0; i < userArray.length; i++) {
			if(userArray[i]%2==0) {
				evenSum += userArray[i];
			}
		}
		
		System.out.println("The Even Sum is = " + evenSum + ".");
	}
}
