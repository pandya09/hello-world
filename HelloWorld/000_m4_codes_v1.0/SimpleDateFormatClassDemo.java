package module3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatClassDemo {

	public static void main(String[] args) {
		Date current = new Date();  
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
	    String out= sdf.format(current);  
	    System.out.println("Current date is: "+out);  
	    
	    sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
	    out = sdf.format(current);  
	    System.out.println("Date with dd-M-yyyy hh:mm:ss format: "+out);  
	}
}
