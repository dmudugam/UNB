public class Bear
{
	private Fish food;
	
	public Bear()
	{
		
	}
	
	public void setFood(Fish foodIn) throws InsufficientFoodException
	{
		if(food.getWeight() < 25)
		{
			throw new InsufficientFoodException("Invalid Weight Food");
		}
		food = foodIn;
	}
}