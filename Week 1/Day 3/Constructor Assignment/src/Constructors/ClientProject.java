package Constructors;

import java.util.Scanner;

public class ClientProject {

	private int projectId;
	private String projectName;
	private String clientName;

	public ClientProject(int projectId, String projectName, String clientName) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.clientName = clientName;
	}

	public static ClientProject addProject(Scanner sc) {

		System.out.println("Enter the project id (a NUMBER): ");
		int projectId = sc.nextInt();
		
		System.out.println("Enter the project name: ");
		String projectName = sc.next();

		System.out.println("Enter the client name : ");
		String clientName = sc.next();
		
		ClientProject thisProject = new ClientProject(projectId, projectName, clientName);
		
		return thisProject;
	}

}
