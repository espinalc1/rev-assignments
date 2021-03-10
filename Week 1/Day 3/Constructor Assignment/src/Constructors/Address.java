package Constructors;

import java.util.Scanner;

public class Address {
	private String address1;
	private String address2;
	private String city;
	private String state;
	private int zipcode;

	public Address(String address1, String address2, String city, String state, int zipcode) {
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public static Address createAddress(Scanner sc) {
		System.out.println("Please insert the following information?");
		System.out.println("Type in the first line of the address:");
		String address1 = sc.next();
		System.out.println("Type in the second line of the address:");
		String address2 = sc.next();
		System.out.println("Type in the City:");
		String city = sc.next();
		System.out.println("Type in the State:");
		String state = sc.next();
		System.out.println("Type in the zipcode:");
		int zipCode = sc.nextInt();

		Address address = new Address(address1, address2, city, state, zipCode);
		return address;
	}
}
