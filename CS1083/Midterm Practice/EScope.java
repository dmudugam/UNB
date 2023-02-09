public class EScope
{
	public void level1()
	{
		System.out.println("Level 1 start.");
		level2();
		System.out.println("Level 1 end.");
		
		
	}
	
	public void level2()
	{
		System.out.println("Level 2 start.");
		
		try
		{
			
			level3();
			
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Level 2 end.");
		}
		System.out.println("Dineth");
	}
	
	public void level3()
	{
		
		System.out.println("Level 3 start.");
		int numerator = 10, denominator = 0;
		int result = numerator / denominator;
		System.out.println("Level 3 end.");
	}
}