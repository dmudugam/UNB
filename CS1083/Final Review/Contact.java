import java.io.Serializable;

public class Contact implements Serializable 
{
	private String firstName;
	private String lastName;
	private String phone;
	
	public Contact (String first, String last, String telephone)
	{
		firstName = first;
		lastName = last;
		phone = telephone;
	}
	
	public String toString ()
	{
		return lastName + "," + firstName + "," + phone;
	}
	
	public boolean findContact(Contact[] carray, Contact c)
	{
		boolean found = false;
		
		for(int i = 0; i < carray.length && !false; i++)
		{
			if(carray[i] == c)
			{
				found = true;
			}
		}
		return found;
	}
}