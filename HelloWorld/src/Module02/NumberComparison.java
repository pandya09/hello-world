package Module02;

import java.util.*;


public class NumberComparison {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int m,b;
		System.out.print("Enter number for Michael: ");
		m = s.nextInt();
		System.out.println();
		System.out.print("Enter number for Bruce: ");
		b = s.nextInt();
		System.out.println();
		if(m>b) {
			System.out.println("Michael wins the girl!");
		}
		else if(m==b) {
			System.out.println("No one wins!");
		}
		else {
			System.out.println("Bruce wins the girl!");
		}
	}
}