/** 
  This is the driver program for Dog Class; its purpose is 
  to "try out" the Dog class.
  @author Dineth Mithuranga and 3701155
*/

public class DogTestDriver
{

public static void main (String[] args) 
	{

		// Create 3 Dog objects:

		Dog dog1 = new Dog ("Fluffie", 6);
		Dog dog2 = new Dog ("Casper", 7);
		Dog dog3 = new Dog ("Rani", 5);


		// This statement will update the name of Dog 2.

		dog2.setName("Lucky");

		// This statement will update the age of Dog 3 in one year because of the birthday.

		dog3.setAge(1);


 
		// Printing out Dog details
		

		System.out.println ("\nDog 1:\n\nName - " + dog1.getName() + "\nAge - " + dog1.getAge() + "\nAge In Person Years - " + dog1.getAgePerson());
		System.out.println ("\nDog 2:\n\nName - " + dog2.getName() + "\nAge - " + dog2.getAge() + "\nAge In Person Years - " + dog2.getAgePerson());
		System.out.println ("\nDog 3:\n\nName - " + dog3.getName() + "\nAge - " + dog3.getAge() + "\nAge In Person Years - " + dog3.getAgePerson());

	} 
   
} // end of DogTestDriver class