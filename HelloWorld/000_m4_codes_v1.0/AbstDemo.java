package module3;

abstract class Mobile{  
	
	   Mobile(){System.out.println("Mobile is the base class");}  
	   abstract void run();  
	   void dialNumber(){System.out.println("Numbers are dialed from Nokia mobile");}  
	 }  
	  
	 class Nokia extends Mobile{  
	 void run(){System.out.println("Nokia is the derived class");}  
	 }  


public class AbstDemo {

	public static void main(String[] args) {
		
		Mobile obj = new Nokia();  
		  obj.run();  
		  obj.dialNumber(); 
	}

}

