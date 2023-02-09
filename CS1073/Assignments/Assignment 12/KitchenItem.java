/**
 This class represents a KitchenItem.
 @author Dineth Mithuranga and 3701155.
*/

public class KitchenItem

{

	/**
	Description
	*/

	private String description;
	
	/**
	Original Price
	*/

	private double originalPrice;

	/**
	Restriction Status
	*/

	private boolean restricted;

	/**
	This method constructs a KitchenItem with the specified description, original price, restriction status. 
	@param descriptionIn The description of the kitchen item.
	@param originalPriceIn The original price of the kitchen item.
	@param restrictedIn status of restriction.
	*/

	public KitchenItem (String descriptionIn, double originalPriceIn, boolean restrictedIn)
	{
		description = descriptionIn;
		originalPrice = originalPriceIn;
		restricted = restrictedIn;
	}

	/**
	This method is called to get the description of the kitchen item.
	@return description.
	*/

	public String getDescription()
	{
		return description;
	}
	
	/**
	This method is called to get the original price..
	@return original price.
	*/

	public double getPrice()
	{
		return originalPrice;
	}

	/**
	This method is called to get restriction status.
	@return status of restriction.
	*/

	public boolean isRestricted()
	{
		return restricted;
	}
}
