package com.pluralsight.flyweight;

public class FlyweightInventoryDemo {

	public static void main(String[] args) {
		InventorySystem ims = new InventorySystem();

		ims.takeOrder("Roomba", 221);
		ims.takeOrder("Bose Headphones", 361);
		ims.takeOrder("Samsung TV", 432);
		ims.takeOrder("Samsung TV", 323);
		ims.takeOrder("Roomba", 563);
		ims.takeOrder("Bose Headphones", 321);
		ims.takeOrder("Roomba", 234);
		ims.takeOrder("Samsung TV", 54);
		ims.takeOrder("Roomba", 34);
		ims.takeOrder("Bose Headphones", 365);
		ims.takeOrder("Samsung TV", 332);
		ims.takeOrder("Roomba", 456);
		
		ims.process();
		
		// We are only creating 3 items (e.g 3 objects) !!!!!
		System.out.println(ims.report());

	}

}