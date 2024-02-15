package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class calculosDataHora {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:30");
		Instant d03 = Instant.parse("2022-07-20T01:30:30Z");
		
		LocalDate semanaPassadaDate = d01.minusDays(7);
		LocalDate proximaSemanaDate = d01.plusDays(7);
		
		System.out.println("Semana passada = " + semanaPassadaDate);
		System.out.println("Semana que vem = " + proximaSemanaDate);
		
		LocalDateTime semanaPassadaDateTime = d02.minusDays(7);
		LocalDateTime proximaSemanaDateTime = d02.plusDays(7);
		
		System.out.println("Semana passada = " + semanaPassadaDateTime);
		System.out.println("Semana que vem = " + proximaSemanaDateTime);
	
		Instant semanaPassadaInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant proximaSemanaInstant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Semana passada = " + semanaPassadaInstant);
		System.out.println("Semana que vem = " + proximaSemanaInstant);
	
		Duration t1 = Duration.between(semanaPassadaDateTime, d02);
		Duration t2 = Duration.between(semanaPassadaDate.atTime(0, 0), d01.atStartOfDay());
		Duration t3 = Duration.between(semanaPassadaInstant, d03);
		
		
		System.out.println(t1.toDays());
		System.out.println(t2.toDays());
		System.out.println(t3.toDays());
	}

}
