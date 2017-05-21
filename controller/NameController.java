package controller;

import java.util.Scanner;

import model.Name;

public class NameController {
	public void showName(Name name) {
		System.out.println(" ####Name####\n");
		System.out.print(" Name: " + name.getFirstName() + " " + name.getMiddleName() + " " + name.getLastName());

	}

	public void getname(Name name) {

		System.out.println("Enter First Name : ");

		Scanner in = new Scanner(System.in);

		name.setFirstName(in.nextLine());

		System.out.println("Enter Middle Name : ");

		name.setMiddleName(in.nextLine());

		System.out.println("Enter Last Name : ");

		name.setLastName(in.nextLine());

	}

}
