package task4q1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class q2 {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "bcdg", "bcd", "hjik", "jk","ant","appl","app");
		List<String> filtered = strList.stream().filter(x -> x.startsWith("a")).collect(Collectors.toList());
		List<String> result= filtered.stream() .filter(x -> x.length()== 3) .collect(Collectors.toList());
		System.out.println(result);
		

		
	}

}
