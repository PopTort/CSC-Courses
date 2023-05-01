
public class Graduate extends StudentApplication{

	private String StudentThesis;
	
	public Graduate(String Fname, String Lname, double Test1, double Test2, String Address, String City, String Phone, String Thesis) {
		super(Fname, Lname, Test1, Test2, Address, City, Phone);
		StudentThesis = Thesis;
	}

	
	public void setThesis(String Thesis) {
		StudentThesis = Thesis;
	}
	
	public String getThesis() {
		return StudentThesis;
	}
	
	
	public double ComputeGrade(double Test1, double Test2) {
		
		double total = 0.5*Test1 + 0.5*Test2;
		return total;
	}
	
}
