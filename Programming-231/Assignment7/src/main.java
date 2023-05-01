import java.util.Scanner;
public class main {

	public static void main(String [] args) {
		
		for(int x = 0; x <=2;x++) {
			Scanner input = new Scanner (System.in);
			System.out.print("Enter Employees Name: ");
			String name = input.next();
			System.out.print("Enter Employees ID: ");
			int a = input.nextInt();
			System.out.print("Enter Hours Worked: ");
			int b = input.nextInt();
			System.out.print("Enter Average Pay Rate: ");
			int c = input.nextInt();
		
			Employee(name,a,b,c);
		}
		
	}

	public static double ComputePay(double hoursWorked, double PayRate) {
		return PayRate * hoursWorked;
		
	}
	
	 public static void Employee(String employeeName, int employeeID, double hoursWorked, double payRate) {
		 	
		System.out.println("\n"+employeeName + " " + employeeID + " " + hoursWorked + " " + payRate + " " + main.ComputePay(hoursWorked,payRate)+"\n");
		return;
	}
}