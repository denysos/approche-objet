package fr.diginamic.recensement;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecherchePopulationVilleTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void rechercheVille_Amburix_DansRecencement() {
		String ville = "Ambutrix";
		Recensement recensement = new Recensement();
//		recensement.ajouteVille("Ambutrix");
//		recensement.ajouteVille("Anglefort");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;01;1;10;010;Anglefort;1 124;18;1 142;");
		recensement.ajouteVille("84;Auvergne-Rhône-Alpes;01;1;01;008;Ambutrix;750;13;763;");

		RecherchePopulationVille recherchePopVille = new RecherchePopulationVille(recensement);
		assertEquals("Ambutrix", recherchePopVille.rechercher(ville).getNomCommune());

	}

	@Test
	void recherchePopulationVille_Amburix_DansRecencement() {
		String ville = "Ambutrix";
		Recensement recencement = new Recensement();
		recencement.ajouteVille("84;Auvergne-Rhône-Alpes;01;1;01;008;Ambutrix;750;13;763;");
		recencement.ajouteVille("84;Auvergne-Rhône-Alpes;01;1;10;010;Anglefort;1 124;18;1 142;");

		RecherchePopulationVille recherchePopVille = new RecherchePopulationVille(recencement);
		assertEquals("763", recherchePopVille.rechercher(ville).getPopulationTotale());

	}

}
