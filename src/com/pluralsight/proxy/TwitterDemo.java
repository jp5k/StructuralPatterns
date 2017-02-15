package com.pluralsight.proxy;

public class TwitterDemo {
	
	public static void main(String[] args) {
		/* This was the first example using the stub */
		//TwitterService service = (TwitterService)SecurityProxy.newInstance(new TwitterServiceStub());
		
		// This is the second example, actually using the bh5k account,
		// but this won't work because the keys don't work
		// Normally this would show the timeline on the twitter account
		TwitterService service = (TwitterService)SecurityProxy.newInstance(new TwitterServiceImpl());
		//System.out.println(service.getTimeline("bh5k"));
		
		// Now we can introduce security in the proxy.
		// Firstly if we try and post to timeline, it will go through
		// Second time (once we've added our security in our SecurityProxy class, this won't be allowed through)
		// So we're intercepting the calls in the middle, to provide a security layer.
		service.postToTimeline("bh5k", "Some message that shouldn't go through");
		
		
		
		
	}

}
