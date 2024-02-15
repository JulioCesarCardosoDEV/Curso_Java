package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][]matriz = new int[n][n];
		int contadorNumerosNegativos = 0;
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
				if(matriz[i][j] < 0) {
					contadorNumerosNegativos += 1;
				}
			}
		}
		
		System.out.printf("%nDiagonal principal: %n");
		
		for(int i = 0; i<matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		System.out.println("Números negativos = " + contadorNumerosNegativos);
		
		
		
		sc.close();

	}

}
