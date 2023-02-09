import java.util.Scanner;


/**
 This class represents a StringGenerator.
 @author Dineth Mithuranga and 3701155.
*/

public class StringGenerator
{

	/**
	This method is called to generate an acronym on a specified text. 
	@param text The specified text.
	@return facronym prepared acronym.
	*/

	public static String generateAcronym (String text)
	{
		char ch1, ch2;
		String acronym = "", word = "";
		String number = "";
		
		Scanner token = new Scanner(text); 
		
		
		while(token.hasNext())
		{
			word = token.next();
			ch1 = word.charAt(0);
			
			if(Character.isUpperCase(ch1))
			{
				acronym = acronym + ch1;
			}
			else if (Character.isDigit(ch1))
			{
				for(int i=0, j=word.length()-1; i<=j; i++)
				{
					ch2 = word.charAt(i);

					number = number + ch2;
				}
			}
		}
		String facronym = (acronym + number);
		return facronym;
	}
	

	/**
	This method is called to generate a password on a specified text. 
	@param text The specified text.
	@return password prepared password.
	*/

	public static String generatePassword (String text)
	{
		char ch1, ch2;
		String password = "", phrase = "";
		String ch01 = "", ch02 = "";
		int c = 2;
		Scanner token = new Scanner(text); 

		while(token.hasNext())
		{
			
			phrase = token.next();
			int j = phrase.length();

			if(j >= 3)
			{
				if(c % 2 == 0)
				{
					ch1 = phrase.charAt(j-2);
					ch2 = phrase.charAt(j-1);

					ch01 = Character.toString(ch1).toLowerCase();
					ch02 = Character.toString(ch2).toLowerCase();



					if(ch01.equals("l"))
					{
						ch01 = "!";
					}
					if(ch01.equals("t"))
					{
						ch01 = "+";
					}




					if(ch02.equals("l"))
					{
						ch02 = "!";
					}
					if(ch02.equals("t"))
					{
						ch02 = "+";
					}
					
					password = password + (ch01 + ch02);
					c++;
				}
				else if(c > 0)
				{
					ch1 = phrase.charAt(0);
					ch2 = phrase.charAt(1);

					ch01 = Character.toString(ch1).toUpperCase();
					ch02 = Character.toString(ch2).toUpperCase();
					

					if(ch01.equals("B"))
					{
						ch01 = "3";
					}
					if(ch01.equals("H"))
					{
						ch01 = "#";
					}




					if(ch02.equals("B"))
					{
						ch02 = "3";
					}
					if(ch02.equals("H"))
					{
						ch02 = "#";
					}

					c++;
					password = password + (ch01 + ch02);
				}
			
			}

		
		}
	return password;
	}	
}





