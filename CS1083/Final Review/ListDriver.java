public class ListDriver
{
	public static void main(String [] args)
	{
		List l = new List();
		
		l.addEnd(10);
		l.addEnd(8);
		l.addEnd(21);
		l.addEnd(41);
		l.addEnd(1);
		l.addEnd(23);
		l.addEnd(26);
		l.addEnd(29);
		l.addEnd(22);
		l.addEnd(0);
		System.out.println(l.toString());
		System.out.println(l.hasDuplicate());
		
	}
}