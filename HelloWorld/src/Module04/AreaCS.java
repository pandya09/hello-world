package Module04;

import java.util.Scanner;

class Area{
	float area;
	
	void calcArea(float r) {
		area = (float) (Math.PI*r*r);
		System.out.println("Area of circle is: "+area);
	}
	
	void calcArea(int l) {
		area = (float) Math.pow(l, 2);
		System.out.println("Area of square is: "+area);
	}
	
	void calcArea(float l, float b) {
		area = (float) (l*b);
		System.out.println("Area of rectangle is: "+area);
	}
}

public class AreaCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while(true) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the shape to find the area:\n1. Circle\n2. Square\n3. Rectangle");
			int ch = 0;
			ch = s.nextInt();
//			if(s.hasNext())
//				ch = s.nextInt();
			switch(ch) {
			case 1: Area circ = new Area();
					System.out.println("Enter the radius:");
					float r = s.nextFloat();
					circ.calcArea(r); break;
			case 2: Area sqr = new Area();
					System.out.println("Enter the length:");
					int l = s.nextInt();
					sqr.calcArea(l); break;
			case 3: Area rect = new Area();
					System.out.println("Enter the length:");
					float len = s.nextFloat();
					System.out.println("Enter the breadth:");
					float bth = s.nextFloat();
					rect.calcArea(len, bth); break;
//			case 4: break;
			default: System.out.println("Choose correct option!");
			}
			s.close();
//		}
	}

}
