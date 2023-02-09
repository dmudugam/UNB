import java.util.Scanner;

public class C
{
	private static Document[] list;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		list = new Document[count];
		sc.nextLine();
		for(int i = 0; i < count; i++)
		{
			String s = sc.nextLine();
			Scanner sci = new Scanner(s);
			sci.useDelimiter(",");
			String name = sci.next();
			char type = sci.next().charAt(0);
			int year = sci.nextInt();
			list[i] = new Document(name, type, year);
			
		}
		
		for(Document temp : list)
		{
			System.out.println(temp);
		}
		
		Sorter<Document> sort = new Sorter<Document>();
		sort.selectionSort(list);
		
		System.out.println("\nSorted");
		for(Document temp : list)
		{
			System.out.println(temp);
		}
		
	
		System.out.println("\n Codes: \n");
		for(int i = 0; i < list.length; i++)
		{
			try
			{
				System.out.println(list[i].check(list[i]));
			}
			catch(InvalidDocumentException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}