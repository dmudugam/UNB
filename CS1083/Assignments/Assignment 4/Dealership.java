import java.util.Scanner;
import java.text.NumberFormat; 

/**
	This class represents Dealership.
	@author Dineth Mithuranga and 3701155.
*/

public class Dealership
{
	NumberFormat formatter = NumberFormat.getCurrencyInstance();
	
	private String name;
	
	private Vehicle[] list;
	
	/**
	This method constructs a Dealership. 
	@param nameIn.
	@param listIn.
	*/
	
	public Dealership (String nameIn, Vehicle[] listIn)
	{
		name = nameIn;
		list = listIn;
	}
	
	/**
	This method is called to retrieve the name.
	@return name.
	*/
	
	public String getName()
	{
		return name;
	}
	
	/**
	This method is called to retrieve the vehicle list.
	@return vehicle list.
	*/
	
	public Vehicle[] getInventory()
	{
		Vehicle [] list1 = list.clone();
		return list1;
	}
	
	/**
	This method is called to print out the dealership details.
	@return details of the dealership.
	*/
	
	public String toString()
	{	
		String all = "";
		String inv = "";
		for(int i = 0; i < list.length; i++)
		{
			inv = inv + "\n" + list[i].getCode() + "\tMileage: " + list[i].getMileage() + "km\n\tCost: " + formatter.format(list[i].getPrice());
		}
		
		all = name + "\n" + inv;
		return all;
	}
	
	/**
	This method is called to check for vehicles.
	@return status.
	*/
	
	public boolean search(String vehicleCode)
	{
		boolean status = false;
		for(int i = 0; i < list.length; i++)
		{
			if(list[i].getCode().equals(vehicleCode))
			{
				status = true;
				
			}				
		}
		return status;
	}
}