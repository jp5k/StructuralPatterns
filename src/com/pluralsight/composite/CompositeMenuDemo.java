package com.pluralsight.composite;

public class CompositeMenuDemo {

	public static void main(String[] args) {

		Menu mainMenu = new Menu("Main", "/main");

		MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");

		mainMenu.add(safetyMenuItem);

		Menu claimsSubMenu = new Menu("Claims", "/claims");

		mainMenu.add(claimsSubMenu);

		MenuItem personalClaimsMenu = new MenuItem("Personal Claim",
				"/personalClaims");

		claimsSubMenu.add(personalClaimsMenu);

		// Call system out on mainMenu, and it navigates through entire menu
		// structure
		// and prints out all information in that strucutre.
		System.out.println(mainMenu.toString());

		// Could take the example a step further and show the tree structure
		// of the particular menus, by altering the toString method, e.g.
		// Main --> Saftety 
		// Main --> Claims 
		// Main --> Claims --> PersonClaims
		
		
		
	}

}
