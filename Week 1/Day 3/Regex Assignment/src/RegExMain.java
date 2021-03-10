import java.util.Scanner;

/*Assignment Regex - 
 * 1)Write validation for passport number, 
 * SSN number, 
 * DL and 
 * any other ID if you have.
*/

public class RegExMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// passport
		System.out.println("Enter a passport number:");
		String ppNumber = sc.nextLine();
		String ppRe = "^[0-9]{9}[A-Z]{3}[0-9]{7}[A-Z][0-9]{7}<{14}[00]{2}$";
		Validator.validate("Passport Number", ppRe, ppNumber);

		// SSN
		System.out.println("Enter a Social Security number:");
		String SSN = sc.nextLine();
		String ssnRe = "[0-9]{3}-[0-9]{2}-[0-9]{4}";
		Validator.validate("Social Security Number", ssnRe, SSN);

		// DL
		System.out.println("Enter a Driver's License number:");
		String DL = sc.nextLine();
		String dlRe = "[0-9]{3} [0-9]{3} [0-9]{3}";
		Validator.validate("Driver's License Number", dlRe, DL);

		// Phone Number
		System.out.println("Enter a Phone number:");
		String phoneNumber = sc.nextLine();
		String pnRe = "^\\([0-9]{3}\\) [0-9]{3}-[0-9]{4}$";
		Validator.validate("Driver's License Number", pnRe, phoneNumber);

		
		sc.close();

	}
}
