package assn1.dmh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TranscriptTest {
	Grade g1;
	Grade g2;
	Transcript t;

	@BeforeEach
	public void setUp() {
		g1 = new Grade("CS1003", 4, 3.0);
		g2 = new Grade("CS2043", 4, "A");
		t = new Transcript(8510804);
	}

	@AfterEach
	public void tearDown() {
		t.clearGrades();
	}

	@Test
	void GradeIsTracked() {
		t.addGrade(g1);
		Double result = t.getGpa();
		Double expected = g1.getGradePoint();
		assertEquals(expected, result);
	}
	@Test
	void multipleGradesYieldWeightedAve() {
		t.addGrade(g1);
		t.addGrade(g2);
		Double result = t.getGpa();
		Double expected = (3.0*4 + 4.0*4)/(4+4);
		assertEquals(expected, result);
	}
	@Test
	void emptyGradesshouldYieldNaN() {
		Double expected = 0.0/0.0; //NaN
		Double result = t.getGpa();
		assertEquals(expected, result);
	}
	

}
