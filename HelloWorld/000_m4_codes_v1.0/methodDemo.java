//Method overloading

public class methodDemo {
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }
	public static void main(String args[])
	   {
		
		methodDemo a=new methodDemo();
	       a.area(4,6);
	       a.area(5);  
	   }
}
