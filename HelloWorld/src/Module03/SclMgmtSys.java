package Module03;

import java.util.Scanner;

public class SclMgmtSys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String fm = new String();
		System.out.println("Enter the first name: ");
		fm = s.nextLine();
		String lm = new String();
		System.out.println("Enter the last name: ");
		lm = s.nextLine();
		String bd = new String();
		System.out.println("Enter the birthdate:[DD/MM/YYYY] ");
		bd = s.nextLine();
		String res = "";
		res = res.concat(fm.substring(0, 1).toUpperCase()).concat(lm.substring(0, 1).toUpperCase()).concat(bd.substring(0, 2));
		if(res.charAt(3)=='/') {
			String x = Character.toString(res.charAt(2));
			res = res.substring(0,2);
			res = res.concat("0").concat(x);
		}
		System.out.println("The student ID is: "+res);
	}

}
