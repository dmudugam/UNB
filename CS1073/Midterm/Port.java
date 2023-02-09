public class Port 
{
	private String location;

	private double maxCargo;

	private double envior;

	public Port (String locationIn, double maxCargoIn, double enviorIn)
	{
		location = locationIn;
		maxCargo = maxCargoIn;
		envior = enviorIn;
	}

	public String getLocation()
	{
		return location;
	}
	public double getMaxCargo()
	{
		return maxCargo;
	}
	public double getEnvior()
	{
		return envior;
	}

	public void setLocation(String newLocation)
	{
		location = newLocation;
	}
	public void setMaxCargo(double newCargo)
	{
		maxCargo = newCargo;
	}
	public void setEnvior(double newEnvior)
	{
		envior = newEnvior;
	}
	
	public double getPortTax(double cargoWeight)
	{
		double tax = 0;

		if(cargoWeight > maxCargo)
		{
			double newWeight = maxCargo - cargoWeight;
			tax = newWeight * 10;
		}
		return tax;
	}
}