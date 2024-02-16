package model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reserva3Boa {
	private Integer numeroDoQuarto;
	private Date checkIn;
	private Date checkOut;


	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reserva3Boa(){

	}

	public Reserva3Boa(Integer numeroDoQuarto, Date checkIn, Date checkOut){
		if(! checkOut.after(checkIn)) {
			throw new DomainException("Check-Out deve ser após o Check-In");
		}

		this.numeroDoQuarto = numeroDoQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getNumeroDoQuarto() {
		return numeroDoQuarto;
	}

	public void setNumeroDoQuarto(Integer numeroDoQuarto) {
		this.numeroDoQuarto = numeroDoQuarto;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duracao() {
		long diferenca = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
	}

	
	public void atualizaDatas(Date checkIn, Date checkOut){
		
		Date now  = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("As datas para reserva são inválidas, precisam ser datas futuras");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	

	@Override
	public String toString() {
		return "Quarto " + numeroDoQuarto + ", check-in: " + sdf.format(checkIn) + ", check-out: " + sdf.format(checkOut)
		+ ", " + duracao() + " noites";
	}
}
