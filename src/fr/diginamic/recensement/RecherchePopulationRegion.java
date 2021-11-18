package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService {
	private Region regionRecherche;
	private Recensement recensement;

	public RecherchePopulationRegion(Recensement recensement) {
		super();
		this.recensement = recensement;
	}

	@Override
	public void traiter() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("entrez le code de la région à recenser : ");
		System.out.println("");
		System.out.println("Code région 	: Nom de la région");
		System.out.println("84 		: Auvergne-Rhône-Alpes");
		System.out.println("32 		: Hauts-de-France");
		System.out.println("93 		: Provence-Alpes-Côte d'Azur");
		System.out.println("44 		: Grand Est");
		System.out.println("76 		: Occitanie");
		System.out.println("28 		: Normandie");
		System.out.println("75 		: Nouvelle-Aquitaine");
		System.out.println("24 		: Centre-Val de Loire");
		System.out.println("94 		: Corse");
		System.out.println("27 		: Bourgogne-Franche-Comté");
		System.out.println("53 		: Bretagne");
		System.out.println("52 		: Pays de la Loire");
		System.out.println("11 		: Île-de-France");
		System.out.println("01 		: Guadeloupe");
		System.out.println("02 		: Martinique");
		System.out.println("03 		: Guyane");
		System.out.println("04 		: La Réunion");
		String requeteCodeRegion = scanner.next();
		regionRecherche = rechercher(requeteCodeRegion);

		if (regionRecherche == null) {
			System.out.println("ville <" + requeteCodeRegion + "> inconnue");
		} else {

			afficherPopRegion();
		}
	}

	private void afficherPopRegion() {
		String nomRegion = regionRecherche.getNomRegion();
		String codeRegion = regionRecherche.getCodeRegion();
		int populationRegion = regionRecherche.getPopulationTotale();
		System.out.println("[" + codeRegion + " " + nomRegion + "] : " + populationRegion + " Habitants");

	}

	public Region rechercher(String codeRegion) {
		Region region = recensement.recherchePopulationRegion(codeRegion);

		return region;
	}
}
