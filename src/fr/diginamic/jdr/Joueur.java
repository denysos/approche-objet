package fr.diginamic.jdr;

import java.util.Random;

public class Joueur extends Personnage {

	private int score = 0;

	public Joueur() {
		super();
		this.force = JeuTirage.tirageEntre2BornesIncluses(Jeu.FORCE_MIN_JOUEUR, Jeu.FORCE_MAX_JOUEUR);
		this.pointsDeVie = JeuTirage.tirageEntre2BornesIncluses(Jeu.FORCE_MIN_JOUEUR, Jeu.FORCE_MAX_JOUEUR);
	}

	public Joueur(int force, int pointsDeVie) {
		super(force, pointsDeVie);
	}

}
