package fr.diginamic.jdr;

import java.util.Random;

public class JeuTirage {
	public Joueur joueur;

	public JeuTirage() {
	}
	
	
	static int tirageEntre2BornesIncluses(int min, int max){
		Random generateurAleatoire = new Random();
		int alea ;
			alea = min + generateurAleatoire.nextInt(max - min + 1);
			return alea;
		}
	
	static int tirageJoueur() {
		return 10;
	}

	
	static int tirageMonstre() {
		return 10;
	}
	
	
}