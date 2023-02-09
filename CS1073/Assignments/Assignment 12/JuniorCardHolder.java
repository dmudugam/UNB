/**
 This class represents a JuniorCardHolder.
 @author Dineth Mithuranga and 3701155.
*/

public class JuniorCardHolder extends CardHolder

{
	/**
	Name of the guardian
	*/

	private String guardian;
	
	/**
	This method constructs a JuniorCardHolder with the specified name, apartment number, Phone Number, Guardian Name. 
	@param fullNameIn The name of the CardHolder.
	@param aptNumberIn The apartment number.
	@param pNumberIn The Phone Number.
	@param guardianIn The name of the guardian.
	*/

	public JuniorCardHolder (String fullNameIn, int aptNumberIn, String pNumberIn, String guardianIn)
	{
		super(fullNameIn, aptNumberIn, pNumberIn);

		guardian = guardianIn;
	}

	/**
	This method is called to get the guardian name.
	@return guardian name.
	*/

	public String getGuardian()
	{
		return guardian;
	}

	/**
	This method is called to get check the restriction.
	@param item signing out item.
	@return status of ther restriction.
	*/

	public boolean signOut(KitchenItem item)
	{
		if(item.isRestricted())
		{
			return false;
		}
		else
		{
			return super.signOut(item);
		}
	}
	
}
