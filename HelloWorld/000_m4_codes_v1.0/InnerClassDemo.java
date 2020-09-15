package module3;

public class InnerClassDemo {
	
	 private String welcome="Welcome to edureka"; 
	 
	 class Inner{  
	  void hello(){System.out.println(welcome+", Happy Learning!");}  
	 }  


	public static void main(String[] args) {
		InnerClassDemo obj=new InnerClassDemo();  
		InnerClassDemo.Inner in=obj.new Inner();  
		  in.hello();  
	}
}
