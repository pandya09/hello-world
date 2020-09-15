package module3;

final class Bikes{}

class Cycle extends Bikes{  
	  void changeGear(){System.out.println("running safely with 100kmph");
	 }  
 }
	  
	  
public class FinalKeyDemo {
	public static void main(String[] args) {
		Cycle c= new Cycle();  
		c.changeGear(); 
	}
}
