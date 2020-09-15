package Module06;

import java.util.*;

public class ArrayListCS {

	public static int removeElement(ArrayList<Integer> al, int x) {
		if(al.contains(x)) {
			int p = al.indexOf(x);
			al.remove(p);
			return p;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(23);
		al.add(18);
		al.add(10);
		al.add(11);
		al.add(10);
		System.out.println("Elements of ArrayList: "+al);
		int ind = removeElement(al,10);
		System.out.println("Elements of ArrayList after removing element from index "+ind+" is: "+al);
	}

}
