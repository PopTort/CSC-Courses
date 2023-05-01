import java.util.Scanner;
public class StudentApplication {
	
	private String FirstName;
	private String LastName;
	private double TestOne;
	private double TestTwo;
	private String StreetAddress;
	private String CityName;
	private String PhoneNumber;
	
	public StudentApplication(String Fname, String Lname, double Test1, double Test2, String Address, String City, String Phone) {
		
		FirstName = Fname;
		LastName = Lname;
		TestOne = Test1;
		TestTwo = Test2;
		StreetAddress = Address;
		CityName = City;
		PhoneNumber = Phone;
		}
// ------------------------------------------
	public void setFirstName(String Fname) {
		FirstName = Fname;
	}
	public void setLastName(String Lname) {
		LastName = Lname;
	}
	public void setTest1(double Test1) {
		TestOne = Test1;
	}
	public void setTest2(double Test2) {
		TestTwo = Test2;
	}
	public void setAddress(String Address) {
		StreetAddress = Address;
	}
	public void setCity(String City) {
		CityName = City;
	}
	public void setPhone(String Phone) {
		PhoneNumber = Phone;
	}
// -----------------------------------------
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public double getTest1() {
		return TestOne;
	}
	public double getTest2() {
		return TestTwo;
	}
	public String getAddress() {
		return StreetAddress;
	}
	public String getCity() {
		return CityName;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Type in number corellating to your status: \n [1] Undergraduate \n [2] Graduate \n [3] Part Time");
		int x = input.nextInt();
		System.out.print("Enter your First Name: ");
		String FirstName = input.next();
		System.out.print("Enter your Last Name: ");
		String LastName = input.next();
		System.out.print("Enter in Grade for First Test: ");
		double Test1 = input.nextDouble();
		System.out.print("Enter in Grade for Second Test: ");
		double Test2 = input.nextDouble();
		System.out.print("Enter in Street Address: ");
		String Addy = input.next();
		System.out.print("Enter in City Name: ");
		String City = input.next();
		System.out.print("Enter in Phone Number: ");
		String Number = input.next();
		
		
		
		// Undergrad
		if(x==1) {
			System.out.print("Enter in your Student ID: ");
			int sID = input.nextInt();
			Undergraduate currentStudent = new Undergraduate(FirstName, LastName, Test1, Test2, Addy, City, Number, sID);
			currentStudent.setFirstName(FirstName);
			currentStudent.setLastName(LastName);
			currentStudent.setTest1(Test1);
			currentStudent.setTest2(Test2);
			currentStudent.setAddress(Addy);
			currentStudent.setCity(City);
			currentStudent.setPhone(Number);
			currentStudent.setStudentID(sID);
			
			
	
			System.out.println("Here is your current Information:");
			System.out.print("First Name: " + currentStudent.getFirstName() + "\n Last Name: " + currentStudent.getLastName() + "\n Test Score 1: " + currentStudent.getTest1() +
			"\n Test Score 2: " + currentStudent.getTest2() + "\n Grade Total: " + currentStudent.ComputeGrade(Test1, Test2) + 
			"\n Street Address: " + currentStudent.getAddress() + "\n City Name: " + currentStudent.getCity() + "\n Phone Number: " +
			currentStudent.getPhoneNumber() + "\n Student ID: " + currentStudent.getStudentID());
			
			
			
		}
		// Graduate
		if(x==2) {
			System.out.print("Enter in your Thesis here: ");
			String thesis = input.next();
			Graduate graduated = new Graduate(FirstName, LastName, Test1, Test2, Addy, City, Number, thesis);
			graduated.setFirstName(FirstName);
			graduated.setLastName(LastName);
			graduated.setTest1(Test1);
			graduated.setTest2(Test2);
			graduated.setAddress(Addy);
			graduated.setCity(City);
			graduated.setPhone(Number);
			graduated.setThesis(thesis);

			System.out.println("Here is your current Information:");
			System.out.print("First Name: " + graduated.getFirstName() + "\n Last Name: " + graduated.getLastName() + "\n Test Score 1: " + graduated.getTest1() +
			"\n Test Score 2: " + graduated.getTest2() + "\n Grade Total: " + graduated.ComputeGrade(Test1, Test2) + "\n Street Address: " + graduated.getAddress() + 
			"\n City Name: " + graduated.getCity() + "\n Phone Number: " + graduated.getPhoneNumber() + "\n Student Thesis: " + graduated.getThesis());
			
		}
		// Part Time
		if(x==3) {
			System.out.print("Enter in your Social Security Number: ");
			String SSN = input.next();
			PartTime partTimer = new PartTime(FirstName, LastName, Test1, Test2, Addy, City, Number, SSN);
			partTimer.setFirstName(FirstName);
			partTimer.setLastName(LastName);
			partTimer.setTest1(Test1);
			partTimer.setTest2(Test2);
			partTimer.setAddress(Addy);
			partTimer.setCity(City);
			partTimer.setPhone(Number);
			partTimer.setSSN(SSN);
			
			System.out.println("Here is your current Information:");
			System.out.print("First Name: " + partTimer.getFirstName() + "\n Last Name: " + partTimer.getLastName() + "\n Test Score 1: " + partTimer.getTest1() +
			"\n Test Score 2: " + partTimer.getTest2() + "\n Grade Total: " + partTimer.ComputeGrade(Test1, Test2) +  "\n Street Address: " + 
			partTimer.getAddress() + "\n City Name: " + partTimer.getCity() + "\n Phone Number: " + partTimer.getPhoneNumber() + "\n Social Security Number: " + partTimer.getSSN());
		}
			
			
			
		
		
		
		
	}

}




