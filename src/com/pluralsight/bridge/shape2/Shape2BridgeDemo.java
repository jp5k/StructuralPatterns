package com.pluralsight.bridge.shape2;

public class Shape2BridgeDemo {

	public static void main(String[] args) {
		Color blue = new Blue();

		// Now use composition to pass in the colour.

		Shape square = new Square(blue);

		Color red = new Red();

		Shape circle = new Circle(red);

		square.applyColor();
		circle.applyColor();

		// The beauty of this is that we can easily add new shapes or colours.
		// So we can easily add Green, or Rectangle etc...
		// No longer an orthogonal problem.
		// I.e. created green circle below, but DIDN'T HAVE to change circle
		// object at all
		// it was abstracted out from the change in colours.
		Color green = new Green();
		Shape greenCircle = new Circle(green);
		greenCircle.applyColor();

		Shape greenSquare = new Square(green);

		greenSquare.applyColor();

		// The colours are on one side, and the shapes on the other side. We can
		// now make
		// changes easily on both sides without affecting the other side.

	}

}
