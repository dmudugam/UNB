/** 
  This is the driver class for CreditCard and it is purpose is to try out the CreditCard class.
  @author Dineth Mithuranga and 3701155
*/

public class CreditCardDriver
{

public static void main (String[] args) 
	{

		

		CreditCard mateosCard = new CreditCard ("Mateo Garcia", 1234123412341234l, 0);
		mateosCard.setBalance(112.55);

		CreditCard sarahsCard = new CreditCard ("Sarah Jones", 246813578642l, 0);
		sarahsCard.setBalance(1675.89);

		CreditCard justinsCard = new CreditCard ("Justin Tremblay", 234510106789l, 0);
		justinsCard.setBalance(25.00);

		CreditCard jillsCard = new CreditCard ("Jill Thomas", 3579864278901234l, 0);
		jillsCard.setBalance(75.86);
		jillsCard.setBalance(63.44);

		sarahsCard.payBalance(500.00);

		justinsCard.payBalance(10.00);

		mateosCard.setBalance(40.00);
		mateosCard.setBalance(6.00);

		jillsCard.payBalance(96.50);

		justinsCard.payBalance(15.00);




 
		
		

		System.out.println ("\nCard Holder Name - " + mateosCard.getName() + "\nCard Number - " + mateosCard.getCardNumber() + "\nBalance - " + mateosCard.getBalance() + "\nInterest - " + mateosCard.getInterest(0.2));
		System.out.println ("\nCard Holder Name - " + sarahsCard.getName() + "\nCard Number - " + sarahsCard.getCardNumber() + "\nBalance - " + sarahsCard.getBalance() + "\nInterest - " + sarahsCard.getInterest(0.17));
		System.out.println ("\nCard Holder Name - " + justinsCard.getName() + "\nCard Number - " + justinsCard.getCardNumber() + "\nBalance - " + justinsCard.getBalance() + "\nInterest - " + justinsCard.getInterest(0.125));
		System.out.println ("\nCard Holder Name - " + jillsCard.getName() + "\nCard Number - " + jillsCard.getCardNumber() + "\nBalance - " + jillsCard.getBalance() + "\nInterest - " + jillsCard.getInterest(0.125));

	} 
   
} // end of CreditCardDriver class