import java.text.NumberFormat; 

/**
	This class represents Car.
	@author Dineth Mithuranga and 3701155.
*/


public class Car extends Vehicle
{
	NumberFormat formatter = NumberFormat.getCurrencyInstance();
	
	/**
	Number of doors
	*/
	
	private int noOfDoors;
	
	/**
	Price of the Car
	*/
	
	private double price;
	
	/**
	Type of the car
	*/
	
	private char type;
	
	/**
	This method constructs a Car. 
	@param codeIn.
	@param mileageIn.
	@param bedSizeIn.
	@param noOfDoorsIn.
	@param typeIn.
	*/
	
	public Car (String codeIn, int mileageIn, int noOfDoorsIn, char typeIn)
	{
		super(codeIn, mileageIn);
		noOfDoors = noOfDoorsIn;
		type = typeIn;
		price = calculatePrice();
	}
	
	/**
	This method is called to calculate the price.
	@return price of the car.
	*/
	
	public double calculatePrice()
	{
		price = 10000;
		if(noOfDoors == 4)
		{
			price = price + (price * 0.05);
		}
		if(type == 'H')
		{
			price = price + 1000;
		}
		
		return price;
	}
	
	/**
	This method is called to print out the car details.
	@return details of the car.
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