public class B
{
	
	public static void changeUp (int[] numbers, int value)
	{
		int max = numbers[0];
		
		for(int i = 0; i < numbers.length; i++)
		{
			if(max < numbers[i])
			{
				max = numbers[i];
			}
		}
		for(int i = 0; i < numbers.length; i++)
		{
			if(max == numbers[i])
			{
				numbers[i] = value;
			}
		}
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
		
	}
	static public void main(String[] args)
	{
		int[] myArray = {4, 9, 10, 3, 1, 10, -5};
		changeUp(myArray, -20);
	}
}