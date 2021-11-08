package fr.diginamic.essais;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.diginamic.operations.Moyenne;

class MoyenneTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testTableauVide() {
		double[] tableauACalculer = {};
		Moyenne moyenne = new Moyenne(tableauACalculer);
		assertEquals(0, moyenne.calcul());
	}

	@Test
	void testTableau1Valeur() {
		double[] tableauACalculer = { 5 };
		Moyenne moyenne = new Moyenne(tableauACalculer);
		assertEquals(5, moyenne.calcul());
	}

	@Test
	void testAjouteValeur() {
		double[] tableauACalculer = { 5 };
		Moyenne moyenne = new Moyenne(tableauACalculer);
		double[] tableauAttendu = { 5, 8 };
		double[] tableaucree = moyenne.ajoute(8);
		assertArrayEquals(tableauAttendu, tableaucree);
	}

	@Test
	void testTableau2Valeur() {
		double[] tableauACalculer = { 5 };
		Moyenne moyenne = new Moyenne(tableauACalculer);
		moyenne.ajoute(8);
		assertEquals(6.5, moyenne.calcul());
	}

}
