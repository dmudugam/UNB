/**
 This class represents a Resident Senior  and manages unit numbers and fees per month.
 @author Dineth Mithuranga and 3701155
*/

public class ResidentSenior 
{

	/**
	Person Name
	*/

	private String name;

	/**
	Nursing Care Amount
	*/

	private double nursingCareAmount;

	/**
	Entertainment Amount;
	*/

	private double entertainmentAmount;

	/**
	Funding Support Amount
	*/

	private double fundingSupport;

	/**
	Building Name, Unit Number, Cost Per Month. Has-a relationship.
	*/

	private Residence home;

	/**
	This method constructs a ResidentSenior with the specified name, nursing care amount, entertainment amount, funding support and information in Residence class. 
	@param nameIn The name of the Person.
	@param nursingCareAmountIn nursing care amount
	@param entertainmentAmountIn Entertainment amount.
	@param fundingSupportIn Fund support amount.
	@param homeIn information in Residence class.
	*/

	public ResidentSenior (String nameIn, double nursingCareAmountIn, double entertainmentAmountIn, double fundingSupportIn, Residence homeIn)
	{
		name = nameIn;
		nursingCareAmount = nursingCareAmountIn;
		entertainmentAmount = entertainmentAmountIn;
		fundingSupport = fundingSupportIn;
		home = homeIn;
	}

	/**
	This method is called to set the name.
	@param updateName Set the name.
	*/
	
	public void setName (String updateName)
	{
		name = updateName;	
	}

	/**
	This method is called to set the Nursing Care Amount.
	@param updateNursingCareAmount Set the nursing care amount.
	*/

	public void setNursingCareAmount (double updateNursingCareAmount)
	{
		nursingCareAmount = updateNursingCareAmount;
	}

	/**
	This method is called to set the entertainment amount.
	@param updateEntertainmentAmount Set the entertainment amount.
	*/

	public void setEntertainmentAmount (double updateEntertainmentAmount)
	{
		entertainmentAmount = updateEntertainmentAmount;
	}

	/**
	This method is called to set the funding support amount.
	@param updateFundingSupport set the funding support amount.
	*/
	
	public void setFundingSupport (double updateFundingSupport)
	{
		fundingSupport = updateFundingSupport;
	}

	/**
	This method is called to update the building name, unit number and room cost in Residence class.
	@param updateHome updates the building name, unit number and room cost in residence class.
	*/

	public void setHome (Residence updateHome)
	{
		home = updateHome;
	}

	/**
	This method is called to calculate the total fees.
	@return Calculated Total Fees
	*/
	
	public double getTotalFeesOwing ()
	{
		double totalFees = nursingCareAmount + entertainmentAmount + home.getCostPerMonth() - fundingSupport;
		return totalFees;
	}


	/**
	This method is called to prepare the mail label.
	@return mail label
	*/

	public String getOnSiteMailLabel ()
	{
		return (name + "\n" + home.getBuildingName() + " Hall, unit " + home.getUnitNumber());
	}

} //end ResidentSenior
