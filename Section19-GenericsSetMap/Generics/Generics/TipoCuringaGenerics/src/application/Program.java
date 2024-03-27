package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// list ? é o curinga 
		List<Integer> myInts =  Arrays.asList(5, 2, 10);
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myInts);
		printList(myStrs);
	}
	
	public static void printList(List<?> list) {
		// nao se pode utilizar list.add na lista <?>
		for(Object obj : list) {
			System.out.println(obj);
		}
	}

}
