package fr.diginamic.listes;

public class TestEquals {

	public static void main(String[] args) {

		Ville ville1 = new Ville("Nimes", 150_000);
		Ville ville2 = new Ville("Nimes", 150_000);

		System.out.println("egalite ville1 equals ville2 : " + ville1.equals(ville2));

		Ville ville3 = new Ville("Nimes", 150_000);
		Ville ville4 = new Ville("Nimes", 151_000);

		System.out.println("egalite ville1 equals ville2 : " + ville3.equals(ville4));

		Ville ville5 = new Ville("Nimes", 150_000);
		Ville ville6 = new Ville("Nimes", 150_000);

		System.out.println("egalite ville5 == ville6 : " + (ville5 == ville6));

		Ville ville7 = new Ville("Nimes", 150_000);
		Ville ville8 = new Ville("Nimes", 151_000);

		System.out.println("egalite ville7 == ville8 : " + (ville7 == ville8));

		System.out.print("egalite ville5 == ville6 : avec .toString() : ");
		System.out.println(ville5.toString() == ville6.toString());
		System.out.println(ville5.getNom() == ville6.getNom() && ville5.getNbHab() == ville6.getNbHab());

	}

}
