package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import model.Address;
import model.Contacts;
import model.Name;
import model.ContactHolder;
import model.ContactInformation;

public class handler {
	// adding Intern
	public void addIntern(ContactHolder holder) {
		ArrayList<ContactInformation> contact_list = holder.getContactList();
		ContactInformation contact = new ContactInformation();

		Name name = new Name();
		NameController nameController = new NameController();
		nameController.getname(name);
		contact.setName(name);

		Address address = new Address();
		AddressController addressController = new AddressController();
		addressController.getAddress(address);
		contact.setAddress(address);

		Contacts contacts = new Contacts();
		ContactController contactController = new ContactController();
		contactController.getContacts(contacts);
		contact.setContactNumber(contacts);

		contact_list.add(contact);

	}

	// Display Intern
	public void showIntern(ContactHolder holder) {

		ArrayList<ContactInformation> contact_list = holder.getContactList();

		Iterator<ContactInformation> itr = contact_list.iterator();

		while (itr.hasNext()) {

			ContactInformation contact = itr.next();

			Name name = contact.getName();
			NameController nameController = new NameController();
			nameController.showName(name);

			Address address = contact.getAddress();
			AddressController addressController = new AddressController();
			addressController.printAddress(address);

			Contacts contacts = contact.getContactNumber();
			ContactController contactController = new ContactController();
			contactController.showContacts(contacts);
			contacts.getEmailId();

			System.out.println();
			System.out.println("--------------------------------------------------");
		}
	}

	// Search Intern
	public void searchIntern(ContactHolder holder) {
		ArrayList<ContactInformation> contact_list = holder.getContactList();

		Iterator<ContactInformation> itr1 = contact_list.iterator();

		Scanner in = new Scanner(System.in);
		System.out.println("Enter name to search the contact");
		String name = in.nextLine();
		while (itr1.hasNext()) {

			ContactInformation contact = itr1.next();

			String nameToSearch = contact.getName().firstName;
			if (name.equals(nameToSearch)) {
				System.out.println("What would you like to see ?\n 1.Address\n 2.ContactInformation(Number)");
				int choice = in.nextInt();

				switch (choice) {
				case 1:

					Address address = contact.getAddress();
					AddressController addressController = new AddressController();
					addressController.printAddress(address);
					break;
				case 2:

					Contacts contacts = contact.getContactNumber();
					ContactController contactController = new ContactController();
					contactController.showContacts(contacts);
					break;
				}

			}
		}

	}

	// To Delete any one Intern
	public void deleteOneIntern(ContactHolder holder) {

		ArrayList<ContactInformation> contact_list = holder.getContactList();

		Iterator<ContactInformation> itr1 = contact_list.iterator();

		Scanner in = new Scanner(System.in);
		System.out.println("Enter name to search the contact");
		String name = in.nextLine();
		while (itr1.hasNext()) {

			ContactInformation contact = itr1.next();

			String nameToSearch = contact.getName().firstName;
			if (name.equals(nameToSearch)) {

				itr1.remove();
				System.out.println("Successfully Deleted");
			}
		}
	}

	// To delete all the Intern
	public void deleteAllIntern(ContactHolder holder) {

		ContactInformation c = searchToDeleteIntern(holder, "delete");

		methodTodeleteInternFromList(c, holder);

		System.out.println("Contact Successfully deleted.");

	}

	// method 1 to help deleteIntern
	public void methodTodeleteInternFromList(ContactInformation c, ContactHolder holder) {

		ArrayList<ContactInformation> contactList = holder.getContactList();

		contactList.remove(c);

	}

	// method 2 to help deleteIntern
	public ContactInformation searchToDeleteIntern(ContactHolder holder, String operation) {

		ArrayList<ContactInformation> contactList = holder.getContactList();
		Iterator<ContactInformation> itr = contactList.iterator();
		int count = 1;
		while (itr.hasNext()) {

			ContactInformation c = itr.next();

		}

		count = 1;
		Iterator<ContactInformation> itr2 = contactList.iterator();
		ContactInformation contactToBeReturned = null;
		while (itr2.hasNext()) {
			ContactInformation c = itr2.next();
			if (count++ == 1) {
				contactToBeReturned = c;
				break;
			}

		}

		return contactToBeReturned;

	}

}