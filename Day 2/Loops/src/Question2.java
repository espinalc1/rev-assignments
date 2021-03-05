
public class Question2 {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			printPalindromes(i);
		}
	}
	
	public static void printPalindromes(int num) {
		
		int mod1 = (num - (num%100))/100; // 999%100 => 99; 999-99=900; 900/100=9
		int mod2 = (num%10); // 999%10 = 9
		
		if (num < 100 || num > 999) {
			System.out.println("Sorry we don't accept numbers lower than 100");
		} else if (num >= 100 && num <= 999 && (mod1==mod2)) {
			System.out.println(num);
		}
	}
}
