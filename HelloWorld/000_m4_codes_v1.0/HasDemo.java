package module3;

class Name{
	String first, last;
	
	 public Name(String first, String last)
	{
		this.first=first;
		this.last=last;
	}
}

class EmployeeInfo{
	int id;
	Name name;
	
	EmployeeInfo(int id, Name name)
	{
		this.id=id;
		this.name=name;
	}
	
	void display() {
		System.out.println("Employee id is "+id);
		System.out.println("Name of Employee " +name.first+" "+name.last);
	}
}

public class HasDemo {

	public static void main(String[] args) {
		Name name=new Name("Alex","Desouza");
		EmployeeInfo ei=new EmployeeInfo(1,name);
		ei.display();
		

	}

}
