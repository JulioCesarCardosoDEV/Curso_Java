package Util;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dollar price: ");
        double precoDollar = sc.nextDouble();
        System.out.print("Enter the amount in dollars: ");
        double quantidadeDollar = sc.nextDouble();

        double resultado = CurrencyConverter.convertToReais(precoDollar, quantidadeDollar);

        System.out.printf("Amount to be paid in reais = %.2f", resultado);

        sc.close();
    }
}
