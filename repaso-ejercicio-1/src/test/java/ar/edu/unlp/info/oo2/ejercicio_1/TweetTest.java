package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TweetTest {
	
	Tweet validTweetOne, validTweetTwo, invalidTweetOne, invalidTweetTwo;
	
	@BeforeEach
	void setUp() throws Exception { 
		validTweetOne = new Tweet("A");
		validTweetTwo = new Tweet("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit");
		
		invalidTweetOne = new Tweet("");
		invalidTweetTwo = new Tweet("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut oditA");
	}
	
	@Test
	public void testIsValidWithMinimumLength() {
		assertTrue(validTweetOne.isValid());
	}
	
	@Test
	public void testIsValidWithMaximumLength() {
		assertTrue(validTweetTwo.isValid());
	}
	
	@Test
	public void testIsValidWithoutText() {
		assertFalse(invalidTweetOne.isValid());
	}
	
	@Test
	public void testIsValidWithTextOverflow() {
		assertFalse(invalidTweetTwo.isValid());
	}
	
}
