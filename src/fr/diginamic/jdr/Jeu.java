package fr.diginamic.jdr;

import java.util.Random;

public class Jeu {

	private Joueur joueur;
	private JeuTirage tirage;
	static public int FORCE_MIN_JOUEUR = 12;
	static public int FORCE_MAX_JOUEUR = 18;
	static public int VIE_MIN_JOUEUR = 20;
	static public int VIE_MAX_JOUEUR = 50;

	public Jeu(Joueur joueur, JeuTirage tirage) {
		super();
		this.joueur = joueur;
		this.tirage = tirage;
	}

	public Joueur getJoueur() {
		return joueur;
	}

	public void combat(Personnage joueur, Personnage monstre) {
		int degats = 0;
		int attaqueJoueur = 0;
		int attaqueMonstre = 0;
		attaqueJoueur = joueur.getForce() + tirage.tirageJoueur();
		attaqueMonstre = monstre.getForce() + tirage.tirageMonstre();
		if (attaqueJoueur > attaqueMonstre) {
			int pdv = monstre.getPointsDeVie();
			degats = attaqueJoueur - attaqueMonstre;
			monstre.blessure(degats);

		}

	}

}
