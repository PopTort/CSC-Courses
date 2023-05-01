
public class PartTime extends StudentApplication {

	private String SocialSecurityNumber;
	public PartTime(String Fname, String Lname, double Test1, double Test2, String Address, String City, String Phone, String SSN) {
		super(Fname, Lname, Test1, Test2, Address, City, Phone);
		SocialSecurityNumber = SSN;
	}

	
	public void setSSN(String SSN) {
		SocialSecurityNumber = SSN;
	}
	
	public String getSSN() {
		return SocialSecurityNumber;
	}
	
	
	public double ComputeGrade(double Test1, double Test2) {
		
		double total = 0.3*Test1 + 0.7*Test2;
		return total;
	}
}
