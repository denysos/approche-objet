package fr.diginamic.recensement;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecherchePopulationDepartementTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	void rechercheVille_Amburix_DansRecencement() {
		String ville = "Ambutrix";
		Recensement recensement = new Recensement();
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;01;1;10;010;Anglefort;1 124;18;1 142;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;01;1;01;008;Ambutrix;750;13;763;");

		RecherchePopulationVille recherchePopVille = new RecherchePopulationVille(recensement);
		assertEquals("Ambutrix", recherchePopVille.rechercher(ville).getNomCommune());

	}

}
