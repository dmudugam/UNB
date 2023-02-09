import java.text.NumberFormat; 

/** 
  This is the driver program for Restaurant Class, Server Class and Chef Class; its purpose is 
  to "try out" the RestaurantWorker, Server and Chef class.
  @author Dineth Mithuranga and 3701155
*/


public class Payroll
{
	public static void main (String[] args) 
	{

		NumberFormat formatter = NumberFormat.getCurrencyInstance();

		RestaurantWorker Jeffrey = new RestaurantWorker ("Jeffrey Kingston", "Busser", 11.75);
		RestaurantWorker Susan = new RestaurantWorker ("Susan Grant-Long", "Busser", 11.95);
		RestaurantWorker Leroy = new RestaurantWorker ("Leroy Haines", "Dishwasher", 12.50);

		Server Jonathan = new Server ("Jonathan Gorman", "Server", 12.50, 0.12);
		Server Tanya = new Server ("Tanya Masterson", "Server", 11.75, 0.10);
		Server Brittany = new Server ("Brittany Phillips", "Server", 13.50, 0.15);

		Chef Kathy = new Chef ("Kathy Cox", "Executive Chef", 24.50, 72.50);
		Chef Thomas = new Chef ("Thomas McLean", "Sous Chef", 19.50, 35.00);
		Chef Nathaniel = new Chef ("Nathaniel Paul", "Sous Chef", 20.75, 35.00);
		Chef Eleanor = new Chef ("Eleanor Ryan", "Pastry Chef", 18.00, 27.00);



		System.out.println("Worker's Name & Job Title \t Rate of Pay \t Pay this week");
		System.out.println("========================= \t =========== \t =============");

		System.out.println(Jeffrey.getName() + " (" + Jeffrey.getJobTitle() + ") \t " + formatter.format(Jeffrey.getHourlyRate()) + " /hr \t " + "" + formatter.format(Jeffrey.computePay(18)));
		System.out.println(Susan.getName() + " (" + Susan.getJobTitle() + ") \t " + formatter.format(Susan.getHourlyRate()) + " /hr \t " + "" + formatter.format(Susan.computePay(14.5)));
		System.out.println(Leroy.getName() + " (" + Leroy.getJobTitle() + ") \t " + formatter.format(Leroy.getHourlyRate()) + " /hr \t " + "" + formatter.format(Leroy.computePay(42)));
		System.out.println(Jonathan.getName() + " (" + Jonathan.getJobTitle() + ") \t " + formatter.format(Jonathan.getHourlyRate()) + " /hr \t " + "" + formatter.format(Jonathan.computePay(46.5)));
		System.out.println(Tanya.getName() + " (" + Tanya.getJobTitle() + ") \t " + formatter.format(Tanya.getHourlyRate()) + " /hr \t " + "" + formatter.format(Tanya.computePay(18)));
		System.out.println(Brittany.getName() + " (" + Brittany.getJobTitle() + ") \t " + formatter.format(Brittany.getHourlyRate()) + " /hr \t " + "" + formatter.format(Brittany.computePay(38.5)));
		System.out.println(Kathy.getName() + " (" + Kathy.getJobTitle() + ") \t " + formatter.format(Kathy.getHourlyRate()) + " /hr \t " + "" + formatter.format(Kathy.computePay(46.5)));
		System.out.println(Thomas.getName() + " (" + Thomas.getJobTitle() + ") \t " + formatter.format(Thomas.getHourlyRate()) + " /hr \t " + "" + formatter.format(Thomas.computePay(18)));
		System.out.println(Nathaniel.getName() + " (" + Nathaniel.getJobTitle() + ") \t " + formatter.format(Nathaniel.getHourlyRate()) + " /hr \t " + "" + formatter.format(Nathaniel.computePay(26)));
		System.out.println(Eleanor.getName() + " (" + Eleanor.getJobTitle() + ") \t " + formatter.format(Eleanor.getHourlyRate()) + " /hr \t " + "" + formatter.format(Eleanor.computePay(42)));	
	}
} // end Payroll