import java.text.NumberFormat; 

/**
	This class represents Van.
	@author Dineth Mithuranga and 3701155.
*/

public class Van extends Vehicle
{	
	NumberFormat formatter = NumberFormat.getCurrencyInstance();

	/**
	type of doors
	*/
	
	private boolean eDoor;
	
	/**
	price of the van
	*/
	
	private double price;
	
	/**
	This method constructs a van. 
	@param codeIn.
	@param mileageIn.
	@param eDoorIn.
	*/
	
	public Van (String codeIn, int mileageIn, boolean eDoorIn)
	{
		super(codeIn, mileageIn);
		eDoor = eDoorIn;
		price = calculatePrice();	
	}
	
	/**
	This method is called to calculate the price.
	@return price of the van.
	*/
	
	public double calculatePrice()
	{
		price = 25000;
		if(eDoor)
		{
			price = price + (price * 0.15);
		}	
		
		return price;
	}
	
	/**
	This method is called to print out the van details.
	@return details of the van.
	*/
	
	public String toString ()
	{
		return super.toString() + "\t" + formatter.format(getPrice()) + "\n"; 
	}
	
	/**
	This method is called to retrieve the price.
	@return price.
	*/
	
	public double getPrice()
	{
		return price;
	}
}