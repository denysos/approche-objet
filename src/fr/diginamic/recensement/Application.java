package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws IOException {
		// chargement du fichier :

		Path fichierRecensement = Paths
				.get("d:/workspace-spring-diginamic/approche-objet/src/fr/diginamic/recensement/recensement.csv");
		List<String> linesFichierRecensement = Files.readAllLines(fichierRecensement);
		Recensement recensement = new Recensement();

		for (int i = 1; i < linesFichierRecensement.size(); i++) {
			recensement.ajouteVille(linesFichierRecensement.get(i));

		}

		System.out.println();
		System.out.println("votre choix : ");

		System.out.println("1. Population d’une ville donnée");
		System.out.println("2. Population d’un département donné");
		System.out.println("3. Population d’une région donnée");
		System.out.println("4. Afficher les 10 régions les plus peuplées");
		System.out.println("5. Afficher les 10 départements les plus peuplés");
		System.out.println("6. Afficher les 10 villes les plus peuplées d’un département");
		System.out.println("7. Afficher les 10 villes les plus peuplées d’une région");
		System.out.println("8. Afficher les 10 villes les plus peuplées de France");
		System.out.println("9. Sortir");

		System.out.println();

		Scanner scanner = new Scanner(System.in);
//		int nb = scanner.nextInt();

		while (true) {
			int nb = scanner.nextInt();

			switch (nb) {
			case 1:
				RecherchePopulationVille rechercheVille = new RecherchePopulationVille(recensement);
				rechercheVille.traiter();
				break;

			case 2:
				RecherchePopulationDepartement rechercheDepartement = new RecherchePopulationDepartement(recensement);
				rechercheDepartement.traiter();
				break;
			case 3:
				RecherchePopulationRegion rechercheRegion = new RecherchePopulationRegion(recensement);
				rechercheRegion.traiter();
				break;
			case 9:
				System.out.println("good bye !");
				System.exit(0);
				break;

			default:
				System.out.println("good bye !");
				System.exit(0);
				break;
			}
		}
	}

}
