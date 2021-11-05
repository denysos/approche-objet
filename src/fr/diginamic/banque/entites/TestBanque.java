package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {

		Compte compte;
		compte = new Compte("01234567890", 10562F);

		System.out.println("voici le compte :");
		System.out.println(compte);
		
		// on constate que reference est faite au package de la classe compte :
		// fr.diginamic.banque.entites.Compte@6504e3b2
		// les informations n'apparaissent pas clairement !
	}

}
