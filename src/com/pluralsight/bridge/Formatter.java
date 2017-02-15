package com.pluralsight.bridge;

import java.util.List;

public interface Formatter {
	// This is like the colour interface in the shape2 example
	String format(String header, List<Detail> details);
	
}
