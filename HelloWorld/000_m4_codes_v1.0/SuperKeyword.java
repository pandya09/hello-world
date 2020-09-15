package module3;

class Vehicles11{  
String wheels="Vehicle moves because of wheels";  
} 


class Truck extends Vehicles11{  
	String wheels="Truck has 4 wheels";  
	void printWheel(){  
		System.out.println(wheels);//prints color of Bike class  
		System.out.println(super.wheels);//prints color of Vehicle class  
	}  
}  

public class SuperKeyword {
	public static void main(String[] args) {
		Truck b=new Truck();  
		b.printWheel();  
	}
}
