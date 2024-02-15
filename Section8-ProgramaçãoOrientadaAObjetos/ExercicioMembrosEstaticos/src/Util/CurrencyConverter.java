package Util;

public class CurrencyConverter {
   
   public static double convertToReais(double preco, double quantidade) {
	   double resultado = preco * quantidade;
	   return resultado * 0.06 + resultado;
   }
}
