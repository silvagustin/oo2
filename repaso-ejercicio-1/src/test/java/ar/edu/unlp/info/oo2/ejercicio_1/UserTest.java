package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {
	
	User user;
	String screenName;

	@BeforeEach
	void setUp() throws Exception {
		screenName = "Agustin";
		user = new User(screenName);
		user.createTweet("Lorem ipsum sit amet");
	}
	
	@Test
	public void testCreateTweet() {
		user.createTweet("Lorem ipsum sit amet");
		assertEquals(2, user.getTweets().size());
	}
	
	@Test
	public void testCreateTweetWithoutText() {
		user.createTweet("");
		assertEquals(1, user.getTweets().size());
	}
	
	@Test
	public void deleteTweets() {
		user.deleteTweets();
		assertEquals(0, user.getTweets().size());
	}
	
}
