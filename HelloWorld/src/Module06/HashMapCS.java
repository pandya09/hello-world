package Module06;

import java.util.*;

public class HashMapCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		hmap.put(101, "Ram");
		hmap.put(105,"Lakshman");
		hmap.put(103, "Bharat");
		hmap.put(108, "Shatrughna");
		ArrayList<Integer> alKey = new ArrayList<Integer>();
		ArrayList<String> alValue = new ArrayList<String>();
		for(HashMap.Entry<Integer, String> m:hmap.entrySet()) {
			alKey.add(m.getKey());
			alValue.add(m.getValue());
		}
		System.out.println("Keys associated with map: "+alKey);
		System.out.println("Values associated with map: "+alValue);
		Iterator<Integer> itr1 = alKey.iterator();
		Iterator<String> itr2 =  alValue.iterator();
		while(itr1.hasNext() || itr2.hasNext()) {
			System.out.println(itr1.next()+" ---> "+itr2.next());
		}
	}

}
