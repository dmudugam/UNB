package assn1.dmh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradeTest {

	@Test
	void testLetterConstructor() {
		Grade g = new Grade("CS1003", 4, "B");
		double expected = 3.0;
		double result = g.getGradePoint();
		assertEquals(expected, result);
	}
	@Test
	void testPointConstructor() {
		Grade g = new Grade("CS1003", 4, 3.3);
		String expected = "B+";
		String result = g.getGradeLetter();
		assertEquals(expected, result);
	}


}
