package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.HashMap;

public class Recensement {
	final int CODEREGION = 0;
	final int NOMREGION = 1;
	final int CODEDEPARTEMENT = 2;
	final int CODECOMMUNE = 5;
	final int NOMCOMMUNE = 6;
	final int POPULATIONTOTALE = 9;

	private ArrayList<Ville> listeVilles = new ArrayList<>();
	private HashMap<String, Departement> tableDepartements = new HashMap<>();

	public void ajouteVille(String enregistrementVille) {
		String[] villeTableau = enregistrementVille.split(";");

		Ville ville = new Ville(villeTableau[CODEREGION], villeTableau[NOMREGION], villeTableau[CODEDEPARTEMENT],
				villeTableau[CODECOMMUNE], villeTableau[NOMCOMMUNE], villeTableau[POPULATIONTOTALE]);
		listeVilles.add(ville);

	}

	public Ville rechercheVille(String villeRecherchee) {
		Ville resultat = null;
		for (Ville ville : listeVilles) {
			Boolean villeMatch = ville.getNomCommune().toLowerCase().equals(villeRecherchee.toLowerCase());
			if (villeMatch) {
				return ville;
			}
		}
		return resultat;
	}

	public Departement recherchePopulationDepartement(String codeDepartement) {
		aggregationPopulationDepartements(listeVilles);

		// rechercher le departement dans la HashMap
		Departement departement = tableDepartements.get(codeDepartement);

		return departement;

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
