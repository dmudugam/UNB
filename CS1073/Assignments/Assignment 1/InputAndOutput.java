import java.util.Scanner;
/**
@author Dineth Mithuranga and 3701155
**/
public class InputAndOutput {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("My name is TOM. What is your name?");
String userInput = sc.nextLine();
System.out.println("Pleased to meet you, " + userInput);
System.out.println("In which program are you enrolled?");
String userInput1 = sc.nextLine();
System.out.println("It was nice to hear that you are enrolled in " + userInput1 + ". See you soon " + userInput);
}
}