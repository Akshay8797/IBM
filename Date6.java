package com.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale; 
public class Date6 {

	public static void main(String[] args) {
		DateTimeFormatter italianFormatter=
				DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.ITALIAN);
				LocalDate date3 = LocalDate.now();
				String formattedDate_2 = date3.format(italianFormatter); 
				DateTimeFormatter frenchFormatter=
				DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.FRENCH);
				LocalDate date5 = LocalDate.now();
				String formattedDate_3 = date5.format(frenchFormatter);
                System.out.println(formattedDate_2 );
                System.out.println(formattedDate_3 );
	}

}
