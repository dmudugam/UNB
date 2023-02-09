import java.util.Scanner; 

/** 
  This is the driver program for Triangle and CartesianPoint Class; its purpose is 
  to "try out" the Triangle and CartesianPoint class.
  @author Dineth Mithuranga and 3701155
*/


public class SleepTracker 
{
	public static void main (String[] args) 
	{
		Scanner sh = new Scanner(System.in);

		System.out.print("Please enter your optimal sleep time (in hours) : ");
		
		int input = sh.nextInt();
		int input1 = 1;
		int counter = 0;
		int opcounter = 0;
		int sleephours = 0;
		int lowest = 0;
		double avg = 0;
		

		System.out.println("Next, enter your recorded sleep history values (in hours). \nEnter a negative number when done : ");

		while(input1 > 0)
		{

			
			input1 = sh.nextInt();
			
			if(input1 > 0)
			{

				sleephours = sleephours + input1;
				counter = counter + 1;

		
				if(input1 < input)
				{
					opcounter = opcounter + 1;
				}
				if(input1 < lowest && input1 > 0 || lowest == 0)
				{
					lowest = input1;
				
				}
			
			}
			
			

		}

		avg = (double) sleephours / counter;

		System.out.println("Your sleep report: \n" + counter + " nights total \n" + opcounter + " nights below your optimal sleep time \nLowest sleep time: " + lowest + " hours\nAverage sleep time: " + avg + " hours");
	}
} // end of SleepTracker class