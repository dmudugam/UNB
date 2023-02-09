/**
 This class represents a RestaurantWorker.
 @author Dineth Mithuranga and 3701155.
*/

public class RestaurantWorker

{

	/**
	name
	*/

	private String name;

	/**
	Job Title
	*/

	private String jobTitle;

	/**
	hourly Rate
	*/

	private double hourlyRate;

	/**
	This method constructs a RestaurantWorker with the specified name, job title and hourly rate. 
	@param nameIn The name of the worker.
	@param jobTitleIn The job title of the worker.
	@param hourlyRateIn The hourly rate of the worker.
	*/

	public RestaurantWorker (String nameIn, String jobTitleIn, double hourlyRateIn)
	{
		name = nameIn;
		jobTitle = jobTitleIn;
		hourlyRate = hourlyRateIn;
	}

	/**
	This method retrieves the name of the worker.
	@return The name of the worker.
	*/

	public String getName ()
	{
		return name;
	}

	/**
	This method retrieves the job title of the worker.
	@return The job title of the worker.
	*/

	public String getJobTitle ()
	{
		return jobTitle;
	}

	/**
	This method retrieves the hourly rate of the worker.
	@return The hourly rate of the worker.
	*/

	public double getHourlyRate ()
	{
		return hourlyRate;
	}

	/**
	This method is called to get the amount of hours and calculate Pay for worker.
	@param hours get the hours.
	@return computed payment.
	*/

	public double computePay (double hours)
	{
		return hourlyRate * hours;
	}
}

