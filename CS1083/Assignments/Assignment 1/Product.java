/**
	This classs represent a Product
	@author Dineth Mithuranga and 3701155
*/

public class Product
{
	/**
	Product name
	*/

	private String pname;

	/**
	Unique ID starting point
	*/

	private static int starting_uid = 10001;

	/**
	Unique ID
	*/

	private int uid;

	/**
	Available Qauntity
	*/

	private int available_quantity;

	/**
	Ordered Qauntity
	*/

	private int ordered_qauntity;

	/**
	Price
	*/

	private double price;

	/**
	This method constructs a Product with the specified name, price and, qauntity. 
	@param pnameIn The name of the product.
	@param priceIn The price of the product.
	@param available_qauntityIn The available qauntity of the product.
	*/

	public Product (String pnameIn, double priceIn, int available_qauntityIn)
	{
		pname = pnameIn;
		available_quantity = available_qauntityIn;
		price = priceIn;
		uid = starting_uid;
		starting_uid++;		
	}

	/**
	This method is called to retrieve the unique productID.
	@return uid.
	*/

	public int getUid()
	{
		return uid;
	}

	/**
	This method is called to retrieve the Product name.
	@return pname.
	*/

	public String getPname()
	{
		return pname;
	}

	/**
	This method is called to retrieve the Available qauntity.
	@return available_quantity.
	*/

	public int getAvailable_qauntity()
	{
		return available_quantity;
	}

	/**
	This method is called to retrieve the ordered qauntity.
	@return ordered_qauntity.
	*/

	public int getOrdered_qauntity()
	{
		return ordered_qauntity;
	}

	/**
	This method is called to set the ordered qauntity.
	@param setQauntity.
	*/

	public void setOrdered_qauntity(int setQauntity)
	{
		ordered_qauntity = setQauntity;
	}

	/**
	This method is called to set the price.
	@param updatePrice.
	*/

	public void setPrice(double updatePrice)
	{
		price = updatePrice;
	}

	/**
	This method is called to retrieve the price.
	@return price.
	*/

	public double getPrice()
	{
		return price;
	}

	/**
	This method is called to set update available qauntity and and set ordered qauntity zero.
	@param ordAmount.
	*/

	public void orderReceived(int ordAmount)
	{
		available_quantity = available_quantity + ordAmount;
		ordered_qauntity = 0;
	}

	/**
	This method is called to retrieve the total value of the product.
	@return total.
	*/

	public double getTotalValue()
	{
		double total = available_quantity * price;
		return total;
	}

	/**
	This method is called to retrieve to confirm whether the product has been sold.
	@return sold.
	*/

	public boolean sellProduct()
	{
		boolean sold = false;

		if(available_quantity >= 1)
		{
			sold = true;
			available_quantity = available_quantity - 1;
		}
		else
		{
			sold = false;
		}

		return sold;
	}
}