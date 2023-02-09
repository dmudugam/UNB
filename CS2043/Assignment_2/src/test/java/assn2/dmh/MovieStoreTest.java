package assn2.dmh;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovieStoreTest {

	Movie m1;
	Movie m2;
	Movie m3;
	Movie m4;
	Movie m5;
	
	MovieStore ms;
	MovieStore ms1;
	
	@BeforeEach
	public void setUp() {
		m1 = new Movie("Star Trek");
		m2 = new Movie("Star Trek");
		m3 = new Movie("Enders Game");
		m4 = new Movie("A Few Good Men");
		m5 = new Movie("Star Wars");
		
		ms = new MovieStore();
		ms1 = new MovieStore();
	}
	
	@AfterEach
	public void tearDown() {
		m1.clearRating();
		m3.clearRating();
		m4.clearRating();
		m5.clearRating();
	}

	@Test
	void testAddMovieDuplicate() {
		ms.addMovie(m1);
		ms.addMovie(m2);
		ms.addMovie(m3);
		int expected = 2;
		int result = ms.allMovies().size();
		assertEquals(expected, result);
	}
	
	@Test
	void testTopRated() {
		m1.addRating(2.0);
		m3.addRating(5.0);
		m5.addRating(4.3);
		
		ms.addMovie(m1);
		ms.addMovie(m2);
		ms.addMovie(m3);
		ms.addMovie(m4);
		ms.addMovie(m5);
		
		int expected = 2;
		int result = ms.topRated(2).size();
		assertEquals(expected, result);
	}
	
	@Test
	void testTopRatedMore() {
		m1.addRating(2.0);
		m3.addRating(5.0);
		m5.addRating(4.3);
		
		ms.addMovie(m1);
		ms.addMovie(m3);
		ms.addMovie(m4);
		ms.addMovie(m5);
		
		int expected = 4;
		int result = ms.topRated(10).size();
		assertEquals(expected, result);
	}
	
	@Test
	void testAllMovies() {
		m1.addRating(2.0);
		m3.addRating(5.0);
		m5.addRating(4.3);
		
		ms.addMovie(m1);
		ms.addMovie(m3);
		ms.addMovie(m4);
		ms.addMovie(m5);
		
		int expected = 4;
		int result = ms.allMovies().size();
		assertEquals(expected, result);
	}
	
	@Test
	void testAllMoviesEmptyStore() {
		int expected = 0;
		int result = ms1.allMovies().size();
		assertEquals(expected, result);
	}
	
	@Test
	void testTopRatedMoviesNoRatings() {
		ArrayList<Movie> m = new ArrayList<Movie>();
		m1.addRating(2.0);
		m3.addRating(5.0);
		m5.addRating(4.3);
		
		ms.addMovie(m1);
		ms.addMovie(m2);
		ms.addMovie(m3);
		ms.addMovie(m4);
		ms.addMovie(m5);
		
		m = ms.topRated(4);
		String expected = m4.getName();
		String result = m.get(m.size()-1).getName();
		assertEquals(expected, result);
	}
	
	@Test
	void testTopRatedEmptyStore() {
		int expected = 0;
		int result = ms1.topRated(4).size();
		assertEquals(expected, result);
	}
	
	@Test
	void testAddMovie() {
		ms.addMovie(m1);
		ms.addMovie(m3);
		ms.addMovie(m4);
		ms.addMovie(m5);
		int expected = 4;
		int result = ms.allMovies().size();
		assertEquals(expected, result);
	}

}
