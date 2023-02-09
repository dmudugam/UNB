import java.io.*;

/**
	This class handles the InvalidVehicleException.
	@author Dineth Mithuranga and 3701155.
*/

public class MergeVehicles1
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream f1 = new FileInputStream("Output1.dat");
			FileInputStream f2 = new FileInputStream("Output2.dat");
			ObjectInputStream inStream1 = new ObjectInputStream(f1);
			ObjectInputStream inStream2 = new ObjectInputStream(f2);
			
			boolean eof1 = false;
			boolean eof2 = false;
			boolean done = true;
			Vehicle temp1 = (Vehicle)inStream1.readObject();
			Vehicle temp2 = (Vehicle)inStream2.readObject();;
			while(!eof1)
			{
				try
				{		
						while(!eof2 && done)
						{
							try
							{
								
								
								
								
								if(temp1.getCode().charAt(0) == temp2.getCode().charAt(0))
								{
									int i = temp1.compareTo(temp2);
									
									if(i >= 0)
									{
										System.out.println(temp2);
										temp2 = (Vehicle)inStream2.readObject();
									}
									else
									{
										System.out.println(temp1);
										temp1 = (Vehicle)inStream1.readObject();
									}
								}
								else
								{
									if(temp1.getCode().charAt(0) == 'C' && temp2.getCode().charAt(0) == 'T')
									{
										System.out.println(temp1);
										System.out.println(temp2);
									}
									else if(temp1.getCode().charAt(0) == 'T' && temp2.getCode().charAt(0) == 'V')
									{
										System.out.println(temp1);
										System.out.println(temp2);
									}
									else if(temp1.getCode().charAt(0) == 'T' && temp2.getCode().charAt(0) == 'C')
									{
										System.out.println(temp2);
										System.out.println(temp1);
									}
									else if(temp2.getCode().charAt(0) == 'C' && temp1.getCode().charAt(0) == 'T')
									{
										System.out.println(temp1);
										System.out.println(temp2);
									}
									else if(temp2.getCode().charAt(0) == 'T' && temp1.getCode().charAt(0) == 'V')
									{
										System.out.println(temp1);
										System.out.println(temp2);
									}
									else if(temp2.getCode().charAt(0) == 'T' && temp1.getCode().charAt(0) == 'C')
									{
										System.out.println(temp2);
										System.out.println(temp1);
									}
									
									
									temp1 = (Vehicle)inStream1.readObject();
									temp2 = (Vehicle)inStream2.readObject();
								}
							}
							catch(EOFException e)
							{
								
								eof2 = true;
								done = false;
							}
						}
						if(!done)
						{
							
							System.out.println(temp2);
							temp2 = (Vehicle)inStream2.readObject();
						}
						
						
				}
				catch(EOFException e)
				{
					System.out.println("Reached end of file");
					eof1 = true;
				}
			}
			inStream1.close();
			inStream2.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Not able to access file");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found");
		}
		catch(IOException e)
		{
			System.out.println("Problem reading from file");
		}
	}
}