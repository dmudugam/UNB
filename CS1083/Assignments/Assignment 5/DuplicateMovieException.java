/**
	This class handles the DuplicateMovieException.
	@author Dineth Mithuranga and 3701155.
*/

public class DuplicateMovieException extends Exception
{
	/**
	* Creates a new DuplicateMovieException.
	*/
	public DuplicateMovieException()
	{
		
	}
	
	/**
	* Creates a new DuplicateMovieException.
	* @param message the error message.
	*/
	public DuplicateMovieException(String message)
	{
		super(message);
	}
}