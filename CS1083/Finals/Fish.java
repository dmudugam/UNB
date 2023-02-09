public class Fish
{
	private String fish;
	private double weight;
	
	public Fish(String typeIn)
	{
		fish = typeIn;
	}
	
	public void addWeight(double weightToAdd) throws InvalidWeightException
	{
		if(weightToAdd < 0)
		{
			throw new InvalidWeightException("Invalid Weight");
		}
		else
		{
			weight = weightToAdd;
		}
	}
	public String getType()
	{
		return fish;
	}
	public double getWeight()
	{
		return weight;
	}
}