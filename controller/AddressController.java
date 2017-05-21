package controller;

import java.util.Scanner;

import model.Address;

public class AddressController {

	public void getAddress(Address address) {
		System.out.println("**Address**");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Building No: ");
		address.setBuildingNo(sc.nextLine());

		System.out.println("Enter your Street Name: ");
		address.setStreetName(sc.nextLine());

		System.out.println("Enter the Landmark: ");
		address.setLandmark(sc.nextLine());

		System.out.println("Enter your Pincode: ");
		address.setPincode(sc.nextInt());
		sc.nextLine();

		System.out.println("Enter the State: ");
		address.setState(sc.nextLine());

		System.out.println("Enter the City: ");
		address.setCity(sc.nextLine());

		System.out.println("Enter the Country: ");
		address.setCountry(sc.nextLine());
	}

	public void printAddress(Address address) {

		System.out.println();

		System.out.println(" ####Address####\n");

		System.out.println("Your Address is : \n" + address.getBuildingNo() + "," + address.getStreetName() + "," + "\n"
				+ address.getState() + "," + address.getCity() + "-" + address.getPincode() + "," + address.getCountry()
				+ ".");
		System.out.print("Landmark : " + address.getLandmark());

	}
}
