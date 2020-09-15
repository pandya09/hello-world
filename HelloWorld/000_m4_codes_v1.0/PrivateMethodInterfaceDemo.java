package module3;


interface Welcomes{  
    default void say() {  
        sayhello();  
    }  
    
    // Private method  
    private void sayhello() {  
        System.out.println("Hello... I'm private method. Welcome to edureka");  
    }  
}  


public class PrivateMethodInterfaceDemo implements Welcomes{

	public static void main(String[] args) {
		Welcomes s = new PrivateMethodInterfaceDemo();  
        s.say();  
	}
}
