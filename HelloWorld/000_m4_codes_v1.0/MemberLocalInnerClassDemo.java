package module3;

public class MemberLocalInnerClassDemo {
	
	private String msg="Welcome to edureka";
	
	 void display(){  
	  class Inner{  
	   void msg(){System.out.println(msg);}  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	public static void main(String[] args) {
		MemberLocalInnerClassDemo ob=new MemberLocalInnerClassDemo();  
		ob.display();  
	}
}
