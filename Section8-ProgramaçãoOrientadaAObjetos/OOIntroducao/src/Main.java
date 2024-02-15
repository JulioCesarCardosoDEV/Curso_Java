import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite 3 lados do triangulo x");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite 3 lados do triangulo y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println("Area tringulo x: " + areaX);
		System.out.println("Area tringulo y: " + areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}else	
			System.out.println("Larger area: Y");
		
		
		
		sc.close();

	}

}
