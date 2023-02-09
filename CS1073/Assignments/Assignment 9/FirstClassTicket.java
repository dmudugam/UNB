/**
 This class represents a FirstClassTicket.
 @author Dineth Mithuranga and 3701155.
*/

public class FirstClassTicket extends Ticket
{

	/**
	This method constructs a Ticket with the specified name, bags and, drinks. 
	@param nameIn The name of the passenger.
	@param noofbagsIn The number of checked bags.
	@param drinksIn The number of inflight drinks.
	*/

	public FirstClassTicket (String nameIn, int noofbagsIn, int drinksIn)
	{
		super(nameIn, noofbagsIn, drinksIn);
	}



	/**
	This method is called to calculate the total ticket cost.
	@return baseCost.
	*/

	public double calculateTotal ()
	{
		double baseCost = 2175;

		if(super.getDrinks() > 2)
		{
			baseCost = baseCost + ((super.getDrinks() - 2) * 2.50);
		}
		else if(super.getDrinks() < 2)
		{
			baseCost = 2175;
		}
		return baseCost + (super.getNoofbags() * 30);
	}

	/**
	This method is called to return the boarding number.
	@return boardingNum.
	*/

	public int getBoardingNumber()
	{
		int boardingNum = 1;
		return boardingNum;
	}
}