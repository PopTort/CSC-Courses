
import java.util.*;
public class InputMath {
	
	public static void main (String [] args) {
	
		// start scanner
		Scanner input = new Scanner (System.in);
		
		// Get information from user
		System.out.println("Enter first number: ");
		double num1 = input.nextDouble();
		System.out.println("Enter second number: ");
		double num2 = input.nextDouble();
		System.out.println("Enter third number: ");
		double num3 = input.nextDouble();
		
		//calculations
		double total = (num1+num2+num3);
		
		System.out.println("The total is: "+ total);
	}
}
