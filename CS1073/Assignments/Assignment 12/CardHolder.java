/**
 This class represents a CardHolder.
 @author Dineth Mithuranga and 3701155.
*/

public class CardHolder

{
	/**
	fullname
	*/

	private String fullName;

	/**
	apartment number
	*/

	private int aptNumber;

	/**
	phone number
	*/

	private String pNumber;

	/**
	membership starting number number
	*/

	private static int memNumber = 10000;

	/**
	membership number
	*/

	private int membershipNumber;

	/**
	signout items
	*/

	private KitchenItem[] sign;

	/**
	count of signout items
	*/

	private int count = 0;

	
	/**
	This method constructs a CardHolder. 
	@param fullNameIn The name of the CardHolder.
	@param aptNumberIn The Apartment Number of the CardHolder.
	@param pNumberIn The phone number of the CardHolder.
	*/

	public CardHolder (String fullNameIn, int aptNumberIn, String pNumberIn)
	{
		fullName = fullNameIn;
		aptNumber = aptNumberIn;
		pNumber = pNumberIn;
		membershipNumber = memNumber;
		memNumber++;
		sign = new KitchenItem[8];
	}

	/**
	This method retrieves the name of the CardHolder.
	@return The name.
	*/

	public String getName ()
	{
		return fullName;
	}

	/**
	This method retrieves the apartment number.
	@return The apartmentNumber.
	*/

	public int getAptNumber ()
	{
		return aptNumber;
	}

	/**
	This method retrieves the phone number.
	@return The phone number.
	*/

	public String getPhoneNumber ()
	{
		return pNumber;
	}

	/**
	This method retrieves membership number.
	@return The membership number.
	*/

	public int getMembershipNumber ()
	{
		return membershipNumber;
	}
	
	public void setPhoneNumber(String updatePhone)
	{
		pNumber = updatePhone;
	}

	/**
	This method retrieves whether signout transaction was successful.
	@return The status of the transaction.
	@param item kitchenitem
	*/

	public boolean signOut (KitchenItem item)
	{	
			if(count == 8)
			{
				return false;
			}
			boolean status = true;

			for(int i = 0; i < count; i++)
			{
				if(sign[i].getDescription().equals(item.getDescription()) && sign[i].getPrice() == item.getPrice() && Boolean.compare(sign[i].isRestricted(), item.isRestricted())==0)
				{		
					status = false;
				}
				
			}
			if(status)
			{
				sign[count] = item;
				count++;
			
			}	

		return status;
	}

	/**
	This method retrieves whether return transaction was successful.
	@return The status of the transaction.
	@param item kitchenitem
	*/

	public boolean returnItem (KitchenItem item)
	{
		boolean status = false;
		
		for(int i = 0; i < count; i++)
		{
			if(sign[i].getDescription().equals(item.getDescription()) && sign[i].getPrice() == item.getPrice() && Boolean.compare(sign[i].isRestricted(), item.isRestricted())==0)
			{
				sign[i] = sign[count-1];
				status = true;
				count--;
			}
			
		}


		return status;
	}

	/**
	This method retrieves signedout items.
	@return list of the signout items.
	*/

	public KitchenItem[] getSignedOutItems()
	{
		KitchenItem[] item1 = new KitchenItem[count];

		for(int j = 0; j < count; j++)
		{
			item1[j] = sign[j];
		}
		return item1;
	} 
} // end CardHolder
