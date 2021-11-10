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
		JeuTirage tirage = new JeuTirageTest();


		Jeu jeu = new Jeu(perso, tirage);

		assertEquals(15, jeu.getJoueur().getForce());
		assertEquals(25, jeu.getJoueur().getPointsDeVie());

	}

	@Test
	void testcombat1roundJoueurGagne() {
		Joueur perso = new Joueur(15, 25);
		Loup   monstre = new Loup(5, 10);
		JeuTirage tirage = new JeuTirageTest();
		Jeu jeu = new Jeu(perso, tirage);
		jeu.combat(perso, monstre);
		
		assertEquals(25,perso.getPointsDeVie());
		assertEquals(0,monstre.getPointsDeVie());

		
	}

}
