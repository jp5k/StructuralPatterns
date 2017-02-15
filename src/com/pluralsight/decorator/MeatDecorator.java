package com.pluralsight.decorator;

public class MeatDecorator extends SandwichDecorator {

	public MeatDecorator(Sandwich customSandwich) {
		super(customSandwich);
	}

	// As we build the sandwich, we can add functionality (e.g. to add meat)
	// Could have different decorators to build this out (e.g. tofu, cheese)
	public String make() {
		return customSandwich.make() + addMeat();
	}

	private String addMeat() {
		return " + turkey";
	}

}
