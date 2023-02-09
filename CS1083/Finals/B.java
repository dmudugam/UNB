public class B
{
	public static int sumConnected(int[][] map, int row, int col)
	{
		if(map[row][col] != 0)
		{
			array[row][col] = 0;
			if(row + 1 < map.length)
			{
				return map[row+1][col] + sumConnected(map, row+1, col);
			}
			if(row - 1 >= 0)
			{
				return map[row-1][col] + sumConnected(map, row-1, col);
			}
			if(col + 1 < map[row].length)
			{
				return map[row][col+1] + sumConnected(map, row, col+1);
			}
			if(col - 1 >= 0)
			{
				return map[row][col-1] + sumConnected(map, row, col-1);
			}
		}
		return 0;
	}
}