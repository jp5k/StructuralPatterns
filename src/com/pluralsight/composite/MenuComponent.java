package com.pluralsight.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

	String name;
	String url;
	List<MenuComponent> menuComponents = new ArrayList<>();

	// Following two methods establish the options for all classes
	// extending this abstract class
	// So, if we want to have add or remove functionality that is fine. But we
	// may just want to throw this exception if not supported, which is fine
	// too.
	// So, don't make the method abstract (just override it in child class IF WE
	// WANT TO!!!)
	public MenuComponent add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException(
				"Feature not implemented at this level");
	}

	public MenuComponent remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException(
				"Feature not implemented at this level");
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public abstract String toString();

	String print(MenuComponent menuComponent) {
		StringBuilder builder = new StringBuilder(name);
		builder.append(": ");
		builder.append(url);
		builder.append("\n");
		return builder.toString();

	}

}
