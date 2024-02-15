package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o tamanho vertical da matriz: ");
		int valorVerticalMatriz = sc.nextInt();
		System.out.print("Entre com o tamanho horizontal da matriz: ");
		int valorHorizontalMatriz = sc.nextInt();
		int[][]matriz = new int [valorVerticalMatriz][valorHorizontalMatriz]; 
		int controlaValorEscolhido = 1;
		
		System.out.println("Digite os valores: ");
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.print("Digite um valor digitado: ");
		int valorEscolhido = sc.nextInt();
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				if(matriz[i][j] == valorEscolhido) {
					System.out.println();
					System.out.println("Posição: " + i + "," + j);
					controlaValorEscolhido -= 1;
					
					if(j > 0) {
						System.out.println("Esquerda: " + matriz[i][j -1]);
					}
					
					if(i > 0) {
						System.out.println("Cima: " + matriz[i-1][j]);
					}
					
					if(j < matriz.length - 1) {
						System.out.println("Direita: " + matriz[i][j + 1]);
					}
					
					if(i < matriz.length - 1) {
						System.out.println("Baixo: " + matriz[i + 1][j]);
					}
				}
			}
		}
		sc.close();
	}

}
