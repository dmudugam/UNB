import java.util.Scanner; 

/** 
  This is program help people to determine whether or not they are eligible to apply for a peer mentor position.
  @author Dineth Mithuranga and 3701155
*/

public class PeerMentor
{

public static void main (String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		

		/**
		Local variable to store word "Yes" to compare with what user enters.
		*/

		String yes = "Yes";

		/**
		Local variable to store word "No" to compare with what user enters.
		*/

		String no = "No";

		/**
		Local variable to store word "yes" to compare with what user enters.
		*/

		String yes1 = "yes";

		/**
		Local variable to store word "no" to compare with what user enters.
		*/

		String no1 = "no";

		System.out.print("Are you an undergraduate student? (Yes/No): ");
		String userInput = sc.nextLine();


		System.out.println("");

		/**
		Checks the user is a undergraduate student or not.
		*/

		if(userInput.equals(yes) || userInput.equals(yes1))
		{
			System.out.print("Will you be on a study term? (Yes/No): ");
			userInput = sc.nextLine();
			System.out.println("");

			/**
			Checks the user studying this term or not.
			*/

			if(userInput.equals(yes) || userInput.equals(yes1))
			{
				System.out.print("Is your GPA at least 2.7? (Yes/No): ");
				userInput = sc.nextLine();
				System.out.println("");

				/**
				Checks the user's GPA is higher than 2.7.
				*/

				if(userInput.equals(yes) || userInput.equals(yes1))
				{
					System.out.print("You should apply!");
				}
				else if(userInput.equals(no) || userInput.equals(no1))
				{
					System.out.print("Sorry, you cannot apply.");
				}
			}
			else if(userInput.equals(no) || userInput.equals(no1))
			{
				System.out.print("Sorry, you cannot apply.");
			}
		}
		else if(userInput.equals(no) || userInput.equals(no1))
		{
			System.out.print("Are you a grad student? (Yes/No): ");
			userInput = sc.nextLine();
			System.out.println("");

			
			/**
			Checks the user is a graduate student or not.
			*/

			if(userInput.equals(yes) || userInput.equals(yes1))
			{
				System.out.print("Do you have your supervisor's permission? (Yes/No): ");
				userInput = sc.nextLine();
				System.out.println("");

				/**
				Checks the whether user has the permission from supervisor.
				*/

				if(userInput.equals(yes) || userInput.equals(yes1))
				{
					System.out.print("You should apply!");
				}
				else if(userInput.equals(no) || userInput.equals(no1))
				{
					System.out.print("Sorry, you cannot apply.");
				}	
			}
			else if(userInput.equals(no) || userInput.equals(no1))
			{
				System.out.print("Sorry, you cannot apply.");
			}
		}





	} 
   
} // end of PeerMentor class