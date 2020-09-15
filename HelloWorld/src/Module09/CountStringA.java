package Module09;

import java.util.Arrays;
import java.util.List;

class Area{
	int a;
	int ar = a*a;
}

public class CountStringA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> members = Arrays.asList("Abish", "Bhargavi", "Alex", "Max", "Annie");
		
		long count = members.stream().filter(x->x.startsWith("A")).count();
		
		System.out.printf("Stream %s has %d strings starting with 'A'!",members,count);
	
//		System.out.println(args[2]);
//		
//		int a=2; int b=5; if(a!=6 && b/0==1){ System.out.print(a);}
	}

}
