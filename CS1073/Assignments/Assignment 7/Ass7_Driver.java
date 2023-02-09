import java.util.Scanner; 
import java.text.NumberFormat; 

/** 
  This is the driver program for Box Class and Tube Class; its purpose is 
  to "try out" the Box and Tube class.
  @author Dineth Mithuranga and 3701155
*/


public class Ass7_Driver 
{
	public static void main (String[] args) 
	{
		Scanner input = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getNumberInstance();


		formatter.setMaximumFractionDigits(3);
		int swtch = 0;
		double tubesurface = 0;
		double tubevolume = 0;
		double boxsurface = 0;
		double boxvolume = 0;
		



		while(swtch == 0)
		{


			Box box1 = new Box(0, 0, 0);
			Tube tube1 = new Tube(0, 0);
			System.out.println(" ");
			System.out.println("What would you like to do?");
			System.out.println("1 - Get info for a box");
			System.out.println("2 - Get info for a tube");
			System.out.println("3 - Quit");
			System.out.print("Enter your choice: ");			
			int x = input.nextInt();
		


			
			if(x == 1)
			{
				
				System.out.print("Length (in cm): ");
				double blength = input.nextDouble();
				while(blength < 1)
				{
					System.out.print("Incorrect value. Please enter a correct Length again: ");
					blength = input.nextDouble();
				}

				System.out.print("Width (in cm): ");
				double bwidth = input.nextDouble();
				while(bwidth < 1)
				{
					System.out.print("Incorrect value. Please enter a correct Width again: ");
					bwidth = input.nextDouble();
				}

				System.out.print("Height (in cm): ");
				double bheight = input.nextDouble();
				while(bheight < 1)
				{
					System.out.print("Incorrect value. Please enter a correct Height again: ");
					bheight = input.nextDouble();
				}
				box1 = new Box(blength, bwidth, bheight);


				System.out.println("The volume is: " + formatter.format(box1.getVolume()) + " cubic centimeters");

				System.out.println("The surface area is: " + formatter.format(box1.getArea()) + " square centimeters");
			}
			else if (x == 2)
			{
				System.out.print("Radius (in cm): ");
				double tradius = input.nextDouble();
				while(tradius < 1)
				{
					System.out.print("Incorrect value. Please enter a correct Radius again: ");
					tradius = input.nextDouble();
				}

				System.out.print("Height (in cm): ");
				double theight = input.nextDouble();
				while(theight < 1)
				{
					System.out.print("Incorrect value. Please enter a correct Height again: ");
					theight = input.nextDouble();
				}

				tube1 = new Tube(tradius, theight);

				System.out.println("The volume is: " + formatter.format(tube1.getVolume()) + " cubic centimeters");

				System.out.println("The surface area is: " + formatter.format(tube1.getArea()) + " square centimeters");

			}
			else if (x == 3)
			{
				if(tubevolume > boxvolume || boxvolume == 0)
				{
					System.out.println("The container with the largest volume is a Tube.");
					System.out.println("Its volume is: " + formatter.format(tubevolume) + " cubic centimeters.");
				}
				else if(tubevolume < boxvolume || tubevolume == 0)
				{
					System.out.println("The container with the largest volume is a Box.");
					System.out.println("Its volume is: " + formatter.format(boxvolume) + " cubic centimeters.");
				}
				if(tubesurface > boxsurface || tubesurface == 0)
				{
					System.out.println("The container with the smallest surface area is a box.");
					System.out.println("Its surface area is: " + formatter.format(boxsurface) + " square centimeters.");
				}
				else if(tubesurface < boxsurface || boxsurface == 0)
				{
					System.out.println("The container with the smallest surface area is a tube.");
					System.out.println("Its surface area is: " + formatter.format(tubesurface) + " square centimeters.");
				}
				swtch = 1;
			}
			else
			{
				System.out.println("Please enter a correct input.");
			}

			if(tube1.getArea() < tubesurface && tube1.getArea() > 0 || tubesurface == 0)
			{
				tubesurface = tube1.getArea();
			}
			if(tube1.getVolume() > tubevolume && tube1.getVolume() > 0 || tubevolume == 0)
			{
				tubevolume = tube1.getVolume();
			}
			if(box1.getArea() < boxsurface && box1.getArea() > 0 || boxsurface == 0)
			{
				boxsurface = box1.getArea();
			}
			if(box1.getVolume() > boxvolume && box1.getVolume() > 0 || boxvolume == 0)
			{
				boxvolume = box1.getVolume();
			}
		}
		
	}
} // end Ass7_Driver