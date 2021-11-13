package fr.diginamic.jdr;

//import java.util.Iterator;
import java.util.Random;

public class EssaisJeu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Random generateurAleatoire = new Random();
//		int alea ;
//		int nbMini = 12;
//		int nbMaxi = 18;
//		for (int i = 0; i < 20; i++) {
//			alea = nbMini + generateurAleatoire.nextInt(nbMaxi - nbMini + 1);
//			System.out.println(alea);
//				
//	
		Joueur perso = new Joueur(15, 25);
		Loup monstre = new Loup(5, 10);
		int[] tirageJoueur = { 10 };
		int[] tirageMonstre = { 10 };
		JeuTirage tirage = new JeuTirageTest(tirageJoueur, tirageMonstre);
//		JeuTirage tirage = new JeuTirageTest(10, 10);
		Jeu jeu = new Jeu(perso, tirage);
		jeu.combat(perso, monstre);

	}
}
