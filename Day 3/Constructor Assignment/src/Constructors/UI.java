package Constructors;

import java.util.Scanner;

public class UI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Generic Company's HR Employee Database.");

		boolean keepRunning = true;
		while (keepRunning) {

			System.out.println("Press one of the following NUMBERS to get started:\n" + "1 - Add a client project\n"
					+ "1 - Get a complete list of all employees\n" + "2 - Add a new Employee to the list");
			int choice = sc.nextInt();
			switch (choice) {
			case 0:
				ClientProject.addProject(sc);
				break;
			case 1:
				Employee.getEmployeeList();
				break;
			case 2:
				Employee.addEmployee(sc);
				break;
			default:
				System.out.println("Sorry, this function doesn't exist!");
				break;
			}

			System.out.println("Would you like to continue?\n" + "y - Yes\n" + "n - No");

			String response = sc.next();
			if (response.equals("y")) {
				keepRunning = true;
			} else if (response.equals("n")) {
				keepRunning = false;
			}

		}

		sc.close();
	}
}
