public class DoublyDriver
{
	public static void main(String [] args)
	{
		DoublyList l = new DoublyList();
		
		l.add(10);
		l.add(8);
		l.add(21);
		l.add(41);
		l.add(1);
		l.add(23);
		l.add(26);
		l.add(29);
		l.add(22);
		l.add(0);
		l.removePos(2);
		System.out.println(l.toString());
		
	}
}