/**
 This class represents a Residence  and manages cost of residence.
 @author Dineth Mithuranga and 3701155
*/

public class Residence 
{
	/**
	Building Name
	*/

	private String buildingName;

	/**
	Unit Number
	*/

	private int unitNumber;

	/**
	Cost per month
	*/

	private double costPerMonth;

	/**
	This method constructs a Residence with the specified Building name and Unit number and Cost Per Month. 
	@param buildingNameIn The name of the building.
	@param unitNumberIn Unit Number
	@param costPerMonthIn Cost per month for the residence.
	*/


	public Residence (String buildingNameIn, int unitNumberIn, double costPerMonthIn)
	{
		buildingName = buildingNameIn;
		unitNumber = unitNumberIn;
		costPerMonth = costPerMonthIn;
	}

	/**
	This method retrieves the building name of the residence.
	@return The name of the building.
	*/
	
	public String getBuildingName ()
	{
		return buildingName;
	}

	/**
	This method retrieves the Unit Number of the Building.
	@return The unit number of the building.
	*/

	public int getUnitNumber ()
	{
		return unitNumber;
	}

	/**
	This method retrieves the cost per month for the residence.
	@return The cost per month.
	*/

	public double getCostPerMonth ()
	{
		return costPerMonth;
	}

} //end Residence
