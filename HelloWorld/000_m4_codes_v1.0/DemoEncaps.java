package module3;


class Employee1{
	private String name;  
	   
	public String getName(){  
	return name;  
	}  
	public void setName(String name){  
	this.name=name; 
	}  
}

public class DemoEncaps {

	public static void main(String[] args) {
		Employee1 e=new Employee1();  
		e.setName("Alex");  
		System.out.println(e.getName());  

	}
}
