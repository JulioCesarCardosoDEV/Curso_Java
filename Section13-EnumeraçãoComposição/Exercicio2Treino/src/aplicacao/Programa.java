package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.ContratoComHoras;
import entidades.Departamento;
import entidades.Funcionario;
import entidades.enums.NivelDoTrabalhador;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do departamento: ");
		String nomeDoDepartamento = sc.nextLine();
		System.out.println("Entre com os dados do funcionário: ");
		System.out.print("Nome: ");
		String nomeDoFuncionario = sc.nextLine();
		System.out.print("Nivel: ");
		String nivelDoFuncionario = sc.nextLine();
		System.out.print("Salário Base: ");
		double salarioBase = sc.nextDouble();
		
		Funcionario funcionario = new Funcionario(nomeDoFuncionario, NivelDoTrabalhador.valueOf(nivelDoFuncionario), salarioBase, new Departamento(nomeDoDepartamento));
		
		System.out.print("Quantos contratos tem esse funcionário: ");
		int quantidadeDeContratos = sc.nextInt();
		
		for(int i = 0; i<quantidadeDeContratos; i++) {
			System.out.println("Entre com os dados do #" + (i+1) + " contrato: ");
			System.out.print("Data (DD/MM/YYYY): ");
			Date data = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração em horas: ");
			int horas = sc.nextInt();
			
			ContratoComHoras contrato = new ContratoComHoras(data, valorPorHora, horas);
			funcionario.adicionarContrato(contrato);
		}
		
		System.out.println();
		System.out.print("Entre com mes e ano que deseja calcular (MM/YYYY): ");
		String mesEano = sc.next();
		int mes = Integer.parseInt(mesEano.substring(0, 2));
		int ano = Integer.parseInt(mesEano.substring(3));
		
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
		System.out.println("Renda em " + mesEano + ": " + funcionario.rendaTotal(ano, mes));
		
		sc.close();

	}

}
