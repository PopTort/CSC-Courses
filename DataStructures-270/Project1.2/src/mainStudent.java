import java.io.*;
import java.util.*;

public class mainStudent{
	private String studentID;
	private String name;
	private int quiz1;
	private int quiz2;
	private int midterm;
	private int finalexam;
	private double avg;
	private String grade;
	
	
	public mainStudent ()
	{
		this.studentID = "na";
		this.name = "na";
		this.quiz1 = 0;
		this.quiz2 = 0;
		this.midterm = 0;
		this.finalexam = 0;
		this.avg = 0.0;
		this.grade = "na";
		
	}
	
	public mainStudent (String id, String n, int q1, int q2, int m, int f)
	{
		id = studentID;
		n = name;
		q1 = quiz1;
		q2 = quiz2;
		m = midterm;
		f = finalexam;
		
	}
	public mainStudent (String id, String n, int q1, int q2, int m, int f, double a, String letterGrade)
	{
		id = studentID;
		n = name;
		q1 = quiz1;
		q2 = quiz2;
		m = midterm;
		f = finalexam;
		a = avg;
		letterGrade = grade;
		
	}
	
	public void set(String id, String n, int q1, int q2, int m, int f, double a, String g)
	{
		studentID = id;
		name = n;
		quiz1 = q1;
		quiz2 = q2;
		midterm = m;
		finalexam = f;
		avg = a;
		grade = g;
		
	}
	
	public double calcAvg(int q1, int q2, int m, int f)
	{
		
		double q1Final = ((q1*100)/10);
		double q2Final = ((q2*100/10));
		
		avg = (((q1Final*12.5)+(q2Final*12.5)+(m*25)+(f*50))/100);
		return avg;
	}
	
	public String calcGrade()
	{
		if (avg < 60) {
			grade = "F";
		}
		if (avg >= 60) {
			grade = "D";
		}
		if (avg >= 70) {
			grade = "C";
		}
		if (avg >= 80) {
			grade = "B";
		}
		if (avg >= 90) {
			grade = "A";
		}
		return grade;
	}
	
	public String getID()
	{
		return studentID;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getQuiz1()
	{
		return quiz1;
	}
	
	public int getQuiz2()
	{
		return quiz2;
	}
	
	public int getMidterm()
	{
		return midterm;
	}
	
	public int getFinalexam()
	{
		return finalexam;
	}
	
	
	public double getAvg()
	{
		return avg;
	}
	
	public String getGrade()
	{
		return grade;
	}
	
	
	
}
