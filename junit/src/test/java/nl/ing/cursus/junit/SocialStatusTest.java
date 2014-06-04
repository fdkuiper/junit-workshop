package nl.ing.cursus.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SocialStatusTest {
	SocialStatus socialStatus = null;

	@Before
	public void setUp() throws Exception {
		socialStatus = new SocialStatusImpl();
	}

	@Test
	public void testGetDescription() {
		socialStatus.makeNice();
		String description = socialStatus.getDescription();
		String expected = "I'm so nice!!!";
		assertEquals(expected, description);
	}

}
