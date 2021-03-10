package BusinessExceptions;

import java.util.Scanner;

// find an employee in the database
// 		checked exception
// 			make sure that the programmer inputs the correct
//			type of Employee name
//		unchecked exception
//			make sure that the database user inputs the id
//			with the correct user information
public class BusinessExceptionsMain {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// the programmer adds in these details:
		String[] newEmployeeNames = { "Chris", "Jenn", "Luis", "Claudia", "Danny", "Joseph" };
		String[] newEmployeeIds = { "0", "1", "2", "3", "4", "5" };

		Employee.addEmployees(newEmployeeNames, newEmployeeIds);

		Scanner sc = new Scanner(System.in);
		System.out.println(Employee.getEmployee(sc));
	}

}
