package fr.diginamic.recensement;

import java.util.HashMap;
import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService {
	private Recensement recensement;

	public RecherchePopulationDepartement(Recensement recensement) {
		super();
		this.recensement = recensement;
	}

//	private HashMap<String, Integer> tableauPopulationDepartement = new HashMap<>();
	private Departement departementRecherche;

	@Override
	public void traiter() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("entrez le code de departement à recenser : ");
		String requeteCodeDepartement = scanner.next();
		departementRecherche = rechercher(requeteCodeDepartement);

		if (departementRecherche == null) {
			System.out.println("ville <" + requeteCodeDepartement + "> inconnue");
		} else {

			afficherPopDepartement();
		}
	}
	
	private void afficherPopDepartement() {
		String nomVille = departementRecherche.getCodeDepartement();
		int populationDepartement = departementRecherche.getPopulationTotale();
		System.out.println("[" + nomVille + "] : " + populationDepartement + " Habitants");

	}

	public Departement rechercher(String codeDepartement) {
	Departement departement =	recensement.recherchePopulationDepartement(codeDepartement);
		
		return departement;
	}

}
