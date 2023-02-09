import java.text.NumberFormat; 

/**
	This class represents Truck.
	@author Dineth Mithuranga and 3701155.
*/

public class Truck extends Vehicle
{

	NumberFormat formatter = NumberFormat.getCurrencyInstance();
	
	/**
	Size of the bed
	*/
	
	private String bedSize;
	
	/**
	price of the truck
	*/
	
	private double price;
	
	/**
	This method constructs a Truck. 
	@param codeIn.
	@param mileageIn.
	@param bedSizeIn.
	*/
	
	public Truck (String codeIn, int mileageIn, String bedSizeIn)
	{
		super(codeIn, mileageIn);
		bedSize = bedSizeIn;
		price = calculatePrice();
	}
	
	/**
	This method is called to calculate the price.
	@return price of the truck.
	*/
	
	public double calculatePrice()
	{
		price = 50000;
		if(bedSize.equals("short"))
		{
			price = price - (price * 0.1);
		}
		else if(bedSize.equals("long"))
		{
			price = price + (price * 0.1);
		}
		
		return price;
	}
	
	/**
	This method is called to print out the truck details.
	@return details of the truck.
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