
public class Question4 {
	public static void main(String[] args) {
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		
		System.out.print("Sum of all EVEN numbers is " + 
							evenSum + "\n" + "Sum of all ODD numbers is " + 
							oddSum + "\n" + "The maximum is " +
							Math.max(evenSum, oddSum)
						);
	}
}
