package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.HashMap;

public class RecensementRegion {
	private HashMap<String, Region> tableRegion = new HashMap<>();
	private ArrayList<Ville> listeVilles;

	public RecensementRegion(ArrayList<Ville> listeVilles) {
		super();
		this.listeVilles = listeVilles;
		aggregationPopulationRegion(listeVilles);
	}

	public Region recherchePopulationRegion(String codeRegion) {

		// rechercher le departement dans la HashMap
		Region region = tableRegion.get(codeRegion);

		return region;

	}

	private void aggregationPopulationRegion(ArrayList<Ville> listeVilles) {

		for (Ville ville : listeVilles) {
			int population = nettoyageStrNumber(ville.getPopulationTotale());
			String codeRegion = ville.getCodeRegion();
			String nomRegion = ville.getNomRegion();
			Region region = new Region(codeRegion, nomRegion, 0);
			tableRegion.putIfAbsent(codeRegion, region);
			region = tableRegion.get(codeRegion);
			int populationCalculee = population + region.getPopulationTotale();
			tableRegion.put(codeRegion, new Region(codeRegion, nomRegion, populationCalculee));
		}
	}

	private Integer nettoyageStrNumber(String nbStr) {
		return Integer.parseInt(nbStr.replaceAll(" ", ""));
	}
}
