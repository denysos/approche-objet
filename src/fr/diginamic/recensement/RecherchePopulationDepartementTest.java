package fr.diginamic.recensement;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecherchePopulationDepartementTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void recherchePopulationDepartement_1Ligne() {
		String departement = "01";
		Recensement recensement = new Recensement();
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;01;1;10;010;Anglefort;1 124;18;1 142;");

		RecherchePopulationDepartement recherchePopDepartement = new RecherchePopulationDepartement(recensement);
		assertEquals(1142, recherchePopDepartement.rechercher(departement));

	}

	@Test
	void recherchePopulationDepartement_2Ligne() {
		String departement = "01";
		Recensement recensement = new Recensement();
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;01;1;10;010;Anglefort;1 124;18;1 142;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;01;1;01;008;Ambutrix;750;13;763;");
		recensement.ajouteVille("44;Grand Est;08;1;13;071;Blombay;137;2;139;");

		RecherchePopulationDepartement recherchePopDepartement = new RecherchePopulationDepartement(recensement);
		assertEquals(1905, recherchePopDepartement.rechercher(departement));

	}

}
