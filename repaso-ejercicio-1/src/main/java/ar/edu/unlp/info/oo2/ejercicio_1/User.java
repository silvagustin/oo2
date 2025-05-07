package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String screenName;
	private List<Tweet> tweets = new ArrayList<Tweet>();
	
	public User(String screenName) {
		this.screenName = screenName;
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	
	public List<Tweet> getTweets() {
		return this.tweets;
	}
	
	public void createTweet(String text) {
		Tweet tweet = new Tweet(text);
		
		if (tweet.isValid()) {
			tweets.add(tweet);
		}
	}
	
	public void deleteTweets() {
		this.tweets.clear();
	}

}
