import java.util.Scanner;

public class A( 
public static void main(String[] args)( 
} 
} 
Exercise f = new Flexibility("Yoga", 150); Endurance e = new Lowlmpact("Water aerobics", 300); int weight = 160; Person p = new Person("Jenna", 175, 45); 
HealthTrackable[] record = new HealthTrackable[5]; 
record[0] record[1] record[2] record[3] record[4] 
= new Endurance("Running", 350); = f; = new Strength("Rock Climbing", 400); = e; = p; 
p.setWeight(weight); 
double[] time = (3, 2, 1, 2, 1.5); 
for(int i = 0; i < record.length; i++){ System.out.println(record[i].getName() + "\t" + record[i].caloriesBurned(time[i]) + "\t" + record[i].muscleBuild(time[i])); 
} 
