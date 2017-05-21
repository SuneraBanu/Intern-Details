package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

import model.Address;
import model.Contacts;

public class ContactController {

	public void showContacts(Contacts contact) {

		Map<String, Set<Long>> phone = contact.getNumber();

		System.out.println();

		System.out.println(" ####Contact Information####\n ");

		for (Map.Entry<String, Set<Long>> entry : phone.entrySet()) {

			System.out.print(entry.getKey() + " : ");

			Set<Long> phoneSet = entry.getValue();

			Iterator<Long> itr = phoneSet.iterator();

			while (itr.hasNext()) {

				System.out.print(itr.next());

				if (itr.hasNext())

					System.out.print(", ");

				else

					System.out.println("");

			}
		}
		System.out.println("Email Id " + contact.getEmailId());

	}

	public void getContacts(Contacts contact) {
		int number;
		System.out.println("**Contact Information**");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Phone Number: ");
		number = sc.nextInt();
		addPhoneNumber("MobileNumber", number, contact);

		System.out.println("Enter alternative Number: ");
		number = sc.nextInt();
		sc.nextLine();
		addPhoneNumber("AlternativeNumber", number, contact);

		System.out.println("Do you have Landline number, If yes press 'y' else press 'N'");
		char choice1 = sc.next().charAt(0);
		if (choice1 == 'y') {
			System.out.println("Enter your Landline Number");
			number = sc.nextInt();
			sc.nextLine();
			addPhoneNumber("LandlineNumber", number, contact);
		} else {
			System.out.println("Does not hold Landline number");
		}

		System.out.println("Do you have FAX number, If yes press 'y' else press 'N'");
		char choice2 = sc.next().charAt(0);
		if (choice2 == 'y') {
			System.out.println("Enter your fax no ");
			number = sc.nextInt();
			sc.nextLine();
			addPhoneNumber("FaxNumber", number, contact);
		} else {
			System.out.println("Does not hold fax number");
		}

		System.out.println("Enter your email id: ");
		contact.setEmailId(sc.nextLine());
		if (Pattern.matches(
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
				contact.emailId)) {
			System.out.println("Valid Email Address ");
		} else {
			System.out.println("Invalid Email Address ");
			System.out.println("Re-Enter your email id: ");
			contact.setEmailId(sc.nextLine());
			System.out.println("Added Successfully ");
		}

	}

	private void addPhoneNumber(String type, int number, Contacts contact) {
		// TODO Auto-generated method stub
		Map<String, Set<Long>> phone = contact.getNumber();
		Set<Long> phoneSet = (!phone.containsKey(type)) ? (new HashSet<Long>()) : phone.get(type);
		phoneSet.add((long) number);
		phone.put(type, phoneSet);

	}

}