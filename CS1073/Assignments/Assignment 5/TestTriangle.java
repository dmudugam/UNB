/** 
  This is the driver program for Triangle and CartesianPoint Class; its purpose is 
  to "try out" the Triangle and CartesianPoint class.
  @author Dineth Mithuranga and 3701155
*/


public class TestTriangle 
{
	public static void main (String[] args) 
	{
		
		CartesianPoint cl1 = new CartesianPoint(-0.5, 0.0);
		CartesianPoint cl2 = new CartesianPoint(0.5, 0.0);
		CartesianPoint cl3 = new CartesianPoint(0.0, Math.sqrt(3)/2);

		CartesianPoint cr1 = new CartesianPoint(0.0, 0.0);
		CartesianPoint cr2 = new CartesianPoint(1.0, 0.0);
		CartesianPoint cr3 = new CartesianPoint(0.0, 1.0);



		Triangle TL = new Triangle(cl1, cl2, cl3);
		
		Triangle TR = new Triangle(cr1, cr2, cr3);


		
	
		if(TL.isEquilateral() == true)
		{
			System.out.println("The Triangle TL is an EQUILATERAL Triangle");
			System.out.println("");
		}
		else
		{
			System.out.println("The Triangle TL is NOT an EQUILATERAL Triangle");
			System.out.println("");
		}

		if(TR.isRight() == true)
		{
			System.out.println("The Triangle TR is an Right Angle Triangle");
			System.out.println("");
		}
		else
		{
			System.out.println("The Triangle TR is NOT a Right Angle Triangle");
			System.out.println("");
		}
		if(TL.isRight() == true)
		{
			System.out.println("The Triangle TL is an Right Angle Triangle");
			System.out.println("");
		}
		else
		{
			System.out.println("The Triangle TL is NOT a Right Angle Triangle");
			System.out.println("");
		}
		if(TR.isEquilateral() == true)
		{
			System.out.println("The Triangle TR is an EQUILATERAL Triangle");
			System.out.println("");
		}
		else
		{
			System.out.println("The Triangle TR is NOT an EQUILATERAL Triangle");
			System.out.println("");
		}

		
	
		

		

	}
} // end of TestTriangle class