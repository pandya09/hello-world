package Module05;

import java.util.Scanner;
import java.util.regex.*;

public class RegExCS {
	
	public static boolean isValid(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false;
		return pat.matcher(email).matches();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the email id: ");
		String email = s.next();
		if(isValid(email))
			System.out.println("Entered email is VALID!!");
		else
			System.out.println("Entered email is INVALID!!");
		s.close();
	}

}
