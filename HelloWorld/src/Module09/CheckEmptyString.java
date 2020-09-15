package Module09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckEmptyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		
		List<String> ans = strings.stream().filter(str->(!str.isEmpty())).collect(Collectors.toList());
		
		System.out.println("Stream with no empty strings: "+ans);
	}

}
