package assn1.dmh;

public class TranscriptDriver {

	public static void main(String[] args) {
		Transcript student1 = new Transcript(8510804);
		
		student1.addGrade(new Grade("CS1003", 4, "B"));
		student1.addGrade(new Grade("CS2033", 4, "A"));
		student1.addGrade(new Grade("ECE2213", 4, 3.3));
		student1.addGrade(new Grade("ECON1001", 3, 2.0));
		student1.addGrade(new Grade("CS2033", 4, "B"));
		
		student1.printTranscript();
		
		student1.remove("CS2033", "B");
		
		System.out.println("");
		student1.printTranscript();
		
		student1.addGrade(new Grade("CS2033", 4, "B"));
		
		student1.remove("CS2033");
		
		System.out.println("");
		student1.printTranscript();
		
		Transcript student2 = new Transcript(8510805);
		
		System.out.println("");
		student2.printTranscript();
	}
}
