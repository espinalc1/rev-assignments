
public class Question1 {
	public static void main(String[] args) {
		// for loop
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// while loop
		int j = 0;
		while (j < 10) {
			System.out.println(j);
			j++;
		}
		
		// do while loop
		int k = 0;
		do {
			if (k == 0) {
				System.out.println("The first number is: " + k);
			} else if (k == 19) {
				System.out.println("The last number is: " + k);
			} else {
				System.out.println("No. " + k);
			}
			k++;
		} while(k < 20);
	}

}
