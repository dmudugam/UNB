import java.io.*;

public class ContactDriver
{
	private static Contact temp;
	public static void main (String[] args)
	{
		
		Contact[] friends = new Contact[10];
		
		int i = 0;
		boolean EOF = false;
		//read at most 10 values, or catchEOFException if EOF
		try
		{
			FileInputStream fis = new FileInputStream ("test.dat");
			ObjectInputStream inFile2 = new ObjectInputStream (fis);
			while(!EOF)
			{
				temp = (Contact)inFile2.readObject();
				friends[i] = temp;
				i++;
			}
		}
		catch(EOFException e)
		{
			EOF = true;
		}
		catch(FileNotFoundException u)
		{
			System.out.println("Not able to access file");
		}
		catch(ClassNotFoundException o)
		{
			System.out.println("Class not found");
		}
		catch(IOException p)
		{
			System.out.println("Problem reading from file");
		}
		System.out.println(temp.findContact(friends, new Contact(args[0], args[1], "")));
	}
}