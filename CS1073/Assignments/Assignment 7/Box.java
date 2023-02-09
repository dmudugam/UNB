/**
 This class represents a Box.
 @author Dineth Mithuranga and 3701155.
*/

public class Box

{
	/**
	length
	*/

	private double length;

	/**
	width
	*/

	private double width;

	/**
	height
	*/

	private double height;

	/**
	This method constructs a Box with the specified length, width and height. 
	@param lengthIn The length of the Box.
	@param widthIn The width of the Box.
	@param heightIn The height of the Box.
	*/

	public Box (double lengthIn, double widthIn, double heightIn)
	{
		length = lengthIn;
		width = widthIn;
		height = heightIn;
	}

	/**
	This method retrieves the length of the box.
	@return The length of the box.
	*/

	public double getLength ()
	{
		return length;
	}

	/**
	This method retrieves the width of the box.
	@return The width of the box.
	*/

	public double getWidth ()
	{
		return width;
	}

	/**
	This method retrieves the height of the box.
	@return The height of the box.
	*/

	public double getHeight ()
	{
		return height;
	}

	/**
	This method calculate retrieves the volume of the box.
	@return The volume of the box.
	*/

	public double getVolume ()
	{
		return (length*width*height);
	}

	/**
	This method calculate and retrieves the surface area of the box.
	@return The surface area of the box.
	*/

	public double getArea ()
	{
		return (2*(length*width) + 2*(length*height) + 2*(height*width));
	}
	
}
