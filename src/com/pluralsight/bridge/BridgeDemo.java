package com.pluralsight.bridge;

public class BridgeDemo {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setClassification("Action");
		movie.setTitle("John Wick");
		movie.setRuntime("2.15");
		movie.setYear("2104");

		Formatter printFormatter = new PrintFormatter();
		Printer moviePrinter = new MoviePrinter(movie);

		String printedMaterial = moviePrinter.print(printFormatter);

		System.out.println(printedMaterial);

		// Can easily create a new HtmlFormatter
		// Don't have to create new instance of MoviePrinter. Using 
		// the same version that we had before, just passing in the 
		// new formatter, e.g htmlFormatter.
		Formatter htmlFormatter = new HtmlFormatter();

		String htmlMaterial = moviePrinter.print(htmlFormatter);

		System.out.println(htmlMaterial);
		
		// Could now also have a new media type, e.g a Book rather than a movie.
		// Could then have a Book Printer etc, etc...
		

	}

}
