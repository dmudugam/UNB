/**
 This class represents a dog.
 @author Dineth Mithuranga & 3701155
*/
public class Dog {

   /**
    The name of the dog.
   */

	private String name;
  

   /**
    The age of the dog (in years).
   */
	private int age;

   /**
    This method constructs a Dog with the specified
    name and age.
    @param nameIn The name of the dog.
    @param ageIn The age of the dog (in years).
   */
	public Dog (String nameIn, int ageIn)
	{
		name = nameIn;
		age = ageIn;
	}	

   /**
    This method retrieves the name of the dog.
    @return The name of the dog.
   */
	public String getName ()
	{
		return name;
	}


   /**
    This method retrieves the age of the dog.
    @return The age of the dog (in years).
   */
	public int getAge()
	{
		return age;
	}

   /**
    This method computes and returns the dog's age in 
    "person years".
    @return The age of the dog (in person years).
   */
	public int getAgePerson ()
	{
		return age*7;
	}

   /**
    This method is called to change the name of the dog.
    @param nameIn The new name for the dog.
   */
	public void setName (String updateName)
	{
		name = updateName;
	}

   /**
    This method is called to increase the age of the dog
    by one year.
   */
	public void setAge (int updateAge)
	{
		age += updateAge;
	}

} //end Dog
