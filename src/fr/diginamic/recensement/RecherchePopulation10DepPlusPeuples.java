package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class RecherchePopulation10DepPlusPeuples extends MenuService {
	private Recensement recensement;
	private int nbDepAAfficher;
	private List<Departement> departementsRecherches;

	public RecherchePopulation10DepPlusPeuples(Recensement recensement, int nbDepAAfficher) {
		super();
		this.recensement = recensement;
		this.nbDepAAfficher = nbDepAAfficher;

	}

	@Override
	public void traiter() {

		departementsRecherches = rechercher(nbDepAAfficher);

		afficherPopDepartement();
	}

	public List <Departement> rechercher(int nbDepAAfficher) {
		List <Departement> departements = recensement.recherchePopulation10DepartementsPlusPeuples(nbDepAAfficher);
		return departements;
	}

	private void afficherPopDepartement() {

		for (int i = 0; i < departementsRecherches.size(); i++) {

			String codeDepartement = departementsRecherches.get(i).getCodeDepartement();
			int populationDepartement = departementsRecherches.get(i).getPopulationTotale();
			System.out.println("[" + codeDepartement + "] : " + populationDepartement + " Habitants");
		}

	}
}
