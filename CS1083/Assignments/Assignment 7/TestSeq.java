/**
TestSeq.java
A simple driver that uses the Seq class to compute the
nth element of the sequence.

@author Dineth Mithuranga 3701155

*/
import java.text.NumberFormat; 
import java.util.Scanner;

public class TestSeq{

	public static void main(String[] args){
		
		NumberFormat form = NumberFormat.getInstance();
		form.setMaximumFractionDigits(7);
		form.setMinimumFractionDigits(7);

		int n, seqRec, seqM, seqI;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		n = scan.nextInt();
		
		seqRec = Seq.seqR(n);
		System.out.println("seqR(" + n + ") is: " + seqRec);
		
		seqM = Seq.seqM(n);
		System.out.println("seqM(" + n + ") is: " + seqM);
		
		seqI = Seq.seqI(n);
		System.out.println("seqI(" + n + ") is: " + seqI);
		System.out.println("");
		
		System.out.println("Execution Times in Milliseconds (ms)");
		System.out.println("n\tRecursive\tSeq(n)\tMemoization" + "\tSeq(n)\tItertive\tSeq(n)");

		
		for(int i = 15; i <= 35; i+=10){
			
			// Computer the execution time for Recursive method.
			
			long startR = System.nanoTime();
			int seqA = Seq.seqR(i);
			long endR = System.nanoTime();
			double timeR = (double)(endR-startR)/1000000;
			System.out.print(i + "\t" + form.format(timeR) + "\t" + seqA);
			
			// Computer the execution time for Memoization method.
			
			long startM = System.nanoTime();
			int seqB = Seq.seqM(i);
			long endM = System.nanoTime();
			double timeM = (double)(endM-startM)/1000000;
			System.out.print("\t" + form.format(timeM) + "\t" + seqB);
			
			// Computer the execution time for Itertive method.
			
			long startI = System.nanoTime();
			int seqC = Seq.seqI(i);
			long endI = System.nanoTime();
			double timeI = (double)(endI-startI)/1000000;
			System.out.print("\t" + form.format(timeI) + "\t" + seqC);
			System.out.println("");
		}
	
	}
} 