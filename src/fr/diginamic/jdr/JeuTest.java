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
//		Jeu jeu = new Jeu(perso, tirage);
//		vainqueur = jeu.combat(perso, monstre);

		Combat combat = new Combat(perso, monstre, tirage);
		vainqueur = combat.executer();

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
//		Jeu jeu = new Jeu(perso, tirage);
//		vainqueur = jeu.combat(perso, monstre);

		Combat combat = new Combat(perso, monstre, tirage);
		vainqueur = combat.executer();

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
//		Jeu jeu = new Jeu(perso, tirage);
//		vainqueur = jeu.combat(perso, monstre);

		Combat combat = new Combat(perso, monstre, tirage);
		vainqueur = combat.executer();

		assertEquals(perso, vainqueur);
		assertEquals(25, perso.getPointsDeVie());
		assertEquals(0, monstre.getPointsDeVie());
		assertEquals(1, perso.getScore());

	}

	@Test
	void testcombatJoueurGagneEn2Rounds() {
		Personnage vainqueur;
		Joueur perso = new Joueur(15, 25);
		Monstre monstre = new Troll(12, 20);
		int[] tirageJoueur = { 10, 10 };
		int[] tirageMonstre = { 5, 1 };
		JeuTirage tirage = new JeuTirageTest(tirageJoueur, tirageMonstre);
//		Jeu jeu = new Jeu(perso, tirage);
//		vainqueur = jeu.combat(perso, monstre);

		Combat combat = new Combat(perso, monstre, tirage);
		vainqueur = combat.executer();

		assertEquals(perso, vainqueur);
		assertEquals(25, perso.getPointsDeVie());
		assertEquals(0, monstre.getPointsDeVie());
		assertEquals(5, perso.getScore());

	}

	@Test
	void testcombatJoueurGagneEn3Rounds() {
		Personnage vainqueur;
		Joueur perso = new Joueur(15, 25);
		Monstre monstre = new Troll(12, 20);
		int[] tirageJoueur = { 10, 1, 10 };
		int[] tirageMonstre = { 5, 10, 1 };
		JeuTirage tirage = new JeuTirageTest(tirageJoueur, tirageMonstre);
//		Jeu jeu = new Jeu(perso, tirage);
//		vainqueur = jeu.combat(perso, monstre);

		Combat combat = new Combat(perso, monstre, tirage);
		vainqueur = combat.executer();

		assertEquals(perso, vainqueur);
		assertEquals(19, perso.getPointsDeVie());
		assertEquals(0, monstre.getPointsDeVie());
		assertEquals(5, perso.getScore());

	}

	@Test
	void testcombatJoueurGagneTrollGagneTroll() {
		Personnage vainqueur;
		Joueur perso = new Joueur(15, 25);
		Monstre monstre1 = new Troll(12, 20);
		Monstre monstre2 = new Troll(12, 20);

		// combat 2 :
		int[] tirageJoueur2 = { 10, 1, 10 };
		int[] tirageMonstre2 = { 4, 10, 1 };
		JeuTirage tirage2 = new JeuTirageTest(tirageJoueur2, tirageMonstre2);
//		Jeu jeu = new Jeu(perso, tirage);
//		vainqueur = jeu.combat(perso, monstre);

		Combat combat2 = new Combat(perso, monstre2, tirage2);
		vainqueur = combat2.executer();

		// combat 1 :
		int[] tirageJoueur = { 10, 2, 10 };
		int[] tirageMonstre = { 5, 10, 1 };
		JeuTirage tirage = new JeuTirageTest(tirageJoueur, tirageMonstre);
//		Jeu jeu = new Jeu(perso, tirage);
//		vainqueur = jeu.combat(perso, monstre);

		Combat combat1 = new Combat(perso, monstre1, tirage);
		vainqueur = combat1.executer();

		assertEquals(perso, vainqueur);
		assertEquals(14, perso.getPointsDeVie());
		assertEquals(-1, monstre2.getPointsDeVie());
		assertEquals(0, monstre1.getPointsDeVie());
		assertEquals(10, perso.getScore());

	}

	@Test
	void testcombatJoueurGagneTrollPerdTroll() {
		Personnage vainqueur;
		Joueur perso = new Joueur(15, 25);
		Monstre monstre1 = new Troll(12, 20);
//
//		// combat 1 :
		int[] tirageJoueur1 = { 10, 1, 10 };
		int[] tirageMonstre1 = { 4, 10, 1 };
		JeuTirage tirage1 = new JeuTirageTest(tirageJoueur1, tirageMonstre1);
//
		Combat combat1 = new Combat(perso, monstre1, tirage1);
		vainqueur = combat1.executer();
//
//		// combat 2 :
		Monstre monstre2 = new Troll(15, 20);
		int[] tirageJoueur2 = { 1, 1, 1 };
		int[] tirageMonstre2 = { 10, 6, 10 };
		JeuTirage tirage2 = new JeuTirageTest(tirageJoueur2, tirageMonstre2);
//
		Combat combat2 = new Combat(perso, monstre2, tirage2);
		vainqueur = combat2.executer();
//
		assertEquals(monstre2, vainqueur);
		assertEquals(-4, perso.getPointsDeVie());
		assertEquals(-1, monstre1.getPointsDeVie());
		assertEquals(20, monstre2.getPointsDeVie());
		assertEquals(5, perso.getScore());
//
	}
}
