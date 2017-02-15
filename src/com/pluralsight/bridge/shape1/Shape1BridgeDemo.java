package com.pluralsight.bridge.shape1;

public class Shape1BridgeDemo {

	public static void main(String[] args) {
		
		Circle circle = new BlueCircle();
		
		Square square = new RedSquare();
		
		Square greenSquare = new GreenSquare();
		
		circle.applyColor();
		square.applyColor();
		greenSquare.applyColor();
		
		// NOTE - THIS IS THE PROBLEM.
		// What about if we wanted to create a green square.  Have to then have 
		// to add a green circle.  What about if we wanted to add another colour,
		// have to apply it for all shapes.  What about if we wanted to create a 
		// new shape.  This is an orthogonal problem !!
		
	}
	
	
	
}
