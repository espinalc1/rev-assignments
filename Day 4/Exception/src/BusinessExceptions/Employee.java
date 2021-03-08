package BusinessExceptions;

import java.util.Scanner;

public class Employee {
	final private static String message = "This ID Number doesn't fit our Format!";
	final private static ValidatorLogic idChecker = new ValidatorLogic("[0-9]{6}", message);
	private static Employee[] employees;
	private String employeeId;
	private String name;

	public Employee(String employeeId, String name) {
		super();
		this.employeeId = employeeId;
		this.name = name;

	}

	public static void addEmployees(String emNameArray[], String emIdArray[]) {
		int len = emNameArray.length;

		// idChecker.validateList(emIdArray);

		try {
			idChecker.validateList(emIdArray);
		} catch (BusinessChecked e) {
			e.getMessage();
			System.out.println(
					"Please check the list of employee ids. The format isn't correct for one, several, or all elements in the list!\n\n");

		}

		employees = new Employee[len];
		for (int i = 0; i < len; i++) {
			Employee thisEm = new Employee(emIdArray[i], emNameArray[i]);
			employees[i] = thisEm;
		}

	}

	public static int getNumEmployees() {
		return employees.length;
	}

	public static Employee getEmployee(Scanner sc) {
		System.out.println("Please, type in the employee id number you'd like to check:");
		String emId = sc.next();

		try {
			idChecker.validateId(emId);
		} catch (BusinessUnChecked b) {
			System.out.println(b.getMessage());
			return getEmployee(sc);
		}

		for (int i = 0; i < employees.length; i++) {
			if (employees[i].employeeId.equals(emId)) {
				return employees[i];
			}
		}

		System.out.println("Sorry, this employee doesn't exist!\n\nTry another id:");
		return getEmployee(sc);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + "]";
	}

}
