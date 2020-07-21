package task4q1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class q3 {
	public static void main(String[] args) {
	
		List<String> strList = Arrays.asList("abcba", "madam", "ranks", "mannam", "jk","amma","appl","app");
		Predicate<String> p = (s)->{int length = s.length();  
		   String  reverse = "";
		      for ( int i = length - 1; i >= 0; i-- )  
		         reverse = reverse + s.charAt(i);
		     
		      if (s.equals(reverse))
		    	  return true;
		      else
		    	  return false;};
		for(String s:strList) {
			if(p.test(s))
				System.out.println(s);
		}
	}
}


