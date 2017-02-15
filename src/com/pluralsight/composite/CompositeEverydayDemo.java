package com.pluralsight.composite;

import java.util.HashMap;
import java.util.Map;

public class CompositeEverydayDemo {

	public static void main(String[] args) {

		// Create person attributes
		Map<String, String> personAttributes = new HashMap<>();

		personAttributes.put("site_role", "person");
		personAttributes.put("access_role", "limited");

		// Create group attributes
		Map<String, String> groupAttributes = new HashMap<>();

		groupAttributes.put("group_role", "claims");

		Map<String, String> secAttributes = new HashMap();

		// Add person and group attributes to Security attributes
		// .putAll method treats each map as a composite as the previous one
		secAttributes.putAll(personAttributes);
		secAttributes.putAll(groupAttributes);

		// Combines all roles into a single map!!
		System.out.println(secAttributes);

	}

}
