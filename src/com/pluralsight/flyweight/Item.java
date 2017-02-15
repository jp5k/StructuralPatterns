package com.pluralsight.flyweight;

// Instances of Item will be the Flyweight
// Our implementation of our flyweight.
// E.g Amazon objects - would use up a lot of memory
// Everything is final and IMMUTABLE, so that these ojects can be REUSED!!
public class Item {

	private final String name;

	public Item(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

}
