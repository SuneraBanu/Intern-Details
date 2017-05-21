package model;

import java.util.ArrayList;

public class ContactHolder {

	private ArrayList<ContactInformation> contact_list;

	public ContactHolder() {

		contact_list = new ArrayList<ContactInformation>();

	}

	public ArrayList<ContactInformation> getContactList() {

		return contact_list;

	}

}