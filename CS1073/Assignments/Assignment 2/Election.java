/** 
  This is an example of a driver program; its purpose is 
  to "try out" the Candidate class.
  @author Natalie Webber
  @author Dineth Mithuranga and 3701155
*/
public class Election {

   public static void main (String[] args) {

      // Create a few Candidate objects:
      Candidate candidate1 = 
         new Candidate ("Ron McDonald", "Conservative Party", "Make Canada Great Again");
      Candidate candidate2 = 
         new Candidate ("Wendy Thomas", "Green Party", "Yes We Can");
      Candidate candidate3 = 
         new Candidate ("Mary Brown", "Liberal Party", "Build Back Better");
      Candidate candidate4 = 
         new Candidate ("Barack Obama", "Democratic Party", "Prosperity and Progress");

	// These statements will update the votes count of each candidate.
	candidate1.addVotes(280);
	candidate2.addVotes(211);
	candidate3.addVotes(342);
	candidate4.addVotes(280);
	candidate2.addVotes(153);

 
      // Now I can print out my candidates, just to confirm that
      // they were created properly:
      System.out.println ("Candidate 1:\n" + candidate1.toString());
      System.out.println ("Candidate 2:\n" + candidate2.toString());
      System.out.println ("Candidate 3:\n" + candidate3.toString());
      System.out.println ("Candidate 4:\n" + candidate4.toString());

   } 
   
} // end of Election class