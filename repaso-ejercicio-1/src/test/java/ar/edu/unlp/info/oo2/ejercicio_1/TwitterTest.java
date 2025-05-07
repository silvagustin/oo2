package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	
	Twitter twitter;
	String screenName;

	@BeforeEach
	void setUp() throws Exception {
		screenName = "Agustin";
		twitter = new Twitter();
		twitter.createUser(screenName);
	}
	
	@Test
	public void testCreateUser() {
		twitter.createUser("Juan");
		assertEquals(2, twitter.getUsers().size());
	}
	
	@Test
	public void testDeleteUser() {
		twitter.deleteUser(screenName);
		assertEquals(0, twitter.getUsers().size());
	}
	
	@Test
	public void testFindUser() {
		assertNotNull(twitter.findUser(screenName));
	}
	
	@Test
	public void testFindUserIsNull() {
		assertNull(twitter.findUser("Sarasa"));
	}
	
}
