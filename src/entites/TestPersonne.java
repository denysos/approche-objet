package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale adr1 = new AdressePostale(10, "rue de la bise", 30000, "Nimes");
//		adr1.numeroDeRue = 10;
//		adr1.libelleDeLaRue = "rue de la bise";
//		adr1.codePostal = 30000;
//		adr1.ville = "Nimes";

		AdressePostale adr2 = new AdressePostale(12, "rue du pont", 34000, "Montpellier");
//		adr2.numeroDeRue = 12;
//		adr2.libelleDeLaRue = "rue du pont";
//		adr2.codePostal = 34000;
//		adr2.ville = "Montpellier";

		Personne pers1 = new Personne("Mourier", "Denis");
//		pers1.nom = "Mourier";
//		pers1.prenom = "Denis";
		pers1.adresse = adr1;

		Personne pers2 = new Personne("Jean", "Louis", adr2);
//		Personne pers2 = new Personne();
//		pers2.nom = "Jean";
//		pers2.prenom = "Louis";
//		pers2.adresse = adr2;

		System.out.println("TestPersonne executé !!");
		System.out.println(pers1);
		System.out.println(pers2);
	}

}
