/** 
This class represents a candidate in an election.
@author Natalie Webber
@author Dineth Mithuranga and 3701155
*/

public class Candidate {

   // Instance variables:
   // For each Candidate object, store his/her name,  
   // the number of votes he/she has received so far,
   // and his/her political party,
   // and their party slogan.

   private String name;
   private int numVotes;
   private String party;
   private String slogan;

   // This method will increase votes count by some specified number

 public void addVotes (int votesIn) {
	numVotes += votesIn;
	

   }

   // The constructor creates a new Candidate object
   // and initializes the instance variables.
   public Candidate (String nameIn, String partyIn, String sloganIn) {
      name = nameIn;
      numVotes = 0; //no votes counted yet
      party = partyIn;
      slogan = sloganIn;
   }
  


   // This is a method that we can call on a Candidate
   // object. (Specifically, it is an accessor method).
   // This method creates and returns a String containing
   // all the information about the state of the object.
   public String toString () {
      return ("Name: "  + name + "\n"
            + "Number of Votes: "  + numVotes + "\n"
            + "Party: " + party + "\n" + "Slogan: " + slogan + "\n");
   }


} // end of Candidate class