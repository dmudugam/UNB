package assn1.dmh;

public class Grade {
	private String gradeLetter;
	private String courseNumber;
	private double gradePoint;
	private int creditHour;
	
	public Grade(String courseNumberIn, int creditHourIn, String gradeLetterIn) {
		courseNumber = courseNumberIn;
		creditHour = creditHourIn;
		gradeLetter = gradeLetterIn;
		gradePoint = Registrar.gradeFormat(gradeLetterIn);
		
		
	}
	public Grade(String courseNumberIn, int creditHourIn, double gradePointIn) {
		courseNumber = courseNumberIn;
		creditHour = creditHourIn;
		gradePoint = gradePointIn;
		gradeLetter = Registrar.gradeFormat(gradePointIn);
	}
	public double getGradePoint() {
		return gradePoint;
	}
	@Override
	public String toString() {
		return courseNumber + "   " + creditHour + "CH   " + gradePoint + "   (" + gradeLetter + ")";
	}
	public double getCreditHour() {
		return creditHour;
	}
	public String getCourseNumber() {
		return courseNumber;
	}
	public String getGradeLetter() {
		return gradeLetter;
	}
	
	
}
