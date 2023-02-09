import java.util.Scanner;

public class A
{
	private static int[][] num;
	private static int counter1 = 0;
	private static int counter2 = 0;
	static public void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		num = new int[rows][columns];
		
		for(int i = 0; i < num.length; i++)
		{
			for(int j = 0; j < num[i].length; j++)
			{
				int no = sc.nextInt();
				num[i][j] = no;
			}
		}
		int counter = 1;
		for(int i = 0; i < num.length; i++)
		{
			for(int j = 0; j < num[i].length; j++)
			{
				int k = num[i][j];
				if((j+1) < num[i].length && (k+1) == num[i][j+1])
				{
					counter++;
					
				}
				if(counter > counter1)
				{
					counter1 = counter;
				}
			}
		
			counter = 1;
		}
		counter = 1;
		for(int i = 0; i < num[0].length; i++)
		{
			for(int j = 0; j < num.length; j++)
			{
				int k = num[j][i];
				if((j+1) < num.length && (k+1) == num[j+1][i])
				{
					counter++;
				}
				if(counter > counter2)
				{
					counter2 = counter;
				}
			}
			
			counter = 1;
			
		}
		
		if(counter1 >= counter2)
		{
			System.out.println(counter1);
		}
		else if(counter1 < counter2)
		{
			System.out.println(counter2);
		}			
	}
}