package ExceptionsAssignment;

import java.util.Scanner;

public class ValidatorLogic {
	// will get various different kinds of objects and data
	// name, project id, employee id number, etc
	// create a separate one for each one?
	// allow it to be created in another class?
	// what will they need? : pattern to compare it to
	// the string or object itself
	private String pattern;
	private String inputLabel;
	private String requirements;

	public ValidatorLogic(String pattern, String inputLabel, String requirements) {
		super();
		this.pattern = pattern;
		this.inputLabel = inputLabel;
		this.requirements = requirements;
	}

	public String validate(Scanner sc) {
		System.out.println(
				"Please type in a " + this.inputLabel + " with the following requirements:\n" + this.requirements);
		String userInput = sc.nextLine(); // careful with whitespaces during input
		if (userInput.matches(this.pattern)) {
			System.out.println("Your " + this.inputLabel + " validated!\n");
			return userInput;
		} else {
			System.out.println("Your " + this.inputLabel + " did not validate. Please try again.\n");
			return validate(sc);
		}

	}

	public static void integrityChecker(Employee em) throws BusinessException {
		if (Integer.toString(em.getEmployeeId()).equals(em.getPassportId())) {
			throw new BusinessException(
					">>>>>Major Security Leak<<<<:\nEmployee ID can't be the same as the Employee's Personal Identification. Please change immediately.");
		} else {
			System.out.println("Passed Data Integrity Check!");
		}
	}
}
