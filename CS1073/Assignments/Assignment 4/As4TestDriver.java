/** 
  This is the driver program for Residence and ResidentSenior Class; its purpose is 
  to "try out" the Residence and ResidentSenior class.
  @author Dineth Mithuranga and 3701155
*/

public class As4TestDriver
{

public static void main (String[] args) 
	{

		

		Residence AdaleenHome = new Residence ("Courtyard Gardens", 212, 925);

		ResidentSenior  Adaleen = new ResidentSenior ("Adaleen Grant", 1550, 48, 350, AdaleenHome);

		Residence WalterHome = new Residence ("Forest Glen", 110, 1075);

		ResidentSenior  Walter = new ResidentSenior ("Walter White", 0, 225, 0, WalterHome);

		Residence RuthHome = new Residence ("Brookside Meadows", 225, 850);

		ResidentSenior  Ruth = new ResidentSenior ("Adaleen Grant", 1550, 0, 439.50, RuthHome);


		Adaleen.setEntertainmentAmount(64);

		
		Residence WalterHome1 = new Residence ("Cedar Lake", 313, 1280);

		WalterHome = WalterHome1;


		Walter.setHome(WalterHome);

		Ruth.setNursingCareAmount(2295.82);

		Adaleen.setFundingSupport(764);



 
		// Printing out Resident's details
		

		System.out.println ("\n" + Adaleen.getOnSiteMailLabel() + "\nTotal Amount Owing - " + Adaleen.getTotalFeesOwing());
		System.out.println ("\n" + Walter.getOnSiteMailLabel() + "\nTotal Amount Owing - " + Walter.getTotalFeesOwing());
		System.out.println ("\n" + Ruth.getOnSiteMailLabel() + "\nTotal Amount Owing - " + Ruth.getTotalFeesOwing());



	} 
   
} // end of As4TestDriver class