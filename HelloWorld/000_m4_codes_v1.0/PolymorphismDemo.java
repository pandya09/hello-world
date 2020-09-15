package module3;

class Man{  
void pay(){System.out.println("Paying bill");}  
}  

class Millionare extends Man{  
void pay(){System.out.println("Millionare is paying bill and giving tip also");
}  
}

public class PolymorphismDemo {
	public static void main(String[] args) {
		Millionare obj = new Millionare();  
		obj.pay();
	}
}
