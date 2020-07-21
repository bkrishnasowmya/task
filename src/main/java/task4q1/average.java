package task4q1;

import java.awt.List;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import  java.lang.Iterable;
public class average {
public static void main(String args[]) {
		int a[] =new int[] {1,2,3,4,5};
		
		int s = getaverage(a);
		System.out.println(s);
}

private static int getaverage(int[] a) {
	int i,n,s=0;
	n=a.length;
	for(i=0;i<n;i++) {
		s=s+a[i];
	}
	return s/n;
}

	
}
