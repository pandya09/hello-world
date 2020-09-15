package module3;

import java.util.Calendar;

public class CalendarClassDemo {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();  
		   System.out.println("Current date is : " + calendar.getTime());  
		   calendar.add(Calendar.DATE, -28);  
		   System.out.println("28 days ago : " + calendar.getTime());  	   
	}
}
