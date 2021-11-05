package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale adr1 = new AdressePostale();
		adr1.numeroDeRue = 10;
		adr1.libelleDeLaRue = "rue de la bise";
		adr1.codePostal = 30000;
		adr1.ville = "Nimes";

		AdressePostale adr2 = new AdressePostale();
		adr2.numeroDeRue = 12;
		adr2.libelleDeLaRue = "rue du pont";
		adr2.codePostal = 34000;
		adr2.ville = "Montpellier";

		Personne pers1 = new Personne();
		pers1.nom = "Mourier";
		pers1.prenom = "Denis";
		pers1.adresse = adr1;

		Personne pers2 = new Personne();
		pers1.nom = "Jean";
		pers1.prenom = "Louis";
		pers1.adresse = adr2;
	}
}
