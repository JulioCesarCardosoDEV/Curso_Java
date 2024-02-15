package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static double PI = 3.14159; // Estático.
	// Constante = public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = circuferencia(raio);
		
		double v = volume(raio);
		
		System.out.printf("Circuferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Circuferencia: %.2f%n", PI);
		
		sc.close();

	}
	
	public static double circuferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4 * PI * raio * raio * raio / 3;
	}

}
