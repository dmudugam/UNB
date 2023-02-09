/**
	This class handles the DuplicateGenreExceptionException.
	@author Dineth Mithuranga and 3701155.
*/

public class DuplicateGenreException extends Exception
{
	/**
	* Creates a new DuplicateGenreExceptionException.
	*/
	public DuplicateGenreException()
	{
		
	}
	
	/**
	* Creates a new DuplicateGenreExceptionException.
	* @param message the error message.
	*/
	public DuplicateGenreException(String message)
	{
		super(message);
	}
}