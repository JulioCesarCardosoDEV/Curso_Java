package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entidades.Reserva2Ruim;

public class Programa2Ruim {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Número do quarto: ");
		int numero = sc.nextInt();
		System.out.print("Check-in data (dd/mm/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out data (dd/mm/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		if(! checkOut.after(checkIn)) {
			System.out.println("Erro na reserva: Check-out data deve ser depois do Check-in");
		}
		else {
			Reserva2Ruim reserva = new Reserva2Ruim(numero, checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
			System.out.println();
			System.out.println("Entre com a data atualizada: ");
			System.out.print("Check-in data (dd/mm/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out data (dd/mm/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			String erro = reserva.atualizaDatas(checkIn, checkOut);
			if(erro != null) {
				System.out.println("Erro na reserva: " + reserva);
			}
		
		sc.close();

	}

}}
