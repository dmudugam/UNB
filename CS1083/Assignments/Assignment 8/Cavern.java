/**
	This class represent a Cavern.
	@author Dineth Mithuranga and 3701155
*/

public class Cavern
{

	/**
	The area of the cavern.
	*/
	
	private static int counter;
	
	/**
	This method calculates the area. 
	@param array
	@param row
	@param col
	@return area
	*/
	
	public static int Close(int[][] array, int row, int col)
	{
		if(array[row][col] == 0)
		{
			array[row][col] = 3;
			counter++;
			if(row + 1 < array.length)
			{
				Close(array, row+1, col);
			}
			if(row - 1 >= 0)
			{
				Close(array, row-1, col);
			}
			if(col + 1 < array[row].length)
			{
				Close(array, row, col+1);
			}
			if(col - 1 >= 0)
			{
				Close(array, row, col-1);
			}
		}
		return counter;
	}
}