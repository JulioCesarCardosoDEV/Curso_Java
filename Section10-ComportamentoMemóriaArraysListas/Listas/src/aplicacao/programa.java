package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		list.remove("Anna");
		list.remove(3);
		
		for(String nome : list) {
			System.out.println(nome);
		}
		
		list.removeIf(nome -> nome.charAt(0) == 'M');
		
		for(String nome : list) {
			System.out.println(nome);
		}
		
		System.out.println(list.indexOf("Alex"));
		
		list.add("Anna");
		
		List<String> result = list.stream().filter(nome -> nome.charAt(0) == 'A')
				.collect(Collectors.toList());		
		
		String name = list.stream().filter(nome -> nome.charAt(0) == 'A')
				.findFirst().orElse(null);
		
		for(String nome : result) {
			System.out.println(nome);
		}
		
		System.out.println(name);
		
		sc.close();
	}

}
