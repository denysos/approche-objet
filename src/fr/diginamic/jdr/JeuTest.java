package fr.diginamic.jdr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JeuTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testNouveauJeu() {
		Joueur perso = new Joueur(15, 25);
//		Joueur perso = new Joueur();
		int[] tirageJoueur = { 10 };
		int[] tirageMonstre = { 10 };
		JeuTirage tirage = new JeuTirageTest(tirageJoueur, tirageMonstre);

		Jeu jeu = new Jeu(perso, tirage);

		assertEquals(15, jeu.getJoueur().getForce());
		assertEquals(25, jeu.getJoueur().getPointsDeVie());

	}

	@Test
	void testRoundcombatMonstreGagneRound() {
		Personnage vainqueur;
		Joueur perso = new Joueur(8, 5);
		Monstre monstre = new Troll(12, 20);
		int[] tirageJoueur = { 1 };
		int[] tirageMonstre = { 6 };
		JeuTirage tirage = new JeuTirageTest(tirageJoueur, tirageMonstre);
		Jeu jeu = new Jeu(perso, tirage);
		vainqueur = jeu.combat(perso, monstre);

		assertEquals(monstre, vainqueur);
		assertEquals(-4, perso.getPointsDeVie());
		assertEquals(20, monstre.getPointsDeVie());

	}



	@Test
	void testRoundcombatJoueurGagneRound() {
		Personnage vainqueur;
		Joueur perso = new Joueur(15, 25);
		Monstre monstre = new Loup(5, 3);
		int[] tirageJoueur = { 4 };
		int[] tirageMonstre = { 10 };
		JeuTirage tirage = new JeuTirageTest(tirageJoueur, tirageMonstre);
		Jeu jeu = new Jeu(perso, tirage);
		vainqueur = jeu.combat(perso, monstre);

		assertEquals(perso, vainqueur);
		assertEquals(25, perso.getPointsDeVie());
		assertEquals(-1, monstre.getPointsDeVie());

	}

	@Test
	void testcombatJoueurGagneEn1Round() {
		Personnage vainqueur;
		Joueur perso = new Joueur(15, 25);
		Monstre monstre = new Loup(5, 10);
		int[] tirageJoueur = { 10 };
		int[] tirageMonstre = { 10 };
		JeuTirage tirage = new JeuTirageTest(tirageJoueur, tirageMonstre);
//		JeuTirage tirage = new JeuTirageTest(10, 10);
		Jeu jeu = new Jeu(perso, tirage);
		vainqueur = jeu.combat(perso, monstre);

		assertEquals(perso, vainqueur);
		assertEquals(25, perso.getPointsDeVie());
		assertEquals(0, monstre.getPointsDeVie());
		assertEquals(1, perso.getScore());

	}

	@Test
	void testcombatJoueurGagneEn2Round() {
		Personnage vainqueur;
		Joueur perso = new Joueur(15, 25);
		Monstre monstre = new Troll(12, 20);
		int[] tirageJoueur = { 10, 10 };
		int[] tirageMonstre = { 5, 1 };
		JeuTirage tirage = new JeuTirageTest(tirageJoueur, tirageMonstre);
		Jeu jeu = new Jeu(perso, tirage);
		vainqueur = jeu.combat(perso, monstre);

		assertEquals(perso, vainqueur);
		assertEquals(25, perso.getPointsDeVie());
		assertEquals(0, monstre.getPointsDeVie());
		assertEquals(5, perso.getScore());

	}
}
