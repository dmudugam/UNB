import java.util.Scanner;

public class Color
{
	public static char[][] colorR(char[][] array, int row, int col)
	{
		int r = 0, c = 0;
		if(array[row][col] != '0' && array[row][col] != '1')
		{
			
		}
		if(array[row][col] == '0')
		{
			if(array[row][col] != '0' && array[row][col] != '1')
			{
				r = row;
				c = col;
			}
			if(row + 1 < array.length)
			{
				colorR(array, row+1, col);
			}
			if(row - 1 >= 0)
			{
				colorR(array, row-1, col);
			}
			if(col + 1 < array[row].length)
			{
				colorR(array, row, col+1);
			}
			if(col - 1 >= 0)
			{
				colorR(array, row, col-1);
			}
			array[row][col] = array[r][c];
		}
		
		return array;
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int rows = s.nextInt();
		int columns = s.nextInt();
		char[][] array = new char[rows][columns];
		s.nextLine();
		for(int i = 0; i < array.length; i++)
		{
			
			String no = s.nextLine();
			//System.out.println(no);
			for(int j = 0; j < array[i].length; j++)
			{
				char c = no.charAt(j);
				array[i][j] = c;
			}
		}
		
		array = colorR(array, 0, 0);
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
}