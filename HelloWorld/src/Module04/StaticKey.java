package Module04;

class Employees{
	int id;
	int salary;
	static String company="SRT Traders";
	
static void check() {
	company="WIIT";
}
	
	Employees(int i, int s){
		id=i;
		salary=s;	
	}
	
	void display() {
		System.out.println(id+" "+salary+" "+company);
	}
}

public class StaticKey {
	public static void main(String[] args) {
	
Employees e1=new Employees(25,25000);

Employees e2=new Employees(30,3000);
e1.display();
Employees.check();
e2.display();
	}
}