/**
 This class represents a Server.
 @author Dineth Mithuranga and 3701155.
*/

public class Server extends RestaurantWorker
{

	/**
	footware Allowance
	*/

	private double footwareAllowance;

	/**
	This method constructs a Server with the specified name, job title, hourly rate, footware allowance. 
	@param nameIn The name of the worker.
	@param jobTitleIn The job title of the worker.
	@param hourlyRateIn The hourly rate of the worker.
	@param footwareAllowanceIn.
	*/

	public Server (String nameIn, String jobTitleIn, double hourlyRateIn, double footwareAllowanceIn)
	{

	super(nameIn, jobTitleIn, hourlyRateIn);

	footwareAllowance = footwareAllowanceIn;

	}

	/**
	This method is called to get the amount of hours and calculate Pay for worker.
	@param hours get the hours.
	@return computed payment.
	*/

	public double computePay (double hours)
	{
		return ((hours - (hours % 1)) * footwareAllowance) + (super.computePay(hours));
	}
} 