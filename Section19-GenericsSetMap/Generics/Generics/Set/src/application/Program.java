package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		 Set<String> set = new LinkedHashSet<>();
		 Set<String> set1 = new TreeSet<>();
		 Set<String> set2 = new HashSet<>();
		 
		 set.add("TV");
		 set.add("Tablet");
		 set.add("Notebook");
		 
		 set.removeIf(x -> x.length() >= 3);
		 
		 for(String p : set) {
			 System.out.println(p);
		 }
	}

}
