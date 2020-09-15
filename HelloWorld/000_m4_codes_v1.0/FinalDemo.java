package module3;

class Vehicless{  
	  final void run(){System.out.println("Vehicle is running");}  
	}  
	     
	class Bus extends Vehicless{  
	   void run(){System.out.println("Bus is running safely with 100kmph");}  

public class FinalDemo {

	public static void main(String[] args) {
		 Bus bus= new Bus();  
		   bus.run();  
	}
}
