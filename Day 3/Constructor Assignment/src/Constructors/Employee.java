package Constructors;

import java.util.Scanner;
import java.util.Arrays;

// Assignment
// Create Employee class with id,name,age,email
// and Project(projectid,projectname,clientname)
// and present and permanent Address(aid,streetname,city,state,zip)
public class Employee {
	// would like to add all employees to a class-level database
	private static Employee[] employees = new Employee[0];

	private ClientProject project;
	private String name;
	private Address permanent;
	private Address temporary;

	// add an address and instantiate it somewhere above
	public Employee(ClientProject project, String name) {
		this.project = project;
		this.name = name;
	}

	public Employee(ClientProject project, String name, Address permanent, Address temporary) {
		this(project, name); // chained constructor
		this.permanent = permanent;
		this.temporary = temporary;
	}

	//
	public static void addEmployee(Scanner sc) {
		// I moved this up because it got in the way of the following sc.next()
		System.out.println("What is the new employee's name");
		String name = sc.next();

		System.out.println("First You need to add a project:");
		ClientProject thisProject = ClientProject.addProject(sc);

		System.out.println("Do you want to set the address now?\n If Yes type [y]. Other wise type No [n].");
		String response = sc.next();

		if (response.equals("y")) {
			System.out.println("Permanent Address instructions:");
			Address permanent = Address.createAddress(sc);

			System.out.println("Temporary Address instructions:");
			Address temporary = Address.createAddress(sc);

			Employee thisEmployee = new Employee(thisProject, name, permanent, temporary);
			pushEmployee(thisEmployee);
		} else if (response.equals("n")) {
			Employee thisEmployee = new Employee(thisProject, name);
			pushEmployee(thisEmployee);
		}

	}

	private static void pushEmployee(Employee e) {
		employees = Arrays.copyOf(employees, employees.length + 1);
		employees[employees.length - 1] = e;
	}

	// get employee data
	public static void getEmployeeList() {
		for (int i = 0; i < employees.length; i++) {
			System.out.println(i + " " + employees[i].toString());
		}
	}

	@Override
	public String toString() {
		return "Employee [project=" + project + ", name=" + name + ", permanent=" + permanent + ", temporary="
				+ temporary + "]";
	}


	// find employee data
}
