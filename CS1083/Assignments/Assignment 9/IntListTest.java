import java.util.Scanner;

/**
Tests the methods of the IntList class.
@author Dineth Mithuranga and 3701155
*/
public class IntListTest {
	private static Scanner scan;
	private static IntList list = new IntList();

	/*
	Creates a list, then repeatedly prints the menu and does what
	the user asks until they quit.
	*/
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		printMenu();
		int choice = scan.nextInt();
		while (choice != 0) {
			dispatch(choice);
			printMenu();
			choice = scan.nextInt();
		}
	}

	/*
	Does what the menu item calls for.
	*/
	public static void dispatch(int choice) {
		int newVal, endNewVal, replaceOld, replaceNew;
		switch (choice) {
			case 0:
				System.out.println("Bye!");
				break;
			case 1: //add to front
				 System.out.println("Enter integer to add to front");
				 newVal = scan.nextInt();
				 list.addToFront(newVal);
				 break;
			case 2: //remove first element
				 list.removeFirst();
				 break;
			case 3: //print
				 list.print();
				 break;
			case 4: //length 
				 System.out.println("The length of the list: " + list.length());
				 break;
			case 5: //add to end 
				 System.out.println("Enter integer to add to end");
				 endNewVal = scan.nextInt();
				 list.addToEnd(endNewVal);
				 break;
			case 6: //remove from end
				 list.removeLast();
				 break;
			case 7: //replace values
				 System.out.println("Enter integer need to be replaced");
				 replaceOld = scan.nextInt();
				 System.out.println("Enter integer need to be replaced with.");
				 replaceNew = scan.nextInt();
				 list.replace(replaceOld, replaceNew);
				 break;
			case 8: //print the list recersively.
				 list.printRec();
				 break;
			case 9: //print the list backwards recersively.
				 list.printRecBackwards();
				 break;
			default:
				System.out.println("Sorry, invalid choice");
		}
	}
	
	/*
	Prints the user's choices
	*/
	public static void printMenu() {
		System.out.println("\n Menu ");
		System.out.println(" ====");
		System.out.println("0: Quit");
		System.out.println("1: Add an integer to the front of the list");
		System.out.println("2: Remove an integer from the front of the list");
		System.out.println("3: Print the list");
		System.out.println("4: Print the length");
		System.out.println("5: Add an integer to the end of the list");
		System.out.println("6: Remove an integer from the end of the list");
		System.out.println("7: Replace a value in the list.");
		System.out.println("8: Print the list recursively.");
		System.out.println("9: Print the list backwards recursively.");
		System.out.print("\nEnter your choice: ");
	}
}
