/**
 This class represents a Tube.
 @author Dineth Mithuranga and 3701155.
*/

public class Tube

{
	/**
	radius
	*/

	private double radius;

	/**
	height
	*/

	private double height;

	/**
	This method constructs a Tube with the specified radius and height. 
	@param radiusIn The radius of the Tube.
	@param heightIn The height of the Tube.
	*/

	public Tube (double radiusIn, double heightIn)
	{
		radius = radiusIn;
		height = heightIn;
	}

	/**
	This method retrieves the radius of the tube.
	@return The radius of the tube.
	*/

	public double getRadius ()
	{
		return radius;
	}

	/**
	This method retrieves the height of the tube.
	@return The height of the tube.
	*/

	public double getHeight ()
	{
		return height;
	}


	/**
	This method calculate retrieves the volume of the tube.
	@return The volume of the tube.
	*/

	public double getVolume ()
	{
		return (Math.PI * radius * radius * height);
	}

	/**
	This method calculate and retrieves the surface area of the tube.
	@return The surface area of the tube.
	*/

	public double getArea ()
	{
		return ((2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius));
	}
	
}
