package com.pluralsight.flyweight;

public class FlyweightEverydayDemo {

	public static void main(String[] args) {
		Integer firstInt = Integer.valueOf(5);
		
		Integer secondInt = Integer.valueOf(5);
		
		Integer thirdInt = Integer.valueOf(10);
		
		// firstInt and secondInt have same identityHashCode.
		// Flyweight is retrieving the same object back.
		System.out.println(System.identityHashCode(firstInt));
		System.out.println(System.identityHashCode(secondInt));
		System.out.println(System.identityHashCode(thirdInt));

	}
	
	
}
