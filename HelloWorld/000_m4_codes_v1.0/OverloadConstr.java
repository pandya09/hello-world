package module3;

class Shop{
	int itemid;
	int price;
	String name;
	
	Shop(int a, int b){
		itemid=a;
		price=b;
		name="XYZ";
		System.out.println(itemid+" "+price+" "+name);
	}
	
	Shop(int i, int p, String n){
		itemid=i;
		price=p;
		name=n;
		System.out.println(itemid+" "+price+" "+name);
	}	
}

public class OverloadConstr {

	public static void main(String[] args) {
		Shop s1=new Shop(1,100);
		Shop s2=new Shop(10,2500,"John");
		
	}
}
