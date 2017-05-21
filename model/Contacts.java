package model;

import java.util.HashMap;

import java.util.Map;

import java.util.Set;

public class Contacts {
	public String emailId;
	private Map<String, Set<Long>> number;

	public Contacts() {

		number = new HashMap<String, Set<Long>>();

	}

	public Map<String, Set<Long>> getNumber() {

		return number;

	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}