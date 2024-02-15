import java.util.Scanner;
import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		
		double z;
		z = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n", z);
		
		char a;
		a = sc.next().charAt(0);
		System.out.println(a);
		
		String b;
		b = sc.next();
		
		int c;
		c = sc.nextInt();
		
		double d;
		d = sc.nextDouble();
		
		System.out.println("Dados digitados:");
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		sc.close();

	}

}
