package assn2.dmh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MovieTest {
	
	Movie m1;
	Movie m2;
	Movie m3;
	
	@BeforeEach
	public void setUp() {
		m1 = new Movie("Star Trek");
		m2 = new Movie("Star Trek");
		m3 = new Movie("Enders Game");
	}
	
	@AfterEach
	public void tearDown() {
		m1.clearRating();
		m2.clearRating();
		m3.clearRating();
	}

	@Test
	void testMovieConstructor() {
		String expected = "Star Trek";
		String result = m1.getName();
		assertEquals(expected, result);
	}
	
	@Test
	void testEquals() {
		boolean expected = true;
		boolean result = m1.equals(m2);
		assertEquals(expected, result);
	}
	
	@Test
	void testCompareTo() {
		m1.addRating(4.3);
		m3.addRating(5);
		int expected = 1;
		int result = m1.compareTo(m3);
		assertEquals(expected, result);
	}
	
	@ParameterizedTest
	@CsvSource({"6, 0", "7, 0", "-5, 0", "4, 4"})
	void testAddMovieRating(double input, double expected) {
		m1.addRating(input);
		double result = m1.getAverageRating();
		result = m1.getAverageRating();
		assertEquals(expected, result, "tested on " + input);
	}
}
