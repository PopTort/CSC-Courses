import java.io.*;
import java.util.*;

public class readWriteFile extends mainStudent{
	
	private Scanner x;
	private int numberOfStudents;
	private mainStudent[] myclass =new mainStudent[20];
	
	public void openFile() {
		try {
			x=new Scanner(new File("src/input.txt"));
		}
		catch (Exception e) {
			System.out.println("Could not find file!");
		}
		
	}
	
	// Read data from a file
	public void readFile() {
		numberOfStudents=x.nextInt();
		
		for (int i=0; i<numberOfStudents; i++) {
			String a=x.next();
			String b=x.next();
			int c=x.nextInt();
			int d=x.nextInt();
			int e=x.nextInt();
			int f=x.nextInt();
			
			
			myclass[i]=new mainStudent(a, b, c, d, e, f);
			
			mainStudent temp = new mainStudent();
			
			myclass[i].set(a, b, c, d, e, f, temp.calcAvg(c,d,e,f), temp.calcGrade());

		}
	}
	
	public void closeFile() {
		x.close();
	}
	
	// Write data to a file
	public void writeFile() {
	
	    FileWriter fw= null;
	    File file =null;
	    try {
	        file=new File("src/output.txt");
	        if(!file.exists()) {
	            file.createNewFile();
	        }
	        fw = new FileWriter(file);
	        
	        fw.write("ID\t"
        			+"Name\t"
        			+"Quiz1\t"
        			+"Quiz2\t"
        			+"Midterm\t"
        			+"Final\t"
        			+"Avg.\t"
        			+"Grade\t");

	        fw.write("\r\n"); //write to a new line
	        
	        for (int i=0; i<numberOfStudents; i++) {
	        
	        	fw.write(myclass[i].getID()+"\t"
	        			+myclass[i].getName()+"\t"
	        			+myclass[i].getQuiz1()+"\t"
	        			+myclass[i].getQuiz2()+"\t"
	        			+myclass[i].getMidterm()+"\t"
	        			+myclass[i].getFinalexam()+"\t"
	        			+myclass[i].getAvg()+"\t"
	        			+myclass[i].getGrade()+ "\t");
	        	fw.write("\r\n"); //write to a new line
	        }
	        
	        fw.flush();
	        fw.close();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
	    
	    System.out.printf("The output file is located at %s%n", file.getAbsolutePath());
	}
	
	
	public static void main(String [] args) {
		
		readWriteFile r=new readWriteFile();
		r.openFile();
		r.readFile();
		r.closeFile();
		r.writeFile();
		
	}
}