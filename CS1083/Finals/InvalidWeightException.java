public class InvalidWeightException extends Exception
{
	/**
	* Creates a new InvalidWeightException.
	*/
	public InvalidWeightException()
	{
		
	}
	
	/**
	* Creates a new InvalidVehicleException.
	* @param message the error message.
	*/
	public InvalidWeightException(String message)
	{
		super(message);
	}
}