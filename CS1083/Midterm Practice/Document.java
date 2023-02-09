import java.util.Scanner;

public class Document implements Comparable<Document>
{
	private String name;
	
	private char type;
	
	private int year;
	
	public Document(String nameIn, char typeIn, int yearIn)
	{
		name = nameIn;
		type = typeIn;
		year = yearIn;
	}
	
	public String toString()
	{
		return name + "," + type + "," + year;
	}
	
	public int compareTo(Document other)
	{
		if(this.type != other.type)
		{
			String a = Character.toString(this.type);
			String b = Character.toString(other.type);
			return a.compareTo(b);
		}
		else
		{
			return this.year - other.year;
		}
	}
	
	public String check(Document other) throws InvalidDocumentException
	{
		String number = "";
	
			if(other.type == 'C' || other.type == 'U' || other.type == 'P')
			{
				int newYear = other.year - 2000;
				Scanner s = new Scanner(other.name);
				String code = "";
				String b = Character.toString(other.type);
				while(s.hasNext())
				{
					code = code + s.next().charAt(0);
					
					
				}
				number = b + newYear + "" + code;
			}
			else
			{
				throw new InvalidDocumentException("Invalid Document Type");
			}
		return number;
	}
}