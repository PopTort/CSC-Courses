
public class Undergraduate extends StudentApplication {
	
	private int sID;

	public Undergraduate(String Fname, String Lname, double Test1, double Test2, String Address, String City,
			String Phone, int StudentID) {
		super(Fname, Lname, Test1, Test2, Address, City, Phone);
		
		sID = StudentID;
		
	}
	
	
	public void setStudentID(int StudentID) {
		sID = StudentID;
	}
	
	
	public int getStudentID() {
		return sID;
	}
	
	
	public double ComputeGrade(double Test1, double Test2) {
		
		double total = 0.4*Test1 + 0.6*Test2;
		return total;
	}
	

}
