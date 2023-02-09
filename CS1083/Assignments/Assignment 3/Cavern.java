import java.util.Scanner;

/**
	This class Cavern.
	@author Dineth Mithuranga and 3701155.
*/

public class Cavern
{
	/**
	The 2D array to store numbers.
	*/
	private static int[][] cave;
	
	/**
	Record how many changes has made to the array.
	*/
	private static int changes;
	
	/**
	Check all the changes have made or not.
	*/
	private static boolean done = true;
	
	/**
	Check the top value.
	@param row number.
	@param column number.
	*/
	public static void checkUp(int row, int column)
	{
		if(row > 0 && cave[row-1][column] == 0 && cave[row][column] == 3)
		{
			cave[row-1][column] = 3;
			cave[row][column] = 3;
			changes = changes + 1;
		}
		
	}
	
	/**
	Check the bottom value.
	@param row number.
	@param column number.
	*/
	public static void checkDown(int row, int column)
	{
		if(row < cave.length-1 && cave[row+1][column] == 0)
		{
			cave[row+1][column] = 3;
			cave[row][column] = 3;
			changes = changes + 1;
		}
	
	}
	
	/**
	Check the left value.
	@param row number.
	@param column number.
	*/
	public static void checkLeft(int row, int column)
	{
		if(column > 0 && cave[row][column-1] == 0 && cave[row][column] == 3)
		{
			cave[row][column-1] = 3;
			cave[row][column] = 3;
			changes = changes + 1;
		}
	
	}
	
	/**
	Check the right value.
	@param row number.
	@param column number.
	*/
	public static void checkRight(int row, int column)
	{
		if(column < cave[row].length-1 && cave[row][column] == 3 && cave[row][column+1] == 0)
		{
			cave[row][column] = 3;
			cave[row][column+1] = 3;
			changes = changes + 1;
		}
	
	}
	
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
	
	/**
	Calculate the area of the cavern.
	@return area of the cavern.
	*/
	public static int calculateArea()
	{
		int count = 0;
		for(int i = 0; i < cave.length; i++)
		{
			for(int j = 0; j < cave[i].length; j++)
			{
				if(cave[i][j] == 3)
				{
					count = count + 1;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args)
	{
			Scanner sc = new Scanner(System.in);
			
			
			int rows = sc.nextInt();
			int columns = sc.nextInt();
			
			cave = new int[rows][columns];
			
			// Assign values to the array.
				for(int i = 0; i < cave.length; i++)
				{
					for(int j = 0; j < cave[i].length; j++)
					{
						int no = sc.nextInt();
						cave[i][j] = no;
					
					}
				}
				
				// prints the array before processing.
				System.out.println("\nInput : \n");
				printArray();
			
			
			while(done)
			{
				changes = 0;
				
				for(int i = 0; i < cave.length; i++)
				{	
					// checks the array from left to right.
					for(int j = 0; j < cave[i].length; j++)
					{
						if(cave[i][j] == 0 && i == 0)
						{
							checkDown(i, j);
						}
						if(cave[i][j] == 3)
						{
							checkUp(i, j);
							checkDown(i, j);
							checkLeft(i, j);
							checkRight(i, j);
						}
						if(cave[i][j] == 0)
						{
							checkRight(i, j);
							checkLeft(i, j);
							
						}
						
					}
					
					// checks the array from left to right.
					for(int j = cave[i].length-1; j >= 0; j--)
					{
						if(cave[i][j] == 0 && i == 0)
						{
							checkDown(i, j);
						}
						if(cave[i][j] == 3)
						{
							checkUp(i, j);
							checkDown(i, j);
							checkLeft(i, j);
							checkRight(i, j);
						}
						if(cave[i][j] == 0)
						{
							checkRight(i, j);
							checkLeft(i, j);
						}
						
					}
					// checks whether all the changes have been made.
					if(changes == 0)
					{
						done = false;
					}
				}
			}
			
			
			
			
			
			// prints the array after processing.
			System.out.println("Output : \n");
			printArray();
			System.out.println("\nThe area of the cavern is: " + calculateArea());
			
	}
}