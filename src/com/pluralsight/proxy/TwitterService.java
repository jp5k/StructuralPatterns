package com.pluralsight.proxy;

public interface TwitterService {
	
	// Going to put a security proxy inbetween this and the implementation class
	public String getTimeline(String screenName);
	public void postToTimeline(String screenName, String message);

}
