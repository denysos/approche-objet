package fr.diginamic.recensement;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecherchePopulation10DepPlusPeuplesTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void recherchePopulationDepartement_2LignesSimples_testTBL_OK() {

		int nbDepRecherche = 2;
		Departement[] resultatCleDepPlusPleuples = new Departement[2];
		resultatCleDepPlusPleuples[0] = new Departement("04", 1500);
		resultatCleDepPlusPleuples[1] = new Departement("01", 1400);

		Recensement recensement = new Recensement();
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;01;1;10;010;Anglefort;1 124;18;1 400;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;02;1;10;010;Anglefort;1 124;18;1 300;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;03;1;10;010;Anglefort;1 124;18;1 200;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;04;1;10;010;Anglefort;1 124;18;1 500;");

		RecherchePopulation10DepPlusPeuples recherchePop10Departement = new RecherchePopulation10DepPlusPeuples(
				recensement, nbDepRecherche);
		assertArrayEquals("coucou c'est nous", resultatCleDepPlusPleuples,
				recherchePop10Departement.rechercher(nbDepRecherche));

	}

	@Test
	void recherchePopulationDepartement_2LignesSimples() {

		int nbDepRecherche = 2;
		Departement[] resultatCleDepPlusPleuples = new Departement[2];
		resultatCleDepPlusPleuples[0] = new Departement("04", 1500);
		resultatCleDepPlusPleuples[1] = new Departement("01", 1400);

		Recensement recensement = new Recensement();
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;01;1;10;010;Anglefort;1 124;18;1 400;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;02;1;10;010;Anglefort;1 124;18;1 300;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;03;1;10;010;Anglefort;1 124;18;1 200;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;04;1;10;010;Anglefort;1 124;18;1 500;");

		RecherchePopulation10DepPlusPeuples recherchePop10Departement = new RecherchePopulation10DepPlusPeuples(
				recensement, nbDepRecherche);
//		assertArrayEquals(resultatCleDepPlusPleuples, recherchePop10Departement.rechercher(nbDepRecherche));
		assertEquals("04", recherchePop10Departement.rechercher(nbDepRecherche)[0].getCodeDepartement());
		assertEquals(1500, recherchePop10Departement.rechercher(nbDepRecherche)[0].getPopulationTotale());
		assertEquals("01", recherchePop10Departement.rechercher(nbDepRecherche)[1].getCodeDepartement());
		assertEquals(1400, recherchePop10Departement.rechercher(nbDepRecherche)[1].getPopulationTotale());

	}

	@Test
	void recherchePopulationDepartement_2Lignes() {
		int nbDepRecherche = 2;
		String[] resultatCleDepPlusPleuples = { "02", "03" };

		Recensement recensement = new Recensement();
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;02;1;10;010;Anglefort;1 124;18;1 400;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;02;1;10;010;Anglefort;1 124;18;1 300;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;01;1;10;010;Anglefort;1 124;18;1 200;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;03;1;10;010;Anglefort;1 124;18;1 500;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;03;1;10;010;Anglefort;1 124;18;1 100;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;04;1;10;010;Anglefort;1 124;18;1 500;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;04;1;10;010;Anglefort;1 124;18;150;");

		RecherchePopulation10DepPlusPeuples recherchePop10Departement = new RecherchePopulation10DepPlusPeuples(
				recensement, nbDepRecherche);
		assertEquals("02", recherchePop10Departement.rechercher(nbDepRecherche)[0].getCodeDepartement());
		assertEquals(2700, recherchePop10Departement.rechercher(nbDepRecherche)[0].getPopulationTotale());

		assertEquals("03", recherchePop10Departement.rechercher(nbDepRecherche)[1].getCodeDepartement());
		assertEquals(2600, recherchePop10Departement.rechercher(nbDepRecherche)[1].getPopulationTotale());

	}

}
