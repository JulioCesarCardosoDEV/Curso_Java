package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base = 0, altura = 0;
		
		try {
			System.out.print("Digite a base de um Retangulo: ");
			base = sc.nextDouble();
			System.out.print("Digite a altura de um Retangulo: ");
			altura = sc.nextDouble();
			
			if(base <= 0 || altura <= 0) {
				throw new InputMismatchException();
			}
			
			Retangulo retangulo = new Retangulo(base, altura);
			
			System.out.println("Area do retangulo: " + retangulo.calculaArea());
			
		}catch(InputMismatchException e) {
			System.out.println("Número inválido");
		}
		
		
		
		
		
		
		sc.close();
	}

}
