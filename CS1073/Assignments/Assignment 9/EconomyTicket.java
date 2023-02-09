/**
 This class represents a EconomyTicket.
 @author Dineth Mithuranga and 3701155.
*/

public class EconomyTicket extends Ticket
{

	/**
	This method constructs a Ticket with the specified name, bags and, drinks. 
	@param nameIn The name of the passenger.
	@param noofbagsIn The number of checked bags.
	@param drinksIn The number of inflight drinks.
	*/

	public EconomyTicket (String nameIn, int noofbagsIn, int drinksIn)
	{
		super(nameIn, noofbagsIn, drinksIn);
	}


	/**
	This method is called to calculate the total ticket cost.
	@return baseCost.
	*/

	public double calculateTotal ()
	{
		double baseCost = 1350;

		if(super.getNoofbags() > 1)
		{
			baseCost = baseCost + 50 + ((super.getNoofbags() - 1) * 35);
		}
		else if(super.getNoofbags() == 1)
		{
			baseCost = baseCost + 50;
		}
		
		return baseCost + (super.getDrinks() * 2.50);
	}


	/**
	This method is called to return the boarding number.
	@return boardingNum.
	*/

	public int getBoardingNumber()
	{
		int boardingNum = 2 + (int) (Math.random() * 3);

		return boardingNum;
	}
}