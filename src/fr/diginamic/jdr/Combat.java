package fr.diginamic.jdr;

public class Combat {
	private Joueur joueur;
	private Monstre monstre;
	private JeuTirage tirage;
	private Personnage vainqueur;

	public Combat(Joueur joueur, Monstre monstre, JeuTirage tirage) {
		super();
		this.joueur = joueur;
		this.monstre = monstre;
		this.tirage = tirage;
		this.vainqueur = joueur;
	}

	public Personnage executer() {

		roundCombat();
		if (leCombatEstFini()) {
			return vainqueur;

		}

		roundCombat();
		if (leCombatEstFini()) {
			return vainqueur;

		}
		return vainqueur;
	}

	public void roundCombat() {
		int degats;
		int attaqueJoueur;
		int attaqueMonstre;
		attaqueJoueur = joueur.getForce() + tirage.tirageJoueur();
		attaqueMonstre = monstre.getForce() + tirage.tirageMonstre();

		if (attaqueJoueur > attaqueMonstre) {
			degats = attaqueJoueur - attaqueMonstre;
			monstre.blessure(degats);

		}

		if (attaqueJoueur < attaqueMonstre) {
			degats = attaqueMonstre - attaqueJoueur;
			joueur.blessure(degats);

		}

		if (attaqueJoueur == attaqueMonstre) {
			degats = 0;
			System.out.println("attaque repousée !");

		}
	}

	private boolean leCombatEstFini() {
		if (isJoueurGagne()) {
			joueur.incrementScore(monstre);
			setVainqueur(joueur);
			return true;
		}

		if (isMonstreGagne()) {
//			joueur.incrementScore(monstre);
			setVainqueur(monstre);
			return true;
		}

		return false;

	}

	private boolean isJoueurGagne() {
		return monstre.getPointsDeVie() <= 0;
	}

	private boolean isMonstreGagne() {
		return joueur.getPointsDeVie() <= 0;
	}

	private void setVainqueur(Personnage vainqueur) {
		this.vainqueur = vainqueur;
	}

}
