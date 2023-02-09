import java.util.Scanner; 
import java.util.Arrays;
import java.util.Random; 

/** 
  This Class is to encrypt a message; 
  @author Dineth Mithuranga and 3701155
*/


public class Code
{
	public static void main (String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		char[][] letters = new char[0][0];
		
		
		int nor = input.nextInt();
		while(nor < 0)
		{
			nor = input.nextInt();
		}

		while(nor>0)
		{	

			input.nextLine();
			String msg = input.nextLine();
		
			msg = msg.replaceAll("[\\s,'\\-!.]", "");
			msg = msg.toLowerCase();
			
			
			int k = 0;

			if(msg.length()%nor != 0)
			{
				int col = (msg.length() / nor) + 1;
				letters = new char[nor][col];
				
				for(int i = (letters[0].length-1); 0 <= i; i--)
				{
					
					if(i%2 == 0)
					{
						for(int l = letters.length-1; 0 <= l && k < msg.length(); l--)
						{
							letters[l][i] = msg.charAt(k);
							k++;
						}
					}
					else
					{
						for(int y = 0; letters.length > y && k < msg.length(); y++)
						{
							letters[y][i] = msg.charAt(k);
							k++;
						}
					}
				}
				int empty = (nor*col) - msg.length();
				for(int o = 0; o < empty; o++)
				{
					char c = (char)(r.nextInt(26) + 'a');
					letters[o][0] = c;
				}
			}
			else if(msg.length()%nor == 0)
			{	
				letters = new char[nor][nor];
				for(int i = letters[0].length-1; 0 <= i; i--)
				{
	
					if(i%2 == 0)
					{
						for(int l = letters.length-1; 0 <= l; l--)
						{
							letters[l][i] = msg.charAt(k);
							k++;
						}
					}
					else
					{
						for(int y = 0; letters.length > y; y++)
						{
							letters[y][i] = msg.charAt(k);
							k++;
						}
					}
					
				}
			}

			for(int g = (letters.length-1); 0 <= g; g--)
			{	
				for(int h = 0; letters[0].length > h; h++)
				{
					System.out.print(letters[g][h]);
				}
			}
			System.out.println("");
			nor = input.nextInt();
			
		}
	}
} // end of Code Class