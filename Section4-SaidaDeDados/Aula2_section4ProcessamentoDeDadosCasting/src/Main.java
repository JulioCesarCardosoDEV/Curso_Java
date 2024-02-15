
public class Main {

	public static void main(String[] args) {
		
		int x, y;
		double z;
		
		x = 5;
		
		y = 4 * x;
		
		z = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		// Calculo da area de um trapézio
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B)/ 2.0 * h;
		
		System.out.println(area);
		
		// Soma de duas variaveis diferentes
		
		int n1, n2;
		double resultado;
		
		n1 = 5;
		n2 = 2;
		resultado = (double) n1 / n2;
		// castig = (double) antes da expressao, converte os valores.
		
		System.out.println(resultado);
		
		// Utilização do casting novamente
		
		double numero;
		int outroNumero;
		
		numero = 5.0;
		outroNumero = (int) numero;
		
		System.out.println(outroNumero);
		
		

	}

}
