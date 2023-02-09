import java.util.Scanner;
import java.text.NumberFormat;
import java.io.*;

public class Driver{
	public static void main(String[] args){
		NumberFormat form = NumberFormat.getCurrencyInstance();
	try
	{
		FileInputStream f = new FileInputStream(args[0]);
		FileOutputStream fo = new FileOutputStream(args[1]);
		Scanner scan = new Scanner(f);

		String name = scan.nextLine();
		int size = scan.nextInt();
		scan.nextLine();
		int count = 0;

		Vehicle[] inventory = new Vehicle[size];
		
			for(int i = 0; i < size; i++){
					String line = scan.nextLine();
					Scanner sc = new Scanner(line);
					String code = sc.next();
					int mileage = sc.nextInt();
					Vehicle temp;
					if(code.charAt(0) == 'C'){
						int doors = sc.nextInt();
						char type = sc.next().charAt(0);
						try{
							temp = new Car(code, mileage, type, doors);	
							inventory[i] = temp;
							count++;
						}
						catch(InvalidVehicleException e){
							size--;
							i--;
							System.out.println("********************" + e.getMessage() + "********************");
						}
						
					}
					else if(code.charAt(0) == 'T'){
						String bed = sc.next();
						try{
							temp = new Truck(code, mileage, bed);
							inventory[i] = temp;
							count++;
						}
						catch(InvalidVehicleException e){
							size--;
							i--;
							System.out.println("********************" + e.getMessage() + "********************");
						}
					
					}
					else{
						String bool = sc.next();
						boolean isElect = false;
						if(bool.equals("true")){
							isElect = true;
						}
						temp = new Van(code, mileage, isElect);
						inventory[i] = temp;
						count++;
					}
					//inventory[i] = temp;
			}
			Vehicle[] inventorycopy = new Vehicle[count];			
			for(int j = 0; j < count; j++){
				inventorycopy[j] = inventory[j];
			}
			inventory = inventorycopy;
		
		
		Dealership dealer = new Dealership(name, inventory);

		System.out.println(dealer);

		System.out.println("\nSorted Data:\n");
		
		Sorter<Vehicle> sort = new Sorter<Vehicle>();
		Vehicle[] copy = dealer.getInventory();

		sort.selectionSort(copy);

		System.out.println(dealer.getName());
		
		for(Vehicle v : copy){
				System.out.println(v.getCode() + "\t" + form.format(v.calculatePrice()) + "\n");
			}
			
		try{
			
			ObjectOutputStream outStream = new ObjectOutputStream(fo);
			for(int j = 0; j < inventory.length; j++){
				
				outStream.writeObject(copy[j]);
			}
			outStream.close();
		}
		catch(FileNotFoundException e){
			System.out.println("Not able to access file");
		}
		catch(IOException e){
			System.out.println("*********Problem writing to file************" + e.getMessage());
		}
		while(scan.hasNext()){
			String searchCode = scan.nextLine();
			System.out.println("Vehicle " + ((dealer.search(searchCode) == null)?"not":"") + " found");
		}
	}
	catch(FileNotFoundException e){
			System.out.println("Not able to access file");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Not able to access file");
		}
	}
	
}