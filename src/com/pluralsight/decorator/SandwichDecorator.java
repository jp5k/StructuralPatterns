package com.pluralsight.decorator;

public abstract class SandwichDecorator implements Sandwich {

	// Implements Sandwich Interface, decorators should be treated as objects
	// Creating decorators so don't have to create separate implementations of
	// sandwich, e.g don't need a 'simple sandwich with cheese' class

	protected Sandwich customSandwich;

	// Constructor that through composition takes an instance of Sandwich
	// Can be an instance of a concrete class OR an instance of ANOTHER
	// Decorator !!! KEY POINT
	public SandwichDecorator(Sandwich customSandwich) {
		this.customSandwich = customSandwich;
	}

	// Implement interface of Sandwich with our make() method.
	public String make() {
		return customSandwich.make();
	}
}
