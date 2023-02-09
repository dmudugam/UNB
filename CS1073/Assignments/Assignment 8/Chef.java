/**
 This class represents a Chef.
 @author Dineth Mithuranga and 3701155.
*/

public class Chef extends RestaurantWorker
{
	/**
	Union fees
	*/

	private double unionFees;

	/**
	This method constructs a Chef with the specified name, job title, hourly rate, union fees. 
	@param nameIn The name of the worker.
	@param jobTitleIn The job title of the worker.
	@param hourlyRateIn The hourly rate of the worker.
	@param unionFeesIn.
	*/


	public Chef (String nameIn, String jobTitleIn, double hourlyRateIn, double unionFeesIn)
	{
		super(nameIn, jobTitleIn, hourlyRateIn);

		unionFees = unionFeesIn;
	}


	/**
	This method is called to get the amount of hours and calculate Pay for worker.
	@param hours get the hours.
	@return computed payment.
	*/

	public double computePay (double hours)
	{
		double chefPay = 0;

		if(hours >= 40)
		{
			chefPay = ((super.computePay(40)) + ((hours - 40) * (super.getHourlyRate() * 1.5)) - unionFees);  
		}
		else if(hours < 40)
		{
			chefPay = (super.computePay(hours) - unionFees);
		}
		
		return chefPay;
	}
}