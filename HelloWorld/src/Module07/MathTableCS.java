package Module07;

import java.util.Scanner;

class Thread1 extends Thread{
	MathTableCS t;
	int n;
	Thread1(MathTableCS t, int n){
		this.t = t;
		this.n = n;
	}
	
	
	public void run() {
		t.printTable(n);
	}
}

public class MathTableCS {

		synchronized void printTable(int n) {
			for(int i=1;i<=10;i++) {
				System.out.println(n+" * "+i+" = "+n*i);
				try {
					Thread.sleep(400);
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n;
		System.out.print("Enter the number whose table you want: ");
		n = s.nextInt();
		MathTableCS mth = new MathTableCS();
		Thread1 t = new Thread1(mth,n);
		t.start();
		s.close();
	}

}
