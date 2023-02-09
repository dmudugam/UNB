/**
 This class represents a CreditCard  and manages creditcard balance.
 @author Dineth Mithuranga and 3701155
*/

public class CreditCard 
{
	//owners name of the credit card.

	private String name;
	
	//credit card number.

	private long cardNumber;

	//creditcard balance

	private double balance;


	/**
	This method constructs a CreditCard with the specified name and number and balance. 
	@param nameIn The name of the owner
	@param cardNumberIn CreditCard Number
	@param balanceIn Current Balance of the Card
	*/


	public CreditCard (String nameIn, long cardNumberIn, double balanceIn)
	{
		name = nameIn;
		cardNumber = cardNumberIn;
		balance = balanceIn;
	}

	/**
	This method retrieves the name of the cardowner. 
	@return The name of the owner 
	*/

	public String getName ()
	{
		return name;
	}

	/** 
	This method retrieves the card Number. 
	@return The card number. 
	*/

	public long getCardNumber ()
	{
		return cardNumber;
	}

	/** 
	This method retrieves the card balance. 
	@return The current card balance. 
	*/

	public double getBalance ()
	{
		return balance;
	}

	/** 
	This method is called to change the card balance. 
	@param updateBalance Updates the balance if anything is purchased. 
	*/

	public void setBalance (double updateBalance)
	{
		balance += updateBalance;
	}

	/** 
	This method is called to change the card balance if payment is made. 
	@param payBalance Updates the balance if a payment is made. 
	*/

	public void payBalance (double payBalance)
	{
		balance -= payBalance;
	}

	/**
	This method is called to calculate the interest. 
	@return Calculated interest
	@param interestIn Recieves the interest rate. 
	*/

	public double getInterest (double interestIn)
	{
		return (balance*interestIn);
	}

  

} //end CreditCard
