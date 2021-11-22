package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		cal.set(2016, 04, 19, 23, 59, 30);
		Date date = cal.getTime();
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formateur.format(date));

		Date dateDuJour = Calendar.getInstance().getTime();
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("date du jour : " + formateur2.format(dateDuJour));

		SimpleDateFormat formateurFr = new SimpleDateFormat("EEEE dd MMMMM yyyy HH:mm:ss", Locale.FRANCE);
		System.out.println("date du jour Fr: " + formateurFr.format(dateDuJour));
		
		SimpleDateFormat formateur3 = new SimpleDateFormat("EEEE dd MMMMM yyyy HH:mm:ss", Locale.CHINESE);
		System.out.println("date du jour Chinois: " + formateur3.format(dateDuJour));
		
		Locale russie = new Locale("ru", "RU");
		SimpleDateFormat formateur4 = new SimpleDateFormat("EEEE dd MMMMM yyyy HH:mm:ss", russie);
		System.out.println("date du jour Russe : " + formateur4.format(dateDuJour));
		
//		Locale russie = new Locale("ru", "RU");
		SimpleDateFormat formateur5 = new SimpleDateFormat("EEEE dd MMMMM yyyy HH:mm:ss", Locale.GERMANY);
		System.out.println("date du jour Allemand : " + formateur5.format(dateDuJour));

	}

}
