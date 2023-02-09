import java.util.Scanner; 

/** 
  This is program for People to check whether they are eligible for the scholarship;
  @author Dineth Mithuranga and 3701155
*/


public class ScholarshipAssessment 
{
	public static void main (String[] args) 
	{
		Scanner sh = new Scanner(System.in);


		System.out.println(" ");
		System.out.print("Enter the number of credit hours completed in the last year: ");
		int Credit  = sh.nextInt();

		int ScholAmount = 500;

		while(Credit < 0)
		{
			System.out.println("Credit hours must be non-negative");

			System.out.print("Enter the number of credit hours completed in the last year: ");
			Credit  = sh.nextInt();
		}
		
		System.out.print("Have you participated in a university co-op program in the last year (yes or no)? ");

		String ans = sh.nextLine();

		while(!(ans.equals("yes") || ans.equals("no")))
		{
			System.out.print("Enter yes or no: ");

			 ans = sh.nextLine();
		}

		System.out.print("Enter your GPA: ");

		double GPA = sh.nextDouble();

		while(GPA <= 0)
		{
			System.out.print("Invalid GPA. Enter non-negative GPA: ");

			 GPA = sh.nextDouble();
		}

		if(Credit >= 24 || ans.equals("yes"))
		{
			if(GPA >= 2.7)
			{

				if(GPA >= 3.0 && GPA < 3.7)
				{
					ScholAmount = ScholAmount + 200;
				}
				else if(GPA >= 4.0)
				{
					ScholAmount = ScholAmount + 400;
				}
				System.out.print("Enter the number of official university clubs, societies, or teams in which you participated last year: ");
				int clubs = sh.nextInt();
			
				while(clubs <= 0)
				{
					System.out.print("Enter a valid Number");
					clubs = sh.nextInt();
				}
				if(clubs >= 3)
				{
					ScholAmount = ScholAmount + 100;
				}

				System.out.print("Do you have demonstrated financial need (yes or no)? ");
				String finn = sh.nextLine();
			
				while(!(finn.equals("yes") || finn.equals("no")))
				{
					System.out.print("Enter yes or no: ");
					finn = sh.nextLine();
				}
				if(finn.equals("yes"))
				{
					ScholAmount = ScholAmount*2;
				}
				System.out.println("You are eligible for a scholarship of $" + ScholAmount);
			}
			else
			{
				System.out.println("Sorry, you are not eligible for a scholarship.");
			}
		}
		else
		{
			System.out.println("Sorry, you are not eligible for a scholarship.");
		}
		
	}
} // end of ScholarshipAssessment class