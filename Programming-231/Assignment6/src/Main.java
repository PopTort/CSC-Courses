import java.util.*;
public class Main {
	public static void main (String [] args) {
		
		//Getting array for student Names
		Scanner input = new Scanner (System.in);
		String[] studentNames = new String[5];
		for (int i = 0; i <=4; i++) {
			System.out.println("Enter students name: ");
			studentNames[i] = input.next();
			
		}
		//Setting student grades because lazy
		double[][] StudentGrades = {{60,90,90,40},{50,70,60,70},{90,80,10,70},{60,50,50,80},{60,90,90,80}};
		double sumGrades = 0;
		
		
		//inializing Letter grades array
		char[] LetterGrades = new char[5];
		
		//Determining what letter grade, and assigning to LetterGrades array
		for (int w = 0; w <=4;w++) {
			for (int y = 0; y <=3;y++) {
				sumGrades = sumGrades + StudentGrades[w][y];
			}
				sumGrades = sumGrades / 4;
				if(sumGrades >= 90) {
					LetterGrades[w] = 'A';
				} else if (sumGrades >=80) {
					LetterGrades[w] = 'B';
				} else if (sumGrades >=70) {
					LetterGrades[w] = 'C';
				} else if (sumGrades >= 60) {
					LetterGrades[w] = 'D';
				} else if (sumGrades >= 0) { 
					LetterGrades[w] = 'F';
				}
				
				sumGrades = 0;	
		}
		
		//Printing out final results
		for(int x = 0; x <=4;x++) { 
			System.out.println(studentNames[x] + " - " + LetterGrades[x]);
		}
		
	
	}
}
