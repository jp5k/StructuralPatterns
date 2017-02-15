package com.pluralsight.adapter;

public class EmployeeLdap {

	// Imagine that this is legacy code that doesn't implement an interface,
	// and we can't change this particular class

	private String cn;
	private String surname;
	private String givenName;
	private String mail;

	public EmployeeLdap(String cn, String surname, String givenName, String mail) {
		this.cn = cn;
		this.surname = surname;
		this.givenName = givenName;
		this.mail = mail;

	}

	public String getCn() {
		return cn;
	}

	public String getSurname() {
		return surname;
	}

	public String getGivenName() {
		return givenName;
	}

	public String getMail() {
		return mail;
	}

}
