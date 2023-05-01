import java.util.Scanner;
public class Part1 {
	public static void main (String [] args) {
			

		              Scanner scan = new Scanner(System.in);
		              int pennies = 0; int nickels = 0; int dimes = 0;
		              // number of pennies
		              
		              System.out.println("Enter number of pennies: ");
		                       pennies =  scan.nextInt(); 
		              // number of nickels             
		             System.out.println("Enter number of nickels: ");
		                       nickels =  scan.nextInt();
		              // number of dimes
		              System.out.println("Enter number of dimes: ");
		                       dimes =  scan.nextInt();
		              // Calculate and print out the total number of cents
		                          
		                       System.out.println(pennies*(.01)+nickels*(.05)+dimes*(.10));
		                       
		       }
     

	}
