import java.util.Scanner;

/**
	This class is to try out the Dealership, Vehicle, Car, Van, and Truck classes.
	@author Dineth Mithuranga and 3701155.
*/

public class Driver
{
	private static Vehicle[] list;
	public static void main(String[] args)
	{
		Scanner scin = new Scanner(System.in);
		String name = scin.nextLine();
		int count = scin.nextInt();
		scin.nextLine();
		list = new Vehicle[count];
		for(int i = 0; i < count; i++)
		{
			String s = scin.nextLine();
			Scanner scline = new Scanner(s);
			String code = scline.next();
			
			if(code.charAt(0) == 'V')
			{
				int milesVan = scline.nextInt();
				boolean door = scline.nextBoolean();
				list[i] = new Van(code, milesVan, door);
			}
			else if(code.charAt(0) == 'T')
			{
				int milesTruck = scline.nextInt();
				String type = scline.next();
				list[i] = new Truck(code, milesTruck, type);
			}
			else if(code.charAt(0) == 'C')
			{
				int milesCar = scline.nextInt();
				int doors = scline.nextInt();
				char carType = scline.next().charAt(0);
				list[i] = new Car(code, milesCar, doors, carType);
			}
			
		}	
		Dealership dealer = new Dealership(name, list);
	
			System.out.println(dealer.toString());
	
		
		list = dealer.getInventory();
		Sorter<Vehicle> sort = new Sorter<Vehicle>();
		sort.selectionSort(list);

		System.out.println("\nSorted data:\n");
		System.out.println(dealer.getName());
		for(Vehicle temp : list)
		{
			System.out.println(temp);
		}
		System.out.println("");
		while(scin.hasNext())
		{
			String r = scin.nextLine();
			boolean status = dealer.search(r);
			if(status)
			{
				System.out.println("Vehicle Found");
			}
			else
			{
				System.out.println("Vehicle not Found");
			}
			
		}
	}
}