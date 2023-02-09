public class Sum
{
	public static int sumUpper(int[][] mat)
	{
		int sum = 0;
		
		for(int i = 0; i < mat.length; i++)
		{
			for(int j = 0; j < mat[i].length; j++)
			{
				if(i < j)
				{
					sum = sum + mat[i][j];
				}
			}
		}
		
		return sum;
	}
}