package fr.diginamic.jdr;

public class JeuTirageTest extends JeuTirage {
	private int[] tirageJoueur;
	private int[] tirageMonstre;
	int indexTirageJoueur = 0;
	int indexTirageMonstre = 0;

	public JeuTirageTest(int[] tirageJoueur, int[] tirageMonstre) {
		super();
		this.tirageJoueur = tirageJoueur;
		this.tirageMonstre = tirageMonstre;
	}

	int tirageJoueur() {
		int tirage;
		tirage = tirageJoueur[getIndexTirageJoueur()];
		setIndexTirageJoueur(getIndexTirageJoueur() + 1);
		return tirage;

	}

	int tirageMonstre() {
		int tirage;
		tirage = tirageMonstre[getIndexTirageMonstre()];
		setIndexTirageMonstre(getIndexTirageMonstre() + 1);
		return tirage;
	}

	private int getIndexTirageJoueur() {
		return indexTirageJoueur;
	}

	private void setIndexTirageJoueur(int indexTirageJoueur) {
		this.indexTirageJoueur = indexTirageJoueur;
	}

	private int getIndexTirageMonstre() {
		return indexTirageMonstre;
	}

	private void setIndexTirageMonstre(int indexTirageMonstre) {
		this.indexTirageMonstre = indexTirageMonstre;
	}

}
