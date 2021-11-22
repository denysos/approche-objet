package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class RecherchePopulation10DepPlusPeuples extends MenuService {
	private Recensement recensement;
	private int nbDepAAfficher;
	private Departement[] departementsRecherches;

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

	public Departement[] rechercher(int nbDepAAfficher) {
		Departement[] departements = recensement.recherchePopulation10DepartementsPlusPeuples(nbDepAAfficher);
		return departements;
	}

	private void afficherPopDepartement() {
		// finir ici
		for (int i = 0; i < departementsRecherches.length; i++) {

			String codeDepartement = departementsRecherches[i].getCodeDepartement();
			int populationDepartement = departementsRecherches[i].getPopulationTotale();
			System.out.println("[" + codeDepartement + "] : " + populationDepartement + " Habitants");
		}

	}
}
