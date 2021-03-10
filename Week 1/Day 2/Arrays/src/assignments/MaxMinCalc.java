package assignments;
import java.util.Scanner;

public class MaxMinCalc {
	public static void calcMinMax(Scanner sc) {
		int[] userArray = CrudCalcs.createArray(sc);
		int max = userArray[0];
		int min = userArray[0];
		for (int i = 1; i < userArray.length; i++) {
			if (userArray[i] > max) {
				max = userArray[i];
			}
			
			if (userArray[i] < min) {
				min = userArray[i];
			}
		}
		
		System.out.println("The minimum value is = " + min + "\nThe maximum value is = " + max);
	}
}
