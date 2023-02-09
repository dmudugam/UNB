import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.InputMismatchException;

/**
	This class is the Driver program for Cavern.
	@author Dineth Mithuranga and 3701155
*/
	
public class Driver
{	
	/**
	The 2D array to store numbers.
	*/
	private static int[][] cave;
	
	
	
	
	/**
	Prints the array.
	*/
	public static void printArray()
	{
		for(int i = 0; i < cave.length; i++)
		{
			for(int j = 0; j < cave[i].length; j++)
			{
				System.out.print(cave[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		
		
		try
		{
			System.out.print("Please Enter the name of the Map file: ");
			String fileName = sc.next();
			File myFile = new File(fileName);
			int k = 0;
			Scanner s = new Scanner(myFile);
			int rows = s.nextInt();
			int columns = s.nextInt();
			
			cave = new int[rows][columns];
			
			// Assign values to the array.
			for(int i = 0; i < cave.length; i++)
			{
				for(int j = 0; j < cave[i].length; j++)
				{
					int no = s.nextInt();
					cave[i][j] = no;
					
					if(cave[0][j] == 0)
					{
						k = j;
					}
				}
			}
			
			// prints the array before processing.
			System.out.println("\nInput : \n");
			printArray();
	
			int c = Cavern.Close(cave, 0,k);
		
			// prints the array after processing.
			System.out.println("Output : \n");
			printArray();
			System.out.println("\nThe area of the cavern is: " + c);
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found.");
		}
		catch(InputMismatchException w)
		{
			System.out.println("problem reading line.");
		}

	}
	
}