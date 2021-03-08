package ExceptionsAssignment;
import java.util.Scanner;

public class ExceptionsMain {
	public static void main(String[] args) {
		// create a validator logic class
		// create an exception
		// employee class
		Scanner sc = new Scanner(System.in);
		Employee thisEm = new Employee();
		thisEm.setEmployeeId(sc);
		thisEm.setName(sc);
		thisEm.setPassportId(sc);
		thisEm.setProjectId(sc);
		sc.close();
		System.out.println(thisEm.toString()+"\n\nNow running data integrity tests.\n\n");
		try {
			ValidatorLogic.integrityChecker(thisEm);
		} catch (BusinessException b) {
			System.out.println(b.message);;
		} finally {
			System.out.println("Thanks for using my application today!");
		}
	}
}
