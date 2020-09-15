package Module09;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class MapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> names = Stream.of("aBc","d","ef");
		
//		System.out.println("Original stream: "+names.collect(Collectors.toList()));		
		System.out.print("Stream after converting strings into upper case is: ");
		
		List<String> ans = names.map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(ans);
	}

}
