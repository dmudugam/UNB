public static int setSearchInt(int[][] searchGrid) throws SetNotFoundException
{
	int counter = 1;
	int mainCounter1 = 0;
	int mainCounter2 = 0;

		for(int i = 0; i < searchGrid.length; i++)
		{
			for(int j = 0; j < searchGrid[i].length; j++)
			{
				int k = searchGrid[i][j];
				if((j+1) < searchGrid[i].length && k == searchGrid[i][j+1])
				{
					counter++;
					
				}
				if(counter == 3)
				{
					mainCounter1 = counter;
					return counter;
				}
			}
		
			counter = 1;
		}
		counter = 1;
		for(int i = 0; i < searchGrid[0].length; i++)
		{
			for(int j = 0; j < searchGrid.length; j++)
			{
				int k = searchGrid[j][i];
				if((j+1) < searchGrid.length && k == searchGrid[j+1][i])
				{
					counter++;
				}
				if(counter == 3)
				{
					mainCounter2 = counter;
					return counter;
				}
			}
			
			counter = 1;
			
		}
		
		if(mainCounter1 != 3 || mainCounter2 != 3)
		{
			throw new InvalidDocumentException("No triple found");
		}
}