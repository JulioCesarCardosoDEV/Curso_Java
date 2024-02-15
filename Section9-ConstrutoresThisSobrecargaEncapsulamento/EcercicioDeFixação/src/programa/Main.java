package programa;

import java.util.Locale;
import java.util.Scanner;
import Entidades.Conta;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o número da conta: ");
        int numeroDaConta = sc.nextInt();
        System.out.print("Entre com o titular da conta: ");
        sc.nextLine();
        String nomeTitularConta = sc.nextLine();
        System.out.print("A conta possui um depósito inicial (s/n)? ");
        char response = sc.next().charAt(0);
        
        Conta conta;
        
        if (response == 's') {
            System.out.print("Digite a quantidade do depósito: ");
            double quantidadeDeposito = sc.nextDouble();
            conta = new Conta(numeroDaConta, nomeTitularConta, quantidadeDeposito);
        } else {
            conta = new Conta(numeroDaConta, nomeTitularConta);
        }
        
        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);
        System.out.println();
        
        System.out.print("Entre com o valor do depósito adicional: ");
        double depositoAdicional = sc.nextDouble();
        conta.realizaDeposito(depositoAdicional);
        
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);
        
        System.out.println();
        System.out.print("Entre com o valor do saque: ");
        double saqueAdicional = sc.nextDouble();
        conta.realizarSaque(saqueAdicional);
        
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);

        sc.close();
    }
}
