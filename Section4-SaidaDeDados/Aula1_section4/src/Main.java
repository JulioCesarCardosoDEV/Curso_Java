import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.print("Olá Mundo!");
		System.out.println("Bom dia!");
		
		int y = 32;
		System.out.println(y);
		
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		System.out.println("Resultado = " + x + " Metros.");
		
		System.out.printf("Resultado = %.2f Metros%n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		// %f = ponto flutuante
		// %d = inteiro
		// %s = texto
		// %n = quebra de linha
		
		/*  System.out.print = Saida de dados na tela mas sem quebra de linha
		 *  System.out.println = Saida de dados com quebra de linha
		 *  System.out.printf = Saida de dados com elementos capturados
		 * 
		 */
		
		
		

	}

}
