package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {

	public static void main(String... args) {

		List<Ville> villesContinents = new ArrayList<>();
		
		villesContinents.add(new Ville("New York", 1_000_000, Continents.AMERIQUE));
		villesContinents.add(new Ville("Paris", 1_000_001, Continents.EUROPE));
		villesContinents.add(new Ville("Pekin", 1_000_002, Continents.ASIE));
		villesContinents.add(new Ville("Moscou", 1_000_003, Continents.EUROPE));
		villesContinents.add(new Ville("Berlin", 1_000_004, Continents.EUROPE));
		villesContinents.add(new Ville("New York", 1_000_005, Continents.AMERIQUE));
		villesContinents.add(new Ville("Sydney", 1_000_006, Continents.OCEANIE));
		villesContinents.add(new Ville("New York", 1_000_007, Continents.AMERIQUE));
		villesContinents.add(new Ville("Sao Paulo", 1_000_008, Continents.AMERIQUE));
		villesContinents.add(new Ville("Dakar", 1_000_009, Continents.AFRIQUE));
		
		
		for (Ville ville : villesContinents) {
			System.out.println(ville.toString());
		}
		
	}

}
