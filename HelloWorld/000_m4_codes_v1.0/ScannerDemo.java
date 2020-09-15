package module3;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
	     
		   System.out.println("Enter firstname");  
		   String first=sc.next();  
		   System.out.println("Enter lastname");  
		   String last=sc.next();  
		    
		   System.out.println("Firstname:"+first+" Lastname:"+last);  
		   sc.close();  
	}
}
