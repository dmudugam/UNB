package assn1.dmh;
import java.util.ArrayList;
import java.text.NumberFormat;

public class Registrar {
	
	public static double calculateGpa(ArrayList<Grade> grades) {
		if(grades.isEmpty()) {
			return 10.0%0;
		}
		else {
			double totalCreditHours = 0, totalQaulityPoints = 0;
			NumberFormat nf= NumberFormat.getInstance();
			nf.setMaximumFractionDigits(2);
			for(int i = 0; i < grades.size(); i++) {
				totalCreditHours = totalCreditHours + grades.get(i).getCreditHour();
				totalQaulityPoints = totalQaulityPoints + (grades.get(i).getCreditHour() * grades.get(i).getGradePoint());
			}
			String gpa = nf.format((totalQaulityPoints/totalCreditHours));
			return Double.parseDouble(gpa);
		}
	}
	public static double gradeFormat(String gradeFormatIn) {
		double gradePoint = 0;
		if(gradeFormatIn.equals("A+") ) {
			gradePoint = 4.3;
		}
		else if(gradeFormatIn.equals("A") ) {
			gradePoint = 4.0;
		}
		else if(gradeFormatIn.equals("A-") ) {
			gradePoint = 3.7;
		}
		else if(gradeFormatIn.equals("B+") ) {
			gradePoint = 3.3;
		}
		else if(gradeFormatIn.equals("B") ) {
			gradePoint = 3.0;
		}
		else if(gradeFormatIn.equals("B-") ) {
			gradePoint = 2.7;
		}
		else if(gradeFormatIn.equals("C+") ) {
			gradePoint = 2.3;
		}
		else if(gradeFormatIn.equals("C") ) {
			gradePoint = 2.0;
		}
		else if(gradeFormatIn.equals("D") ) {
			gradePoint = 1.0;
		}
		else if(gradeFormatIn.equals("F") ) {
			gradePoint = 0.0;
		}
		return gradePoint;
	}
	public static String gradeFormat(double gradeFormatIn) {
		String gradeLetter = null;
		if(gradeFormatIn == 4.3) {
			gradeLetter = "A+";
		}
		else if(gradeFormatIn == 4.0) {
			gradeLetter = "A";
		}
		else if(gradeFormatIn == 3.7) {
			gradeLetter = "A-";
		}
		else if(gradeFormatIn == 3.3) {
			gradeLetter = "B+";
		}
		else if(gradeFormatIn == 3.0) {
			gradeLetter = "B";
		}
		else if(gradeFormatIn == 2.7) {
			gradeLetter = "B-";
		}
		else if(gradeFormatIn == 2.3) {
			gradeLetter = "C+";
		}
		else if(gradeFormatIn == 2.0) {
			gradeLetter = "C";
		}
		else if(gradeFormatIn == 1.0) {
			gradeLetter = "D";
		}
		else if(gradeFormatIn == 0.0) {
			gradeLetter = "F";
		}
		return gradeLetter;
	}
	
}
