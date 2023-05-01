import java.util.*;
public class SalaryCalculator {
	public static void main (String [] args) {
		
		// start scanner
		Scanner input = new Scanner (System.in);
		System.out.print("Salary Calculator 1.0 ");
		
		// Get information from user
		double hours, basePay; 
		System.out.println("Enter how many hours worked: ");
		hours = input.nextDouble();
		System.out.println("Enter average hourly pay: ");
		basePay = input.nextDouble();
		
		// calculate overtime hours
		if (hours > 40) {
			double OThours = (hours - 40);
			double OTbasePay = (basePay * 1.5);
			double OTtotalPay = ((40 * basePay)+(OThours * OTbasePay));
			
			System.out.println("Your weekly income is: " + OTtotalPay);
		}
		// no overtime hours
		else {
			double RegSalary = (hours * basePay);
			System.out.println("Your weekly income is: " + RegSalary);
		}
	}
}
