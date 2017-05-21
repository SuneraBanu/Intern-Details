package model;

import model.Address;

public class ContactInformation {
 

	private Name name;

	public Address address;

	private Contacts contactNumber;

	public Name getName() {

		return name;

	}

	public void setName(Name name) {

		this.name = name;

	}

	public Address getAddress() {

		return address;

	}

	public void setAddress(Address address) {

		this.address = address;

	}

	public Contacts getContactNumber() {

		return contactNumber;
	}

	public void setContactNumber(Contacts contactNumber) {

		this.contactNumber = contactNumber;
	}

	
}
