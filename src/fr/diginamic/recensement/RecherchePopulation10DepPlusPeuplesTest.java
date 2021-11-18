package fr.diginamic.recensement;

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
	void recherchePopulationDepartement_2LignesSimples() {

		int nbDepRecherche = 2;
		List<Departement> resultatCleDepPlusPleuples;
		resultatCleDepPlusPleuples.add(new Departement("01", 1400));
		resultatCleDepPlusPleuples.add(new Departement("04", 1500));
		Departement[] tblDepAttendu = resultatCleDepPlusPleuples.toArray();
		
		Recensement recensement = new Recensement();
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;01;1;10;010;Anglefort;1 124;18;1 400;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;02;1;10;010;Anglefort;1 124;18;1 300;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;03;1;10;010;Anglefort;1 124;18;1 200;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;04;1;10;010;Anglefort;1 124;18;1 500;");

		RecherchePopulation10DepPlusPeuples recherchePop10Departement = new RecherchePopulation10DepPlusPeuples(recensement, nbDepRecherche);
		assertArrayEquals(resultatCleDepPlusPleuples, recherchePop10Departement.rechercher(nbDepRecherche));

	}

	@Test
	void recherchePopulationDepartement_2Lignes() {
		int nbDepRecherche = 2;
		String[] resultatCleDepPlusPleuples = {"02","03"};

		Recensement recensement = new Recensement();
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;02;1;10;010;Anglefort;1 124;18;1 400;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;02;1;10;010;Anglefort;1 124;18;1 300;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;01;1;10;010;Anglefort;1 124;18;1 200;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;03;1;10;010;Anglefort;1 124;18;1 500;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;03;1;10;010;Anglefort;1 124;18;1 200;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;04;1;10;010;Anglefort;1 124;18;1 500;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;04;1;10;010;Anglefort;1 124;18;150;");


		RecherchePopulation10DepPlusPeuples recherchePop10Departement = new RecherchePopulation10DepPlusPeuples(recensement, nbDepRecherche);
		assertArrayEquals(resultatCleDepPlusPleuples, recherchePop10Departement.rechercher(nbDepRecherche));

	}

}
