package assn1.dmh;
import java.util.ArrayList;

public class Transcript {
	private int studentId;
	private ArrayList <Grade> grades;
	
	public Transcript(int studentIdIn) {
		studentId = studentIdIn;
		grades = new ArrayList<Grade>();
	}
	public void addGrade(Grade gradesIn) {
		grades.add(gradesIn);
	}
	@Override
	public String toString() {
		String transcript;
		transcript = "Student   " + studentId + ":   GPA " + Registrar.calculateGpa(grades);
		return transcript;
	}
	
	public void printTranscript() {
		System.out.println(this.toString());
		if(!grades.isEmpty()) {
			for(Grade transcriptP : grades) {
				System.out.println(transcriptP);
			}
		}
	}
	public void remove(String courseNumber) {
		
		for(int i = 0; i < grades.size(); i++) {
			if(grades.get(i).getCourseNumber().equals(courseNumber)) {
				grades.remove(i);
			}
		}
	}
	public void remove(String courseNumber, String gradeLetter) {
		
		for(int i = 0; i < grades.size(); i++) {
			if(grades.get(i).getCourseNumber().equals(courseNumber) && grades.get(i).getGradeLetter().equals(gradeLetter)) {
				grades.remove(i);
			}
		}
	}
	
	public void clearGrades() {
		grades.removeAll(grades);
	}
	public double getGpa() {
		return Registrar.calculateGpa(grades);
	}
	
}
