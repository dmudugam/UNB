import java.util.Scanner; 


/** 
  This is program converts arabic numbers to mayan numbers.
  @author Dineth Mithuranga and 3701155
*/


public class Convert 
{
	public static void main (String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an Arabic number: ");
		int number = input.nextInt();
		int numprint = number;

		String a = "";

		while(number < 1)
		{
			System.out.println("Invalid input. You must enter a non-negative number.");
			System.out.print("Please enter another Arabic number now: ");
			number = input.nextInt();
			numprint = number;
		}

		while(number > 0)
		{
			int newnum = number % 20;
			number = number / 20;
			
				a = "\n" + a;

				String digit = "";
				if(newnum == 0)
				{
					digit = digit + " U ";
				}
				else
				{
					while(newnum > 0)
					{
				

						if(newnum > 0 && newnum < 5)
						{
							digit = digit + " O ";
							newnum = newnum - 1;
						}

						else if(newnum >= 5)
						{
							digit = digit + " _ ";
							newnum = newnum - 5;
					
						}
					}

				}
				a = digit + a;

				
		}
		System.out.println("The Mayan number for " + numprint + " is:");
		System.out.println(a);
	
	}
} // end Convert