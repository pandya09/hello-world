package module3;

class Vehicle3{  
void move(){System.out.println("Vehicle is moving");}  
}  
class Bikes extends Vehicle3{  
void changeGear(){System.out.println("Bike has 2 wheels");}  
}  
class Cars extends Vehicle3{  
void run(){System.out.println("Car has 4 wheels, so it can get motion to run");}  
}  

public class HierInheritance {
	public static void main(String[] args) {
		Cars c=new Cars();  
		c.run();  
		c.move();  
	}
}
