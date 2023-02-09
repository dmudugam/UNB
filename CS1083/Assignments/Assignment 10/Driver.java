import java.util.NoSuchElementException;

/**
Driver for testing Student and ClassList classes
@author Dineth Mithuranga and 3701155
*/

public class Driver
{
	public static void main(String[] args)
	{
		//Creating students.
		Student s1 = new Student("Ben", "Afrojack", 5);
		Student s2 = new Student("John", "Carter", 3);
		Student s3 = new Student("Arnold", "Eric", 2);
		Student s4 = new Student("Justin", "Bieber", 4);
		Student s5 = new Student("Simon", "Derick", 1);
		Student s6 = new Student("Emily", "Fraser", 6);
		Student s7 = new Student("Gordan", "Holmes", 8);
		Student s8 = new Student("Ian", "Garner", 7);
		Student s9 = new Student("B", "Mithuranga", 9);
		Student s10 = new Student("E", "Mithuranga", 10);
		Student s11 = new Student("C", "Mithuranga", 11);
		Student s12 = new Student("A", "Mithuranga", 13);
		Student s13 = new Student("D", "Mithuranga", 12);
		Student s14 = new Student("Dineth", "Mithuranga", 4);
		Student s15 = new Student("Dineth", "Mithuranga", 1);
		Student s16 = new Student("Dineth", "Mithuranga", 2);
		Student s17 = new Student("Dineth", "Mithuranga", 5);
		Student s18 = new Student("Dineth", "Mithuranga", 3);
		
		
		ClassList list = new ClassList();
		
		//adding unsorted items to the list.
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		//Printing the sorted list by lastname.
		System.out.print(list.toString());
		
		
		try
		{
			//Removing item from the begining of the list.
			System.out.println("\nRemoved Items : \n");
			//removing item from the begining of the list.
			list.remove(s1);
			System.out.println(s1.toString());
			//removing item from the anywhere except for end and begining.
			list.remove(s2);
			System.out.println(s2.toString());
			//removing item from the end of the list.
			list.remove(s3);
			System.out.println(s3.toString());
			
			//printing the list after removing items from the list.
			System.out.println("\nAfter Removing: \n");
			System.out.println(list.toString());
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Item is not in the list.");
		}
		
		//adding more items to the list
		list.add(s6);
		list.add(s7);
		list.add(s8);
		
		//Printing the list in reverse after adding more items.
		System.out.println("List in reverse order: \n");
		Student[] array = new Student[list.getNumStudents()];
		array = list.getReversedList();
		for(Student s: array)
		{
			System.out.println(s.toString());
		}
		
		//removing an item that is not in the list.
		try
		{
			//Removing item from the begining of the list.
			System.out.println("\nRemoving an item not in the list: " + s1.toString() + "\n");
			list.remove(s1);
			
		}
		catch(NoSuchElementException a)
		{
			System.out.println("Item is not in the list.");
		}
		
		//printing the number of items in the list.
		System.out.println("\nNumber of Students in the list: " + list.getNumStudents() + "\n");
		
		//Testing CompareTo Method functions.
		System.out.println("Testing compareTo Method functions: \n");
		try
		{
			//Removing all the items TO CHECK SORTING BY FIRST NAME.
			list.remove(s4);
			list.remove(s5);
			list.remove(s6);
			list.remove(s7);
			list.remove(s8);
			//adding new items to check SORTING BY FIRST NAME.
			list.add(s9);
			list.add(s10);
			list.add(s11);
			list.add(s12);
			list.add(s13);
			System.out.println("Sort by First name when the last names are same: \n");
			System.out.println(list.toString());
			//Removing all the items again to check sort by student ID.
			list.remove(s9);
			list.remove(s10);
			list.remove(s11);
			list.remove(s12);
			list.remove(s13);
			//adding new items to check SORTING BY STUDENT ID.
			list.add(s14);
			list.add(s15);
			list.add(s16);
			list.add(s17);
			list.add(s18);
			System.out.println("Sort by Student ID when the last names and first names are same: \n");
			System.out.println(list.toString());
			
		}
		catch(NoSuchElementException a)
		{
			System.out.println("Item is not in the list.");
		}
	}
}