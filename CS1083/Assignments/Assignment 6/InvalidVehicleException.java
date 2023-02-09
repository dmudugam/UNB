/**
	This class handles the InvalidVehicleException.
	@author Dineth Mithuranga and 3701155.
*/

public class InvalidVehicleException extends Exception
{
	/**
	* Creates a new InvalidVehicleException.
	*/
	public InvalidVehicleException()
	{
		
	}
	
	/**
	* Creates a new InvalidVehicleException.
	* @param message the error message.
	*/
	public InvalidVehicleException(String message)
	{
		super(message);
	}
}