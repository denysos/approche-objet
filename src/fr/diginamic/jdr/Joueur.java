package fr.diginamic.jdr;

import java.util.Random;

public class Joueur extends Personnage {

	private int score = 0;

	public Joueur() {
		super();
		this.force = JeuTirage.tirageEntre2BornesIncluses(Jeu.FORCE_MIN_JOUEUR, Jeu.FORCE_MAX_JOUEUR);
		this.pointsDeVie = JeuTirage.tirageEntre2BornesIncluses(Jeu.FORCE_MIN_JOUEUR, Jeu.FORCE_MAX_JOUEUR);
	}

	public int incrementScore(Monstre monstre) {
		int score;
		score = getScore() + monstre.getValeurTrophee();
		setScore(score);
		return score;
	}

	private void setScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public Joueur(int force, int pointsDeVie) {
		super(force, pointsDeVie);
	}

}
