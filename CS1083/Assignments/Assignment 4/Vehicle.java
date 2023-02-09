/**
	This class represents Vehicle.
	@author Dineth Mithuranga and 3701155.
*/

abstract public class Vehicle implements Comparable<Vehicle>
{
	
	/**
	Code of the vehicle
	*/
	
	private  String code;
	
	/**
	Mileage of the vehicle
	*/
	
	private int mileage;
	
	/**
	This method constructs a vehicle. 
	@param codeIn.
	@param mileageIn.
	*/
	
	public Vehicle (String codeIn, int mileageIn)
	{
		code = codeIn;
		mileage = mileageIn;
	}
	
	/**
	This method is called to retrieve the code.
	@return code.
	*/
	
	public String getCode()
	{
		return code;
	}
	
	/**
	This method is called to retrieve the mileage.
	@return mileage.
	*/
	
	public int getMileage()
	{
		return mileage;
	}
	
	/**
	This method is called to calculate the price.
	@return price of the vehicle.
	*/
	
	public abstract double calculatePrice();

	/**
	This method is called to retrieve the price.
	@return price.
	*/
	
	public abstract double getPrice();
	
	/**
	This method is called to compare two vehicles.
	@return details of the truck.
	@param other.
	*/
	
	public int compareTo (Vehicle other)
	{
		double value; double check;
		if(this.code.charAt(0) != (other.code.charAt(0)))
		{
			return this.code.compareTo(other.code);
		}
		else
		{
			value = this.getPrice() - other.getPrice();
			check = value;
			
			if(check == 0)
			{
				return 0;
			}
			if(check < 0)
			{
				return -1;
			}
			else
			{
				return 1;
			}
		}
	}
	
	/**
	This method is called to test drive the vehicle.
	@param distance.
	*/
	
	public void testDrive (int distance)
	{
		mileage = mileage + distance;
	}
	
	/**
	This method is called to print out the vehicle details.
	@return details of the vehicle.
	*/
	
	public String toString ()
	{
		return code;
	}
}