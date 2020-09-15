package module3;

interface Welcome{ 
	
    // Default method   
    default void say(){  
        System.out.println("Hello, Welcome to edureka");  
   }  
    // Abstract method  
    void hello(String msg);  
}  


public class DEfaultClassInterfaceDemo implements Welcome {
	
	public void hello(String msg){        // implementing abstract method   
        System.out.println(msg);  
    }  

	public static void main(String[] args) {
		
		DEfaultClassInterfaceDemo out = new DEfaultClassInterfaceDemo();  
        out.say();   // calling default method  
        out.hello("Happy Learning");  // calling abstract method  
	}
}
