/**
 This class represents a Ticket.
 @author Dineth Mithuranga and 3701155.
*/

public class Ticket
{
	/**
	Name
	*/

	private String name;

	/**
	Number of Bags
	*/

	private int noofbags;

	/**
	Number of Drinks
	*/

	private int drinks;

	/**
	This method constructs a Ticket with the specified name, bags and, drinks. 
	@param nameIn The name of the passenger.
	@param noofbagsIn The number of checked bags.
	@param drinksIn The number of inflight drinks.
	*/

	public Ticket (String nameIn, int noofbagsIn, int drinksIn)
	{
		name = nameIn;
		noofbags = noofbagsIn;
		drinks = drinksIn;
	}

	/**
	This method is called to get the name of the passenger.
	@return name.
	*/

	public String getName ()
	{
		return name;
	}

	/**
	This method is called to get the number of bags.
	@return noofbags.
	*/

	public int getNoofbags ()
	{
		return noofbags;
	}

	/**
	This method is called to get the number of Drinks.
	@return drinks.
	*/

	public int getDrinks ()
	{
		return drinks;
	}
}