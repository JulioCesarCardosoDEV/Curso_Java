package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int students = sc.nextInt();
		for(int i = 0; i < students; i++) {
			a.add(sc.nextInt());
		}
		
		System.out.print("How many students for course B? ");
		students = sc.nextInt();
		for(int i = 0; i < students; i++) {
			b.add(sc.nextInt());
		}
		
		System.out.print("How many students for course C? ");
		students = sc.nextInt();
		for(int i = 0; i < students; i++) {
			c.add(sc.nextInt());
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total students: " + total.size());
		sc.close();
	}

}
