import java.util.Scanner;

public class A
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int count = sc.nextInt();
		sc.nextLine();
		String ss = sc.nextLine();
		Scanner scline = new Scanner(ss);
		String code = scline.next();
		int c = scline.nextInt();
		String co = scline.next();
		System.out.println(code.charAt(0));
		
		if(code.charAt(0) == 'T')
		{
				System.out.println("HI");
		}
	}
}