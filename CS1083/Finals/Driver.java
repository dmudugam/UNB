import java.io.*; 
import java.util.*; 
public class Driver{ public static void main(String[] args){ 

try{ String n = args[0]; File i = new File(n); Scanner s = new Scanner(i); 
while(s.hasNextLine())( try{ 
String 1 = s.nextLine(); Scanner sc = new Scanner(1); Fish f = new Fish(sc.next()); try{ while(sc.hasNext())( double w = sc.nextDouble(); f.addWeight(w); 
} Bear b = new Bear(); b.setFood(f); System.out.println("Satisfied"); 
catch(InvalidWeightException e){ System.out.println("Rock"); 
} 
} catch(InsufficientFoodException e){ System.out.println("Unsatisfied"); } 
} System.out.println("Stream"); 
catch(InputMismatchException e){ System.out.println("Stick"); catch(FileNotFoundException e){ System.out.println("Tree"); 
} System.out.println("Wind"); 
