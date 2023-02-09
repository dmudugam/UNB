import java.util.Scanner;

public class A
{
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int rows = s.nextInt();
		int columns = s.nextInt();
		int[][] array = new int[rows][columns];
		
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				int no = s.nextInt();
				array[i][j] = no;
			}
		}
		
		System.out.println(Sum.sumUpper(array));
	}
}