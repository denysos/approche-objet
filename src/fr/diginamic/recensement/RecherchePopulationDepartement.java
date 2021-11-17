package fr.diginamic.recensement;

import java.util.HashMap;
import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService {
	private Recensement recensement;

	public RecherchePopulationDepartement(Recensement recensement) {
		super();
		this.recensement = recensement;
	}

	private HashMap<String, Integer> tableauPopulationDepartement = new HashMap<>();

	@Override
	public void traiter() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("entrez le code de departement à recenser : ");
		String requeteCodeDepartement = scanner.next();
	}

	private int recherchePopDepartement(String codeDepartement, HashMap tableauPopulation) {
		return 0;
	}

}
