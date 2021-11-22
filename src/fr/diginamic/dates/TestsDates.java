package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestsDates {

	public static void main(String[] args) {
		Date dateDuJour = new Date();
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formateur.format(dateDuJour));
		System.out.println("Utilisation de java.util.Date : " + dateDuJour.getDate() + "/" + (dateDuJour.getMonth() + 1)
				+ "/" + (dateDuJour.getYear() + 1900));

		Date date19052016 = new Date(116, 04, 19, 23, 59, 30);
		System.out.println("19-05-2016 : " + (date19052016.getYear() + 1900) + "/" + (date19052016.getMonth() + 1) + "/"
				+ date19052016.getDate() + " à " + date19052016.getHours() + " :" + date19052016.getMinutes() + " : "
				+ date19052016.getSeconds());
		
		

	}

}
