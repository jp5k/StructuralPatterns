package com.pluralsight.composite;

import java.util.Iterator;

public class Menu extends MenuComponent {

	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}

	// Add an add and remove method to navigate through tree
	// Always best to return the object which has been added/removed
	// Makes it easier when making changes down the road.

	// Note, @Override doesn't have to be used, if don't want 
	// (See MenuItem class for more details!!)
	@Override
	public MenuComponent add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
		return menuComponent;
	}

	@Override
	public MenuComponent remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
		return menuComponent;
	}

	public String toString() {

		StringBuilder builder = new StringBuilder(); // builder pattern

		// This method is referring to the MenuComponent method
		builder.append(print(this));

		// Iterate through all of our childen
		// A prerequisite of this pattern is that we know about our childen!!!
		// We just hand off to the leaf (which knows about itself) and then
		// get the information back from the leaf!!
		Iterator<MenuComponent> itr = menuComponents.iterator();
		while (itr.hasNext()) {
			// When we get our next component, we just append the toString
			// to the end of the menu structure.
			MenuComponent menuComponent = itr.next();
			builder.append(menuComponent.toString());

		}
		return builder.toString();

	}

}
