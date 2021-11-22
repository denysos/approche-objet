package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
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

	public Departement[] recherchePopulationDepartementsPlusPeuples(int nbDepAAfficher) {
//		List<Departement> departements = Collections.emptyList();
		int dimTableDepartements = tableDepartements.size();
		Departement[] departements = new Departement[dimTableDepartements];

		int i = 0;
		for (Departement departement : tableDepartements.values()) {
			departements[i] = departement;
			i++;
		}

		Arrays.sort(departements);

//		List<Departement> departementsTries = Collections.sort(List<Departement> tableDepartements.values()); 
//		return Arrays.copyOf(departements, nbDepAAfficher);
//		return Arrays.copyOfRange(departements, dimTableDepartements - 1 - nbDepAAfficher, dimTableDepartements - 1);
		return Arrays.copyOfRange(departements, 0, nbDepAAfficher); // borne sup exclue !!!


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
