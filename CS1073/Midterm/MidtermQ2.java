public class MidtermQ2 {
 public static void main (String[] args) {
 LandscapeMaterial material1 = new LandscapeMaterial ("grass", 2);
 LandscapeMaterial material2 = new LandscapeMaterial ("brick", 10);
 Yard backyard;
 Yard frontyard = new Yard (30, 20, material2);
 Yard playSpace = new Yard (40, 20, material1);
 backyard = playSpace;
 playSpace.increaseLength (10);
 System.out.println ("Backyard:");
 System.out.println ("Area: " + backyard.getArea()
 + ", Covering: " + backyard.getCovering().getDescription()
 + ", Price: " + backyard.getPrice());
 System.out.println ("Front yard:");
 System.out.println ("Area: " + frontyard.getArea()
 + ", Covering: " + frontyard.getCovering().getDescription()
 + ", Price: " + frontyard.getPrice());
 System.out.println ("Play space:");
 System.out.println ("Area: " + playSpace.getArea()
 + ", Covering: " + playSpace.getCovering().getDescription()
 + ", Price: " + playSpace.getPrice());
 }
} 