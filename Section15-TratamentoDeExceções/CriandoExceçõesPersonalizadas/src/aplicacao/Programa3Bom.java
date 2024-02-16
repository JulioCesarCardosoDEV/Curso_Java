package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entidades.Reserva3Boa;
import model.exceptions.DomainException;

public class Programa3Bom {

	public static void main(String[] args){
		try {
			Scanner sc = new Scanner(System.in);

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			System.out.print("Número do quarto: ");
			int numero = sc.nextInt();
			System.out.print("Check-in data (dd/mm/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out data (dd/mm/yyyy): ");
			Date checkOut = sdf.parse(sc.next());

			Reserva3Boa reserva = new Reserva3Boa(numero, checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
			System.out.println();
			System.out.println("Entre com a data atualizada: ");
			System.out.print("Check-in data (dd/mm/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out data (dd/mm/yyyy): ");
			checkOut = sdf.parse(sc.next());

			reserva.atualizaDatas(checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
		}
		catch(ParseException e) {
			System.out.println("Data inválida");
		}
		catch(DomainException e) {
			System.out.println("Erro na reseva: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Erro");
		}


	}
}

