import java.util.Scanner; 
import java.util.Arrays;  

/** 
  This Class is to sort the maximum grade and minimum grade; 
  @author Dineth Mithuranga and 3701155
*/


public class Grades
{
	public static void main (String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double max = 0;
		double min = 0;
		boolean mini = true;
		int maxindex = 0;
		int minindex = 0;

		System.out.print("How many grades will you enter? ");
		int nog = input.nextInt();


		while(nog < 0)
		{
			System.out.print("Invalid input, please Enter a valid number: ");
			nog = input.nextInt();
		}
	
		double [] grades = new double [nog];

		for(int i = 0; i < nog; i++)
		{
			System.out.print("Enter grade " + (i+1) + ": ");
			grades[i] = input.nextDouble();

			while(grades[i] < 0 || grades[i] > 100)
			{
				System.out.println("The grade must be between 0 and 100.");
				System.out.print("Enter grade " + (i+1) + ": ");
				grades[i] = input.nextDouble();
			}
	
		}
		for(int p = 0; p < nog; p++)
		{
			if(grades[p] > max)
			{
				max = grades[p];
				maxindex = p;
			}
			if(grades[p] < min || mini)
			{
				min = grades[p];
				minindex = p;
				mini = false;
			}
		}
		
		
		grades[maxindex] = grades[0];
		grades[minindex] = grades[grades.length-1];
		if(minindex == 0)
		{
			double value = grades[maxindex];
			grades[maxindex] = grades[minindex];
			grades[minindex] = value;
		}
		grades[grades.length-1] = min;
		grades[0] = max;
		
		

		System.out.println("\nReordered Grades: ");
		
		for(int j = 0; j < nog; j++)
		{
			System.out.println(grades[j]);
		}
	}
} // end of Grades Class