public class InsufficientFoodException extends Exception
{
	/**
	* Creates a new InvalidWeightException.
	*/
	public InsufficientFoodException()
	{
		
	}
	
	/**
	* Creates a new InvalidVehicleException.
	* @param message the error message.
	*/
	public InsufficientFoodException(String message)
	{
		super(message);
	}
}