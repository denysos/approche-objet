package fr.diginamic.jdr;

import java.util.Random;


/**
 * 
 * @author denis
 *
 */

public class Jeu {

	private Joueur joueur;
	private JeuTirage tirage;
//	private Combat combat;

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

	public Personnage combat(Joueur joueur, Monstre monstre) {
		Personnage vainqueur;
		Combat combat = new Combat(joueur, monstre, this.tirage);
		vainqueur = combat.executer();
		return vainqueur;

	}

}
