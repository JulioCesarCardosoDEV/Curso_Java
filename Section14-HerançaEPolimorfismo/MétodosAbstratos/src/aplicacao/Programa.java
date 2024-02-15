package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import entidades.enums.Color;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Forma>listaDeFormas = new ArrayList<>();
		
		System.out.print("Entre com o número de formas: ");
		int quantidadeDeFormas = sc.nextInt();
		
		for(int i=0; i<quantidadeDeFormas; i++) {
			System.out.println("Entre com a forma #" + (i + 1) + ": ");
			System.out.print("Retangulo ou Circulo (r/c)? ");
			char escolhaDaForma = sc.next().charAt(0);
			System.out.print("Cor (preto, azul, vermelho): ");
			Color cor = Color.valueOf(sc.next());
			if(escolhaDaForma == 'r' || escolhaDaForma == 'R') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				System.out.print("Altura");
				double altura = sc.nextDouble();
				
				listaDeFormas.add(new Retangulo(cor, largura, altura));
			}else {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				listaDeFormas.add(new Circulo(cor, raio));
			}
		}
		
		System.out.println();
		System.out.println("Areas: ");
		
		for(Forma forma : listaDeFormas) {
			System.out.println(String.format("%.2f", forma.area()));
		}
		
		
		
		
		sc.close();

	}

}
