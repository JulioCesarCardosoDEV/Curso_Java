package app;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Calendar;

public class calender {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
		
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(d);
		 cal.add(Calendar.HOUR_OF_DAY, 4);
		 d = cal.getTime();
		 int minutes = cal.get(Calendar.MINUTE);
		 int mes = 1 + cal.get(Calendar.MONTH);
		 
		 System.out.println(sdf.format(d));
		 System.out.println("Minutos = " + minutes);
		 System.out.println("Mes = " + mes);
	}

}
