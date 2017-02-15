package com.pluralsight.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterEverydayDemo {

	public static void main(String[] args) {

		// Array of Integers, to be passed into Arrays.asList() method
		Integer[] arrayOfInts = new Integer[] { 42, 43, 44 };

		// Will 'adapt' an arry of integers into a List (the List api's came out
		// later than the array functionality in Java)
		List<Integer> listOfInts = Arrays.asList(arrayOfInts);

		System.out.println(arrayOfInts);

		System.out.println(listOfInts);

	}

}
