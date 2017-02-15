package com.pluralsight.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {

		List<Employee> employees = new ArrayList<>();

		Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick",
				"john.wick@test.co.uk");

		employees.add(employeeFromDB);

		// Will not work, this is where the adapter comes into play!
		// Can't just assign an EmplyeeLdap to an employee
		// Employee employeeFromLdap = new EmployeeLdap("chewie", "solo", "Han",
		// "hans@solo.co.uk");
		// SO!!!!, we need to create a new adapter as below:
		EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "solo",
				"Han", "hans@solo.co.uk");

		// So, create new adapter, where we pass in an employeeFromLdap object
		employees.add(new EmployeeAdapterLdap(employeeFromLdap));

		// Now create a NEW adapter, for a .csv database. Done in
		// exactly the same way as the Ldap server.
		// NOTE!! - usually create a separate adapter for each instance we want
		// to wrap.
		EmployeeCSV employeeFromCSV = new EmployeeCSV(
				"567, Sherlock, Holmes,sherlocl@holmes.co.uk");

		employees.add(new EmployeeAdapterCSV(employeeFromCSV));

		return employees;

	}

}
