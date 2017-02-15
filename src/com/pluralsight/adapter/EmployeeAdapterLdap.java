package com.pluralsight.adapter;

public class EmployeeAdapterLdap implements Employee {

	// So, create this Adapter class. This takes an EmployeeLdap instance
	// in the constructor. We can then manipulate the getters so that
	// they return the same named instance variables to the client
	// from the Ldap database.

	private EmployeeLdap instance;

	public EmployeeAdapterLdap(EmployeeLdap instance) {
		this.instance = instance;
	}

	@Override
	public String getId() {
		return instance.getCn();
	}

	@Override
	public String getFirstName() {
		return instance.getGivenName();
	}

	@Override
	public String getLastName() {
		return instance.getSurname();
	}

	@Override
	public String getEmail() {
		return instance.getMail();
	}

	// Can build out toString method (could argue this is decorator pattern).
	public String toString() {

		return "ID:" + instance.getCn() + "," + "FirstName:"
				+ instance.getGivenName() + "," + "LastName:" + instance.getSurname()
				+ "," + "email:" + instance.getMail();

	}

}
