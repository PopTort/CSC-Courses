
//Name of READ and WRITE files have to be the same as the file.

import java.io.*;
import java.util.*;

public class Main {
	public static void main (String [] args) throws IOException {
		
		// Get File names & amount of lines from user
		Scanner input = new Scanner (System.in);
		System.out.println("Enter name of READ file: (Exclude .txt) ");
		String ReadFile = input.next();
		
		System.out.println("\n"+"Enter name of WRITE file: (Exclude .txt)  ");
		String WriteFile = input.next();
		
		System.out.println("\n"+"How many lines do you want to copy?");
		int Lines = input.nextInt();
		
		
		//load up READ file
		File RFile = new File(ReadFile+".txt");
		Scanner inputFile = new Scanner (RFile);
		
		//Prepare write file
		FileWriter WFile = new FileWriter(WriteFile+".txt");
		PrintWriter outFile = new PrintWriter(WFile);
		
		
		//Copy Lines - Finishes if 
		for(int x = 1; x <= Lines;x++) {
			if(inputFile.hasNext()) {
				String str = inputFile.nextLine();
				outFile.println(str.toUpperCase());
			} else {
				System.out.println("No more lines to Print!..");
			}
		}
			
			
		//Close file 
		outFile.close();
		System.out.println("Finished!");

	}

}
