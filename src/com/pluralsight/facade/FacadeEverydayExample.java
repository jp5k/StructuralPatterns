package com.pluralsight.facade;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeEverydayExample {

	public static void main(String[] args) throws Exception {

		// Grab an instance of the URL
		// This URL class is the facace. The URL is doing a lot of work behind
		// the scenes here,
		// excellent use of facade pattern.
		URL url = new URL("http", "www.pluralsight.com", 80,
				"/author/bryan-hansen");

		// This is a decorator pattern being used again
		BufferedReader in = new BufferedReader(new InputStreamReader(
				url.openStream()));

		String inputLine;

		// Need to be connected to internet!!
		while ((inputLine = in.readLine()) != null) {
			System.out.println(inputLine);
		}

	}

}
