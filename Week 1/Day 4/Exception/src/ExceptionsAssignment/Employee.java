package ExceptionsAssignment;

import java.util.Scanner;

public class Employee {
	private int employeeId;
	private String name;
	private String passportId;
	private String projectId;

	public Employee() {
		super();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Scanner sc) {
		String pattern = "[0-9]{9}";
		String label = "Employee Id";
		String req = "The " + label + " must be:\n	* nine digits long.";
		ValidatorLogic v = new ValidatorLogic(pattern, label, req);
		this.employeeId = Integer.parseInt(v.validate(sc));
	}

	public String getName() {
		return name;
	}

	public void setName(Scanner sc) {
		String pattern = "[A-Z]{1}[a-z]+ [A-Z]{1}[a-z]+";
		String label = "Employee name";
		String req = "The " + label
				+ " must have:\n	* at least 2 characters\n	* and one space in between the first and last names.";
		ValidatorLogic v = new ValidatorLogic(pattern, label, req);
		this.name = v.validate(sc);
	}

	public String getPassportId() {
		return passportId;
	}

	public void setPassportId(Scanner sc) {
		String pattern = "[0-9]{9}";
		String label = "Passport Number";
		String req = "The " + label + " must have:\n	* exactly 9 digits.";
		ValidatorLogic v = new ValidatorLogic(pattern, label, req);
		this.passportId = v.validate(sc);
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(Scanner sc) {
		String pattern = "[0-9]{7}";
		String label = "Project Id";
		String req = "The " + label + " must have:\n	* exactly 7 digits.";
		ValidatorLogic v = new ValidatorLogic(pattern, label, req);
		this.projectId = v.validate(sc);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", passportId=" + passportId + ", projectId="
				+ projectId + "]";
	}
	
	

}
