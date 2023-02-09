import java.util.ArrayList;
/**
Seq.java
A utility class that provide methods to compute elements of the
recursive sequence.

@author Dineth Mithuranga 3701155

*/
public class Seq{
	
	/**
	Recursively computes seq(n)
	@param n Non-negative integer.
	@return int Element n in the recursive sequence.
	*/
	
	private static ArrayList<Integer> num;
	
	public static int seqR(int n){
		//Fill in code -- this should look very much like the
		//mathematical specification
		
		if(n == 0)
		{
			return 1;
		}
		else if(n == 1)
		{
			return 3;
		}
		else
		{
			n = seqR(n-1) - seqR(n-2)*2;
			
			return n;
		}
		
	}
	
	/**
	computes seq(n) with Memoization
	@param n Non-negative integer.
	@return int Element n in the Memoization sequence.
	*/
	
	public static int seqM(int n)
	{
		
		if(num == null)
		{
			num = new ArrayList<Integer>(n+1);
			num.add(1);
			num.add(3);
		}
		if(num.size() >= n+1)
		{
		
			return num.get(n);
		}
		else
		{
			int i = num.size();
			while(i <= n)
			{
				num.add(i, (num.get(i-1) - num.get(i-2)*2));
				i++;
			}
			return num.get(n);
		}
		
		
	}
	
	/**
	computes seq(n) with Iteration
	@param n Non-negative integer.
	@return int Element n in the Iteration sequence.
	*/
	
	public static int seqI(int n)
	{
		int[] numI = new int[n+1];

		if(n == 0)
		{
			return 1;
		}
		else if(n == 1)
		{
			return 3;
		}
		if(n >= 2)
		{
			numI[0] = 1;
			numI[1] = 3;
			for(int i = 2; i <= n; i++)
			{
				numI[i] = numI[i-1] - numI[i-2]*2;
			}
		}
		return numI[numI.length-1];
	}
	
}
