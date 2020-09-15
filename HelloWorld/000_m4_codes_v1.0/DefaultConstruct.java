package module3;

class StudentInfo{
	int roll;
	String name;
	
	void display() {
		System.out.println(roll+" "+name);
	}
}

public class DefaultConstruct {

	public static void main(String[] args) {
		
		StudentInfo s1=new StudentInfo();
		StudentInfo s2=new StudentInfo();
		
		s1.display();
		s2.display();
		
	}
}
