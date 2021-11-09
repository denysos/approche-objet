package fr.diginamic.entites;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalarieTest {

	@BeforeEach
	void setUp() throws Exception {
//		final String ligne = "Durand;Marcel;2 523.5";
//		final Salarie salarie = new Salarie(ligne);
	}

	@Test
	void testNomSalarie() {
		String ligne = "Durand;Marcel;2 523.5";
		Salarie salarie = new Salarie(ligne);
		assertEquals("Durand", salarie.getNom());

	}

	@Test
	void testPrenomSalarie() {
		String ligne = "Durand;Marcel;2 523.5";
		Salarie salarie = new Salarie(ligne);
		assertEquals("Marcel", salarie.getPrenom());

	}

	@Test
	void testSalaireSalarie() {
		String ligne = "Durand;Marcel;2 523.5";
		Salarie salarie = new Salarie(ligne);
		assertEquals(2523.5, salarie.getSalaire());

	}

}
