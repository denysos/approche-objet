package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class RecensementDepartement {
	private HashMap<String, Departement> tableDepartements = new HashMap<>();
	private ArrayList<Ville> listeVilles;

	public RecensementDepartement(ArrayList<Ville> listeVilles) {
		super();
		this.listeVilles = listeVilles;
		aggregationPopulationDepartements(listeVilles);
	}

	public Departement recherchePopulationDepartement(String codeDepartement) {

		// rechercher le departement dans la HashMap
		Departement departement = tableDepartements.get(codeDepartement);

		return departement;

	}

	public List<Departement> recherchePopulationDepartementsPlusPeuples(int nbDepAAfficher) {
		List<Departement> departements = (List) tableDepartements.values();
		Collections.sort(departements);

//		List<Departement> departementsTries = Collections.sort(List<Departement> tableDepartements.values()); 
		return departements.subList(0, nbDepAAfficher - 1);

	}

	private void aggregationPopulationDepartements(ArrayList<Ville> listeVilles) {

		for (Ville ville : listeVilles) {
			int population = nettoyageStrNumber(ville.getPopulationTotale());
			String codeDepartement = ville.getCodeDepartement();
			Departement departement = new Departement(codeDepartement, 0);
			tableDepartements.putIfAbsent(codeDepartement, departement);
			departement = tableDepartements.get(codeDepartement);
			int populationCalculee = population + departement.getPopulationTotale();
			tableDepartements.put(codeDepartement, new Departement(codeDepartement, populationCalculee));
		}
	}

	private Integer nettoyageStrNumber(String nbStr) {
		return Integer.parseInt(nbStr.replaceAll(" ", ""));
	}

}
