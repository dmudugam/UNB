/**
	This class convert Hexadecimal to decimal.
	@author Dineth Mithuranga and 3701155
*/

public class HexToDecimal
{
	private static int HexToDecimal(String hex) throws IllegalArgumentException
	{
		boolean valid = true;
		hex = hex.toUpperCase();
		int decimal = 0;
		
		for(int i = 0; i < hex.length() && valid; i++)
		{
			int ascii = (int) hex.charAt(i);
			if((ascii >= 48 && ascii <= 57) || (ascii >= 65 && ascii <=70))
			{
				valid = true;
			}
			else
			{
				valid = false;
			}
		}
		
		if(valid)
		{
			
			String hexA = "0123456789ABCDEF";
		
		
			int length = hex.length();
			if(length > 0)
			{
				char ch = hex.charAt(0);
				int digit = hexA.indexOf(ch);
				String substring = hex.substring(1);
				decimal = digit * (int) Math.pow(16, length - 1) + HexToDecimal(substring);
			}
		}
		else
		{
			throw new IllegalArgumentException("Input is not a Hexadecimal value.");
		}
		return decimal;
	}
	
	
	public static void main(String[] args)
	{
		if(args.length == 1)
		{
			try
			{
				System.out.println(HexToDecimal(args[0]));
			}
			catch(IllegalArgumentException e)
			{
				System.out.println(e.getMessage());
			}
		}
		else
		{
			System.out.println("No input was found.");
		}
	}
}