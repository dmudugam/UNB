/**
 This class represents a triangle shape using 3 points.
 @author Natalie Webber
 @author Dineth Mithuranga and 3701155.
*/
public class Triangle {

   private CartesianPoint pointA;
   private CartesianPoint pointB;
   private CartesianPoint pointC;

  
   public Triangle (double x1, double y1,
                    double x2, double y2,
                    double x3, double y3) {
      pointA = new CartesianPoint (x1, y1);
      pointB = new CartesianPoint (x2, y2);
      pointC = new CartesianPoint (x3, y3);
   }
  
   public Triangle (CartesianPoint p1,
                    CartesianPoint p2,
                    CartesianPoint p3) {
      pointA = p1;
      pointB = p2;
      pointC = p3;
   }
  
   public double getPerimeter () {
      return pointA.distance(pointB)
           + pointB.distance(pointC)
           + pointC.distance(pointA);
   }


   /**
   This method is called to check the triangle is a Equilateral Triangle.
   @return Whether triangle is a Equilateral Triangle or not.
   */

   public boolean isEquilateral () {
      double TOLERANCE = 1E-14;

      double d1 = pointA.distance(pointB);
      double d2 = pointB.distance(pointC);
      double d3 = pointC.distance(pointA);
    
      if(Math.abs(d1-d2) < TOLERANCE && Math.abs(d1-d3) < TOLERANCE && Math.abs(d2-d3) < TOLERANCE) {

      return true;

   }
      else {

      return false;

   }
      

   }

   /**
   This method is called to check the triangle is a Right Angle Triangle.
   @return Whether triangle is a Right Agle or not.
   */

   public boolean isRight () {
      double TOLERANCE = 1E-14;
      double hypot = 0;

      double d4 = pointA.distance(pointB);
      double d5 = pointB.distance(pointC);
      double d6 = pointC.distance(pointA);

      if(d4 > d5 && d4 > d6) {

      hypot = d4;
      double num1 = hypot * hypot;
      double num2 = (d5*d5) + (d6*d6);

      if(Math.abs(num1-num2) < TOLERANCE) {

      return true;
   }
      else {
      
      return false;
   }
   }

      else if(d5 > d4 && d5 > d6) {

      hypot = d5;
      double num1 = hypot * hypot;
      double num2 = (d4*d4) + (d6*d6);

      if(Math.abs(num1-num2) < TOLERANCE) {

      return true;
   }
      else {

      return false;

   }
   }

      else if(d6 > d5 && d6 > d4) {

      hypot = d6;
      double num1 = hypot * hypot;
      double num2 = (d5*d5) + (d4*d4);

      if(Math.abs(num1-num2) < TOLERANCE) {

      return true;
   }
      else {
      
      return false;
   }
   }
      else {

      return false;

   }

  }
  
}
