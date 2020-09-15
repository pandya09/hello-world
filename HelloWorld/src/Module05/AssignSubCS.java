package Module05;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class AssignSubCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\HelloWorld\\src\\Module05\\AssignmentFile.txt");
		try {
			Scanner input = new Scanner(file);
			String question = input.nextLine();
			System.out.println("Question: "+question);
			Scanner s = new Scanner(System.in);
			String answer = s.nextLine();
			
			try {
				PrintWriter output = new PrintWriter("C:\\Users\\Admin\\eclipse-workspace\\HelloWorld\\src\\Module05\\AssignSoln.txt");
				output.println("Answer: "+answer);
				output.close();
			}
			catch(IOException e) {
				System.out.println("Exception is: "+e);
			}
			input.close();
			s.close();
		}
		catch(FileNotFoundException e){
			System.out.println("Exception is: "+e);
		}
	}

}
