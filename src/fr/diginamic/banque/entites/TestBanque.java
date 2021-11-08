package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {

		Compte compte;
		CompteTaux compteTaux;
		compte = new Compte("01234567890", 10562F);
		compteTaux = new CompteTaux("22222222222", 5500.20F, 3.2F);
		Compte[] tableauDesComptes = new Compte[2];
		tableauDesComptes[0] = compte;
		tableauDesComptes[1] = compteTaux;
		int tailleTableauDesComptes = tableauDesComptes.length;

		System.out.println("voici les comptes :");
		System.out.println(compte);
		System.out.println(compteTaux);

		System.out.println("boucle sur le tableau des comptes : ");
		for (int i = 0; i < tailleTableauDesComptes; i++) {
			System.out.println(tableauDesComptes[i].toString());

		}

		// on constate que reference est faite au package de la classe compte :
		// fr.diginamic.banque.entites.Compte@6504e3b2
		// les informations n'apparaissent pas clairement !
	}

}
